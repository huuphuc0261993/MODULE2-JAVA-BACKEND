package com.codegym.repository.impl;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.isDelete=0", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Customer model) {
        if(model.getId() != null){

            em.merge(model);
        } else {
            em.persist(model);
        }
    }

//    @Override
//    public void remove(Long id) {il.List;


@Override
public void remove(Long id) {
    //TypedQuery<Customer> query = em.createQuery( "update Customer c  set c.isDelete = 1 where  c.id=:id", Customer.class);
    try{
        Query query = em.createQuery( "update Customer c  set c.isDelete = 1,c.deleted_by=:deleted_by where  c.id=:id");
        query.setParameter("deleted_by","phuc");
        query.setParameter("id", id);
        int rs = query.executeUpdate();
    }catch (Exception ex){
        String mess= ex.getMessage();
    }
}

}
