package dio.api_rest.domain.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String description;



}
