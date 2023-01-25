package com.wysokinski.GitApiFeign.service;

import com.wysokinski.GitApiFeign.DAO.UserData;
import com.wysokinski.GitApiFeign.DTO.UserDTO;
import com.wysokinski.GitApiFeign.client.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserClient userClient;
    private final CounterService counterService;

    public UserDTO getUserByLogin(String login){
        final UserData userData = userClient.getUserData(login);
        final UserDTO userDTO = transformUser(userData);
        counterService.increaseCounterForLogin(login);
        return userDTO;
    }

    private UserDTO transformUser(final UserData userData){
        return UserDTO.builder()
                .id(userData.getId())
                .login(userData.getLogin())
                .name(userData.getName())
                .type(userData.getType())
                .avatarUrl(userData.getAvatarUrl())
                .createdAt(userData.getCreatedAt())
                .calculation(makeCalculation(userData))
                .build();
    }

    private Double makeCalculation(final UserData userData){
        if (userData.getPublicRepos() == 0 || userData.getFollowers()==0){
            throw new ArithmeticException("Public repos or followers are equal to 0");
            }
        return (double)6/(userData.getFollowers()*(2+userData.getPublicRepos()));
    }
}
