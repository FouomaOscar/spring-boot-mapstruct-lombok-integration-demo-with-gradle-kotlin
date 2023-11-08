package com.easyup.mapstructlombokintegrationdemo;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user.setCreationDate(LocalDateTime.now());
        user.setUpdateDate(LocalDateTime.now());

        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    public List<UserDTO> getAllUser() {
        return userRepository.findAll().stream().map(userMapper::toDto).toList();
    }
}
