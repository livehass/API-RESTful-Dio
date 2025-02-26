package apirest.dio.Api.projeto.da.dio.service.impl;

import apirest.dio.Api.projeto.da.dio.domain.model.News;
import apirest.dio.Api.projeto.da.dio.domain.model.User;
import apirest.dio.Api.projeto.da.dio.domain.repository.NewsRepository;
import apirest.dio.Api.projeto.da.dio.domain.repository.UserRepository;
import apirest.dio.Api.projeto.da.dio.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final NewsRepository newsRepository;

    public UserServiceImpl(UserRepository userRepository, NewsRepository newsRepository) {
        this.userRepository = userRepository;
        this.newsRepository = newsRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Transactional
    @Override
    public User create(User user) {
        if(userRepository.findByUsername(user.getUsername()).isPresent() && user.getId() != null){
            throw new IllegalArgumentException("Username already exists");
        }
        if (user.getNews() != null) {
            user.setNews(user.getNews().stream()
                    .map(news -> {
                        if (news.getId() == null) {
                            return newsRepository.save(news);
                        }
                        return news;
                    })
                    .collect(Collectors.toList()));
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