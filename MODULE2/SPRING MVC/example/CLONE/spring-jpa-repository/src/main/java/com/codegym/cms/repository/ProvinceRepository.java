package com.codegym.cms.repository;

import com.codegym.cms.model.Province;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDate;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {

    Iterable<Province>findAllByIsDeleted(int isDeleted);

    @Transactional
    @Modifying
    @Query("update Province p set p.isDeleted=1,p.deleted_at=:deleted_at ,p.deleted_by = :deleted_by  where p.id=:id")
    void softDelete(@Param("id")Long id, @Param("deleted_at")LocalDate deleted_at,@Param("deleted_by")String deleted_by);

    @Transactional
    @Modifying
    @Query("update Province p set p.name=:name, p.updated_at=:updated_at ,p.updated_by = :updated_by  where p.id=:id")
    void save(@Param("id")Long id,@Param("name")String name, @Param("updated_at")LocalDate updated_at,@Param("updated_by")String updated_by);

    @Transactional
    @Modifying
    @Query(value ="insert into provinces (name, created_at, created_by) values (:name, :created_at, :created_by)", nativeQuery = true)
    void create(@Param("name") String name, @Param("created_at") LocalDate created_at, @Param("created_by") String created_by);


}
