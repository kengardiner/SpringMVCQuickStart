package com.djkg.mobileappws.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ui.model.response.UserRest;

import java.awt.*;

@RestController
@RequestMapping("/users") //http:localhost:8080/users

public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value="page", defaultValue = "1") int page,
                           @RequestParam(value="limit", defaultValue = "14") int limit,
                           @RequestParam(value= "sort", required = false) String sort)
    {
        return "get users was called with page = " + page + " and limit = " + limit + " and sort = " + sort;
    }

    @GetMapping(path="/{userId}",
            produces =
                    {MediaType.APPLICATION_XML_VALUE,
                            MediaType.APPLICATION_JSON_VALUE
                    })
    public ResponseEntity<UserRest> getUser(@PathVariable String userId)
    {
        UserRest returnValue = new UserRest();
        returnValue.setEmail("tester@test.com");
        returnValue.setFirstName("Ken");
        returnValue.setLastName("Gardiner");

        return new ResponseEntity<UserRest>(returnValue,HttpStatus.I_AM_A_TEAPOT);
    }

    @PostMapping
    public String createUser()
    {
        return "create user was called";
    }

    @PutMapping
    public String updateUser ()
    {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser ()
    {
        return "delete user was called";
    }
}
