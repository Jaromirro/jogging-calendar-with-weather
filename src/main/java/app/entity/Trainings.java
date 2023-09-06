package app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "training")
public class Trainings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Double distance;

    private Date date;

    private LocalDateTime timeStart;

    private String timeEnd;

}
