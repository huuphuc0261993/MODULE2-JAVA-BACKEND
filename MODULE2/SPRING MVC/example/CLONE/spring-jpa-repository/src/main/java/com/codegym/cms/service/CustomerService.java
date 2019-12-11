package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;


import java.time.LocalDate;

public interface CustomerService {
    Iterable<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Iterable<Customer> findAllByIsDeleted(int isDeleted);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    void softDelete(@Param("id") Long id, @Param("delete_at") LocalDate delete_at, @Param("deleted_by") String deleted_by);

//    void create(@Param("firstName") String firstName, @Param("lastName") String lastName,@Param("created_at") LocalDate created_at, @Param("created_by") String created_by, @Param("isDeleted") int isDeleted);

    Page<Customer> findAllByIsDeletedEquals(int isDeleted, Pageable pageable);


//    Iterable<Customer> findAllByIsDeletedEquals(int isDeleted,Pageable pageable);



}
