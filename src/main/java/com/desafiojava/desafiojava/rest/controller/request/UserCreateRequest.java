package com.desafiojava.desafiojava.rest.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {
    private String name;
    private String email;
    private String password;
    private Phone[] phones;

}
