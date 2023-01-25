package com.wysokinski.GitApiFeign.service;


import com.wysokinski.GitApiFeign.DAO.Counter;
import com.wysokinski.GitApiFeign.repository.CounterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CounterService {
    private final CounterRepository counterRepository;
    public void increaseCounterForLogin(String login){
        final Counter counter = counterRepository.findByLogin(login);

        if (counter != null){
            counter.setRequestCount(counter.getRequestCount()+1);
            counterRepository.save(counter);
        } else {
            final Counter counter1 = Counter.builder()
                    .login(login)
                    .requestCount(1)
                    .build();
            counterRepository.save(counter1);
        }

    }
}
