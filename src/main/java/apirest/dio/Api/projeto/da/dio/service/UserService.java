package apirest.dio.Api.projeto.da.dio.service;

import apirest.dio.Api.projeto.da.dio.domain.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    User Create(User user);

    User update(User user);
    void deleteById(Long id);

    List<User> findAll();

    List<User> findByName(String name);

    boolean existsById(Long id);
}
