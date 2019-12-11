package com.codegym.cms.service.impl;

import com.codegym.cms.model.Province;
import com.codegym.cms.repository.ProvinceRepository;
import com.codegym.cms.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).get();
    }

     @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public Iterable<Province> findAllByIsDeleted(int isDeleted) {
        return provinceRepository.findAllByIsDeleted(isDeleted);
    }

    @Override
    public void softDelete(Long id, LocalDate deleted_at, String deleted_by) {
        provinceRepository.softDelete(id,deleted_at,deleted_by);
    }

    @Override
    public void save(Long id, String name, LocalDate updated_at, String updated_by) {
        provinceRepository.save(id,name,updated_at,updated_by);
    }

    @Override
    public void create(String name, LocalDate created_at, String created_by) {
        try{
        provinceRepository.create(name,created_at,created_by);}
        catch (Exception e){
           String message=e.getMessage();
        }
    }


}
