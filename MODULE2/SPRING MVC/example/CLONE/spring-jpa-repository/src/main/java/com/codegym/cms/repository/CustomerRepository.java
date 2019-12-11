package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.time.LocalDate;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    Iterable<Customer> findAllByProvince(Province province);

    Iterable<Customer> findAllByIsDeleted(int isDeleted);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    @Transactional
    @Modifying
    @Query("update Customer c set c.isDeleted=1,c.deleted_at=:delete_at ,c.deleted_by = :deleted_by  where c.id=:id")
    void softDelete(@Param("id") Long id, @Param("delete_at") LocalDate delete_at, @Param("deleted_by") String deleted_by);

    Page<Customer> findAllByIsDeletedEquals(int isDeleted, Pageable pageable);

//    @Transactional
//    @Modifying
//    @Query(value ="insert into customers (firstName,lastName, created_at, created_by,isDeleted) values (:firstName,:lastName , :created_at, :created_by,:isDeleted)", nativeQuery = true)
//    void create(@Param("firstName") String firstName, @Param("lastName") String lastName,@Param("created_at") LocalDate created_at, @Param("created_by") String created_by, @Param("isDeleted") int isDeleted);
}
