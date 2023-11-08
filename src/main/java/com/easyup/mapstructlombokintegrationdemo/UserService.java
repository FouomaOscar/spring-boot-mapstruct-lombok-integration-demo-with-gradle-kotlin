package com.easyup.mapstructlombokintegrationdemo;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);
    List<UserDTO> getAllUser();
}
