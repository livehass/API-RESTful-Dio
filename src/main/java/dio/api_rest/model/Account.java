package dio.api_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (unique = true)
    private String number;

    private String agency;


    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal additionalLimit;

    @Column(name = "account_limit", precision = 13, scale = 2)
    private BigDecimal accountLimit;
}