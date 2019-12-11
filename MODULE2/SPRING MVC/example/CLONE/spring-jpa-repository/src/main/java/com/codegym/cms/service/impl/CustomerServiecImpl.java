package com.codegym.cms.service.impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public class CustomerServiecImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }


    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }

    @Override
    public Iterable<Customer> findAllByIsDeleted(int isDeleted) {
        return customerRepository.findAllByIsDeleted(isDeleted);
    }

    @Override
    public void softDelete(@Param("id")Long id,@Param("deleted_at") LocalDate deleted_at, @Param("deleted_by") String deleted_by) {
    customerRepository.softDelete(id, deleted_at,deleted_by);
    }
//
//    @Override
//    public void create(String firstName, String lastName, LocalDate created_at, String created_by,int isDeleted) {
//        try {
//            customerRepository.create(firstName,lastName,created_at,created_by,isDeleted);
//        }catch (Exception e){
//            String mes = e.getMessage();
//        }
//    }

    @Override
    public Page<Customer> findAllByIsDeletedEquals(int isDeleted, Pageable pageable) {
        return customerRepository.findAllByIsDeletedEquals(isDeleted,pageable);
    }
//
//    @Override
//    public Iterable<Customer> findAllByIsDeletedEquals(int isDeleted, Pageable pageable) {
//        return customerRepository.findAllByIsDeleted(isDeleted);
//    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {

        return customerRepository.findAllByFirstNameContaining(firstname, pageable);
    }

}
