package ua.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.model.Skill;
import ua.view.ConsoleHelper;

import java.util.List;

public class HSkillDAO implements DAO<Skill> {

    Transaction transaction = null;

    @Override
    public void showAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List skills = session.createQuery("FROM Skill").list();
        for (Object skill : skills) {
            ConsoleHelper.writeMessage(skill.toString());
        }
        session.close();
    }

    @Override
    public Skill findById(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, id);
        session.close();
        return skill;
    }

    @Override
    public void save(Skill skill) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(skill);
        ConsoleHelper.writeMessage(skill.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Skill skill) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(skill);
        ConsoleHelper.writeMessage(skill.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, id);
        session.delete(skill);
        transaction.commit();
        session.close();
    }
}
