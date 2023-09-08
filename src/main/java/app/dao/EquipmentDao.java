package app.dao;

import app.entity.Equipment;
import app.entity.Profile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class EquipmentDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveEqu(Equipment equipment) {
        entityManager.persist(equipment);
    }

    public Equipment findById(Integer id) {
        return entityManager.find(Equipment.class, id);
    }

    public void update(Equipment equipment) {
        entityManager.merge(equipment);
    }

    public void delete(Equipment equipment) {
        entityManager.remove(entityManager.contains(equipment) ? equipment : entityManager.merge(equipment));

    }

    public List<Equipment> findAll() {
        return entityManager.createQuery("SELECT b FROM Equipment b")
                .getResultList();
    }
}
