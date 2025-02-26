package apirest.dio.Api.projeto.da.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Entity(name = "tb_news")
public class News extends BaseItem {

    @ManyToMany(mappedBy = "news")
    private List<User> users;
}