package app.dao;

import app.entity.Equipment;
import app.entity.Trainings;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TrainingsDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveTraining(Trainings training) {
        entityManager.persist(training);
    }

    public Equipment findById(Integer id) {
        return entityManager.find(Equipment.class, id);
    }

    public void update(Trainings training) {
        entityManager.merge(training);
    }

    public void delete(Trainings training) {
        entityManager.remove(entityManager.contains(training) ? training : entityManager.merge(training));

    }

    public List<Trainings> findAll() {
        return entityManager.createQuery("SELECT a FROM Trainings a")
                .getResultList();
    }


}
