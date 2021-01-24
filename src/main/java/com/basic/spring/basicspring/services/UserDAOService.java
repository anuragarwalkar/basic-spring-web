package com.basic.spring.basicspring.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.basic.spring.basicspring.entity.User;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        // Open transaction
        entityManager.persist(user);
        // Close transaction
        return user.getId();
    }
}
