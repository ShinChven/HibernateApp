package com.ShinChven.hibernatestandalone;

import com.ShinChven.hibernatestandalone.entity.DataEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;

import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ShinChven on 2015/1/3.
 */
public class Application {

    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
//        open hibernate session
        HibernateEntityManagerFactory entityManagerFactory = (HibernateEntityManagerFactory) Persistence.createEntityManagerFactory("hibernate_standalone");
        SessionFactory sessionFactory = entityManagerFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
//        persist entity
        DataEntity data = new DataEntity();
        data.setName("text1");
        session.save(data);
//        finish
        session.flush();
        session.close();
        logger.log(Level.INFO, String.format("data_id: %s", data.getId()));
    }
}
