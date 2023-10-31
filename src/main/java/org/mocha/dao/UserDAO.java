package org.mocha.dao;


import jakarta.enterprise.context.ApplicationScoped;
import org.mocha.base.BaseDAO;
import org.mocha.entity.User;

@ApplicationScoped
public class UserDAO extends BaseDAO<User> {
    public UserDAO() {
        super(User.class);
    }
}
