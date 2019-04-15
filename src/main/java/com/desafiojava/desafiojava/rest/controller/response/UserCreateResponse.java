package com.desafiojava.desafiojava.rest.controller.response;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserCreateResponse {
    private UUID id;
    private String created;
}
