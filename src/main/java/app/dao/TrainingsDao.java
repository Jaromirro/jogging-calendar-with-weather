package app.dao;

import app.entity.Equipment;
import app.entity.Trainings;
import app.entity.User;
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

    public Trainings findById(Integer id) {
        return entityManager.find(Trainings.class, id);
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

    public List<Trainings> findAllUser(User user) {
        return entityManager.createQuery("SELECT a FROM Trainings a WHERE  a.user = :user")
                .setParameter("user", user)
                .getResultList();
    }

}
