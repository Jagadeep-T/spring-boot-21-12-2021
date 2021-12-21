package com.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.cruddemo.entity.Location;

@Repository
public class LocationDAOHibernateImpl implements LocationDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Location> findAllLocation() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Location> theQuery = currentSession.createQuery("from Location", Location.class);
        List<Location> departments = theQuery.getResultList();
        return departments;
    }

    @Override
    public Location findLocationById(int locationId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Location department = currentSession.get(Location.class, locationId);
        return department;
    }

    @Override
    public void save(Location theDepartment) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theDepartment);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
//        Query theQuery = currentSession.createQuery("delete from Department where id=:departmentId");
        Query theQuery = currentSession.createQuery("update department set ='INACTIVE' where id=:departmentId");
        theQuery.setParameter("departmentId", theId);
        theQuery.executeUpdate();
    }
}
