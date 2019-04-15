package com.desafiojava.desafiojava.rest.controller;

import com.desafiojava.desafiojava.rest.controller.request.UserCreateRequest;
import com.desafiojava.desafiojava.rest.controller.response.UserCreateResponse;
import com.desafiojava.desafiojava.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(
        value = "create",
        method = RequestMethod.POST,
        produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
    )
    public UserCreateResponse create(@RequestBody UserCreateRequest userCreateRequest) {
        return userService.createUser(userCreateRequest);
    }

}
