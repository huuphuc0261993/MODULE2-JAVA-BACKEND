package com.codegym.cms.service;

import com.codegym.cms.model.Province;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);

    Iterable<Province>findAllByIsDeleted(int isDeleted);

    void softDelete(@Param("id")Long id, @Param("deleted_at") LocalDate deleted_at, @Param("deleted_by")String deleted_by);

    void save(@Param("id")Long id,@Param("name")String name, @Param("updated_at")LocalDate updated_at,@Param("updated_by")String updated_by);

    void create(@Param("name") String name, @Param("created_at") LocalDate created_at, @Param("created_by") String created_by);

}
