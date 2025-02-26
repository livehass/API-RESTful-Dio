package apirest.dio.Api.projeto.da.dio.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Feature> features;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @ManyToMany
    @JoinTable(
            name = "tb_user_news",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "news_id")
    )
    @JsonIgnore
    private List<News> news;
}