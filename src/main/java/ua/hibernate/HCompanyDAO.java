package ua.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.model.Company;
import ua.view.ConsoleHelper;

import javax.persistence.Query;
import java.util.List;


public class HCompanyDAO implements DAO<Company> {

    Transaction transaction = null;

    @Override
    public void showAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Company ");
        List companies = query.getResultList();
        ConsoleHelper.writeMessage(companies.toString());

        session.close();
    }

    @Override
    public Company findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Company company = session.get(Company.class, id);
        session.close();
        return company;
    }

    @Override
    public void save(Company company) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(company);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Company company) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(company);
        ConsoleHelper.writeMessage(company.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Company company = session.get(Company.class, id);
        session.delete(company);
        transaction.commit();
        session.close();
    }
}
