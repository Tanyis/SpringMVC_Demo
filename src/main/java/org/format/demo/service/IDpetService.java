package org.format.demo.service;

import org.format.demo.model.Dept;

import java.util.List;

public interface IDpetService {

    public List<Dept> findAll();

    public void saveOrUpdate(Dept dept);

}
