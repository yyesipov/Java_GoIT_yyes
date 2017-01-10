package ua.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.model.Customer;
import ua.view.ConsoleHelper;

import java.util.List;


public class HCustomerDAO implements DAO<Customer> {

    Transaction transaction = null;

    @Override
    public void showAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List customers = session.createQuery("FROM Customer").list();
        for (Object customer : customers) {
            ConsoleHelper.writeMessage(customer.toString());
        }
        session.close();
    }

    @Override
    public Customer findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

    @Override
    public void save(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(customer);
        ConsoleHelper.writeMessage(customer.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(customer);
        ConsoleHelper.writeMessage(customer.toString());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.delete(customer);
        transaction.commit();
        session.close();
    }
}
