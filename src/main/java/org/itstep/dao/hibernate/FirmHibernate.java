package org.itstep.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.itstep.dao.BaseEntity;
import org.itstep.model.Firm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.itstep.util.HibernateUtil.openSession;

@Repository
public class FirmHibernate implements BaseEntity<Firm, Integer> {

    private final SessionFactory sessionFactory;

    @Autowired
    public FirmHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Firm firm) {

    }

    @Override
    public void update(Firm firm) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<Firm> getAll() {
        try (Session session = sessionFactory.openSession();) {
            Query<Firm> fromFirm = session.createQuery("from Firm ", Firm.class);
            return fromFirm.list();
        }
    }

    @Override
    public Firm getById(Integer id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Firm.class, id);
        }
    }
}
