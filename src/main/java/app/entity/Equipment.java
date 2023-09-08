package app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer type;

    private String name;

    private Long km;

    private Integer weather;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
