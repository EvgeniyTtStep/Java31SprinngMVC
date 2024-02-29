package org.itstep.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.itstep.dao.BaseEntity;
import org.itstep.model.Developer;
import org.itstep.util.HibernateUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.itstep.util.HibernateUtil.closeSession;
import static org.itstep.util.HibernateUtil.openSession;

@Repository
public class DeveloperHibernate implements BaseEntity<Developer, Integer> {

    @Override
    public void save(Developer developer) {
        Session session = openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(developer);
        transaction.commit();
        closeSession();

    }

    @Override
    public void update(Developer developer) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<Developer> getAll() {
        Session session = openSession();
        Query<Developer> query = session.createQuery("from Developer ", Developer.class);
        return query.list();
    }

    @Override
    public Developer getById(Integer integer) {
        return null;
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
