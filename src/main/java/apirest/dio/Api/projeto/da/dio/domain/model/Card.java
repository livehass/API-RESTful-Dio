package apirest.dio.Api.projeto.da.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "available_card_limit", scale = 13, precision = 2)
    private BigDecimal limit;

    @Column(unique = true)
    private String number;
    private String flag;
    private String cvv;
    private String expiration;
}