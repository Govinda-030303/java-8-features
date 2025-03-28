package org.example.mapstructexample;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    UserDto userEntityToUserDto(UserEntity userEntity);

}
