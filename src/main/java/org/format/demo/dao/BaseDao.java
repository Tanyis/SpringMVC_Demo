package org.format.demo.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class BaseDao implements  IBaseDao {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory SessionFactory;

    @Autowired
    private Session Session;

    @Override
    public List<?> list(Class clazz) {
        String simpleName=clazz.getSimpleName();
        String hql="from"+clazz.getName()+" "+simpleName;
        return  Session.getSession().createQuery(hql).list();
    }

    @Override
    public List<?> listAll(Class clazz) {
        String simpleName=clazz.getSimpleName();
        String hql="from"+clazz.getName()+" "+simpleName;
        return  Session.getSession().createQuery(hql).list();
    }

    @Override
    public void saveOrUpdate(Object entity) {
        Session.getSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(Object entity) {
        Session.getSession().delete(entity);
    }

    @Override
    public Object getById(Integer id, Class clazz) {

        return Session.getSession().get(clazz,id);
    }

}
