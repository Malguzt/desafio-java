package com.desafiojava.desafiojava.service.implementations;

import com.desafiojava.desafiojava.rest.controller.request.UserCreateRequest;
import com.desafiojava.desafiojava.rest.controller.response.UserCreateResponse;
import com.desafiojava.desafiojava.service.interfaces.IUserService;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

    @Override
    public UserCreateResponse createUser(UserCreateRequest userCreateRequest) {
        UserCreateResponse response = new UserCreateResponse();
        response.setId(UUID.randomUUID());
        response.setCreated(LocalDateTime.now());
        response.setModified(response.getCreated());
        response.setLast_login(response.getCreated());

        return response;
    }
}
