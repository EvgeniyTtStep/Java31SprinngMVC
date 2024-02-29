package org.itstep.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.itstep.dao.BaseEntity;
import org.itstep.model.Firm;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.itstep.util.HibernateUtil.openSession;

@Repository
public class FirmHibernate implements BaseEntity<Firm, Integer> {
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
        try (Session session = openSession();) {
            Query<Firm> fromFirm = session.createQuery("from Firm ", Firm.class);
            return fromFirm.list();
        }
    }

    @Override
    public Firm getById(Integer id) {
        try (Session session = openSession()) {
            return session.get(Firm.class, id);
        }
    }
}
