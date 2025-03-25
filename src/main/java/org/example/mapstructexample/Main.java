package org.example.mapstructexample;

public class Main {
    public static void main(String[] args) {
        // Create a sample UserEntity
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("John Doe");
        userEntity.setEmail("john.doe@example.com");

        UserDto userDto=UserMapper.INSTANCE.userEntityToUserDto(userEntity);

        // Print the UserDTO
        System.out.println("UserDTO ID: " + userDto.getId());
        System.out.println("UserDTO Name: " + userDto.getName());
    }
}
