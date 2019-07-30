package org.format.demo.service.impl;

import org.format.demo.dao.BaseDao;
import org.format.demo.model.Dept;
import org.format.demo.service.IDpetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IDpetServiceImpl implements IDpetService {

    @Autowired
    private BaseDao BaseDao;

    @Override
    public List<Dept> findAll() {
       return (List<Dept>) BaseDao.listAll(Dept.class);
    }

    @Override
    public void saveOrUpdate(Dept dept) {
        BaseDao.saveOrUpdate(Dept.class);
    }
}
