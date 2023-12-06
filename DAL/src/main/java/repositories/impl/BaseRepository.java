package repositories.impl;

import ORM.VacationContext;
import repositories.interfaces.IRepository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class BaseRepository<T> implements IRepository<T> {

    private VacationContext context;
    private EntityManager entityManager;
    private EntityTransaction transaction;

    public BaseRepository(VacationContext context) {
        this.context = context;

        entityManager = context.getEntityManager();
        transaction = entityManager.getTransaction();
    }

    public List<T> getAll(Class<T> entityClass) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityClass);
        Root<T> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root);

        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    public T get(Class<T> entityClass, int id) {
        return entityManager.find(entityClass, id);
    }

    public void create(T item) {
        transaction.begin();
        entityManager.merge(item);
        transaction.commit();
    }

    public void update(T item) {
        transaction.begin();
        entityManager.persist(item);
        transaction.commit();
    }

    public void delete(T item) {
        transaction.begin();
        entityManager.remove(item);
        transaction.commit();
    }

    public void close() {
        context.close();
    }
}
