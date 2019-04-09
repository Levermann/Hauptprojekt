package com.levermann.dao;

import com.levermann.entityclass.Unternehmen;
import com.levermann.project.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UnternehmenDao {
    public void createUnternehmen(Unternehmen A) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(A);
        transaction.commit();
    }
    public Unternehmen getUnternehmenById (Long Cid) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.get(Unternehmen.class, Cid);
    }
}
