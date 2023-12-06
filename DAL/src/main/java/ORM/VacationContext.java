package ORM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class VacationContext {
    private EntityManagerFactory entityManagerFactory;

    public VacationContext(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManagerFactory.close();
    }
}
