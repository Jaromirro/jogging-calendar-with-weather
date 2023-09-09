package app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@Table (name="equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@NotNull
    private String type;
@NotNull
@Size(min = 5, max = 20)
    private String name;
@NotNull
    private Long km;
@NotNull
    private Integer weather;

    @OneToOne
    private User user;


}
