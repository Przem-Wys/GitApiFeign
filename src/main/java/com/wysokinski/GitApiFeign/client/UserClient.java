package com.wysokinski.GitApiFeign.client;

import com.wysokinski.GitApiFeign.DAO.UserData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "gitUser", url = "${api.github}")
public interface UserClient  {
    @GetMapping(value = "/{name}")
    UserData getUserData(@PathVariable String name);

}
