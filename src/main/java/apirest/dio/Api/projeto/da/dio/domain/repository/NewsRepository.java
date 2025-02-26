package apirest.dio.Api.projeto.da.dio.domain.repository;

import apirest.dio.Api.projeto.da.dio.domain.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
