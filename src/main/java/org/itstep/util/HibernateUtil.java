package org.itstep.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Session session = null;
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static Session openSession(){
         session = sessionFactory.openSession();
         return  session;
    }

    public static void closeSession(){
        session.close();
    }




}
