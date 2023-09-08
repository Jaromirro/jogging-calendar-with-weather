package app.dao;

import app.entity.Profile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class ProfileDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveProfile(Profile profile) {
        entityManager.persist(profile);
    }

    public Profile findById(Integer id) {
        return entityManager.find(Profile.class, id);
    }

    public void update(Profile profile) {
        entityManager.merge(profile);
    }

    public void delete(Profile profile) {
        entityManager.remove(entityManager.contains(profile) ? profile : entityManager.merge(profile));
    }
}
