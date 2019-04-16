package com.desafiojava.desafiojava.service.implementations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.desafiojava.desafiojava.rest.controller.request.UserCreateRequest;
import com.desafiojava.desafiojava.rest.controller.response.UserCreateResponse;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;

    @Mock
    private UserCreateRequest userCreateRequest;

    @Test
    public void shouldReturnNewUUID() {
        UserCreateResponse result = userService.createUser(userCreateRequest);

        //TODO: Fix powermock compatibility to mock static UUID methods
        assertNotNull(result.getId());
    }

    @Test
    public void shouldHaveCurrentTime() {
        //TODO: Fix powermock compatibility to mock static time methods
        LocalDateTime beforeTime = LocalDateTime.now();

        UserCreateResponse result = userService.createUser(userCreateRequest);

        assertTrue(result.getCreated().isAfter(beforeTime));
    }

    @Test
    public void shouldHaveSameCreatetAndModified() {
        UserCreateResponse result = userService.createUser(userCreateRequest);

        assertEquals(result.getCreated(), result.getModified());
    }

    @Test
    public void shouldHaveSameCreatetAndLastLogin() {
        UserCreateResponse result = userService.createUser(userCreateRequest);

        assertEquals(result.getCreated(), result.getLast_login());
    }

}