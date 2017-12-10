package com.sda.dao;

import com.sda.model.User;
import com.sda.utility.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class UserDAO {
    private Session session = HibernateUtility.getHibernateSession();

    public User getUser(int id) {
        User result = null;

        try {
            session.beginTransaction();
            result = session.get(User.class, id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return result;
    }
}
