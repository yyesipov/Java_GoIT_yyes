package ua.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.model.Project;
import ua.view.ConsoleHelper;

import java.util.List;

public class HProjectDAO implements DAO<Project> {

    Transaction transaction = null;

    @Override
    public void showAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List projects = session.createQuery("FROM Project").list();
        for (Object project : projects) {
            ConsoleHelper.writeMessage(project.toString());
        }
        session.close();
    }

    @Override
    public Project findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Project project = session.get(Project.class, id);
        session.close();
        return project;
    }

    @Override
    public void save(Project project) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(project);
        ConsoleHelper.writeMessage(project.toString());
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Project project) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(project);
        ConsoleHelper.writeMessage(project.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Project project = session.get(Project.class, id);
        session.delete(project);
        transaction.commit();
        session.close();
    }
}
