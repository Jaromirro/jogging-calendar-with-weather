package app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "training")
@ToString
public class Trainings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private Integer distance;

    private Date date;

    private Time time;

    private Integer hour;

    private Integer minutes;

    private Integer seconds;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    public List<Equipment> tequipments;

    public List<Equipment> getEquipment() {
        return tequipments;
    }

    public void setEquipment(List<Equipment> tequipments) {
        this.tequipments = tequipments;
    }

}
