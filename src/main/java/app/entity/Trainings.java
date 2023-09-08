package app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
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

    private java.sql.Date date;

    private java.sql.Time time;

    private Integer hour;

    private Integer minutes;

    private Integer seconds;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
