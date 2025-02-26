package dio.api_rest.service;



import dio.api_rest.domain.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    User create(User user);

    User update(User user);
    void deleteById(Long id);

    List<User> findAll();

    List<User> findByName(String name);

    boolean existsById(Long id);
}
