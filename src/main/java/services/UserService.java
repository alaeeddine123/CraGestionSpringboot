package services;


import dtos.UserRegistrationDto;
import entities.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserEntity save(UserRegistrationDto registrationDto);
}
