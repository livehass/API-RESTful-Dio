package apirest.dio.Api.projeto.da.dio.service.impl;

import apirest.dio.Api.projeto.da.dio.domain.model.User;
import apirest.dio.Api.projeto.da.dio.domain.repository.UserRepository;
import apirest.dio.Api.projeto.da.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User Create(User user) {
        if(userRepository.findByUsername(user.getUsername()).isPresent() && null != user.getId()){
            throw new IllegalArgumentException("Username already exists");
        }
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        if (!userRepository.existsById(user.getId())) {
            throw new NoSuchElementException("User not found");
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new NoSuchElementException("User not found");
        }
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }


}
