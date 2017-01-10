package ua.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.model.Developer;
import ua.view.ConsoleHelper;

import java.util.List;


public class HDeveloperDAO<T> implements DAO<Developer> {
    Transaction transaction = null;

    @Override
    public void showAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List developers = session.createQuery("FROM Developer").list();
        for (Object developer : developers) {
            ConsoleHelper.writeMessage(developer.toString());
        }
        session.close();
    }

    @Override
    public Developer findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        session.close();
        return developer;
    }


    @Override
    public void save(Developer developer) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        session.save(developer);
        ConsoleHelper.writeMessage(developer.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Developer developer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(developer);
        ConsoleHelper.writeMessage(developer.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        session.delete(developer);
        session.getTransaction().commit();
        session.close();
    }

}
