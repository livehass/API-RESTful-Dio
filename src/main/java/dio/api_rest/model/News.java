package dio.api_rest.model;

import jakarta.persistence.*;

import java.util.List;


@Entity(name = "tb_news")
public class News extends BaseItem {

    @ManyToMany(mappedBy = "news")
    private List<User> users;
}