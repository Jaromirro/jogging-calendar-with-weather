package app.repository;

import app.entity.Trainings;
import app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingsRepository extends JpaRepository<Trainings, Long> {

    @Query("SELECT sum(e.distance) from Trainings e where e.user = ?1")
    int sumDistance(User user);
}