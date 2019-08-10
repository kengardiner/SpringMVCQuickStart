package com.djkg.mobileappws.userservice;

import ui.model.request.UserDetailsRequestModel;
import ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}

