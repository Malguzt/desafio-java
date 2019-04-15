package com.desafiojava.desafiojava.rest.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.desafiojava.desafiojava.rest.controller.request.UserCreateRequest;
import com.desafiojava.desafiojava.rest.controller.response.UserCreateResponse;
import com.desafiojava.desafiojava.service.interfaces.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @InjectMocks
    private UserController userController;

    @Mock
    private UserCreateRequest userCreateRequest;

    @Mock
    private UserCreateResponse userCreateResponse;

    @Mock
    private IUserService userService;

    @Before
    public void setup() {
        when(userService.createUser(any())).thenReturn(userCreateResponse);
    }

    @Test
    public void shouldReturnUserCreateResponse() {
        UserCreateResponse result = userController.create(userCreateRequest);

        assertEquals(userCreateResponse, result);
    }

    @Test
    public void shouldCallUserService() {
        userController.create(userCreateRequest);

        verify(userService).createUser(userCreateRequest);
    }

}