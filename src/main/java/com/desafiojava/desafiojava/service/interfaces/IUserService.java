package com.desafiojava.desafiojava.service.interfaces;

import com.desafiojava.desafiojava.rest.controller.request.UserCreateRequest;
import com.desafiojava.desafiojava.rest.controller.response.UserCreateResponse;

public interface IUserService {
    UserCreateResponse createUser(UserCreateRequest userCreateRequest);
}
