package com.easyup.mapstructlombokintegrationdemo;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
}
