package com.johnremboo.dao;

import com.johnremboo.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
public abstract class AbstractDao<PK extends Serializable, T> {
    @Autowired
    private SessionFactory sessionFactory;

    private final Class<T> persistentClass;

    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession() ;
    }

    public T getByKey(PK key) {
        return getSession().get(persistentClass, key);
    }

    public CriteriaBuilder createEntityCriteria(){
        return getSession().getCriteriaBuilder();
    }
}
