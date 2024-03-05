package org.itstep.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.itstep.dao.BaseEntity;
import org.itstep.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.itstep.util.HibernateUtil.closeSession;
import static org.itstep.util.HibernateUtil.openSession;

@Repository
public class DeveloperHibernate implements BaseEntity<Developer, Integer> {

    private final SessionFactory sessionFactory;

    @Autowired
    public DeveloperHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Developer developer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(developer);
        transaction.commit();
        //closeSession();
        session.close();
    }

    @Override
    public void update(Developer developer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(developer);
        transaction.commit();
        //closeSession();
        session.close();
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        session.delete(developer);
        transaction.commit();
//        closeSession();
        session.close();
    }

    @Override
    public List<Developer> getAll() {
        Session session = sessionFactory.openSession();
        Query<Developer> query = session.createQuery("from Developer ", Developer.class);
        return query.list();
    }

    @Override
    public Developer getById(Integer id) {
        Session session = sessionFactory.openSession();
        return session.get(Developer.class, id);
    }


    public Developer getByPhone(String phone) {
        for (Developer developer : getAll()) {
            if (developer.getPhone().equals(phone)) {
                return developer;
            }
        }
        return null;
    }

}
