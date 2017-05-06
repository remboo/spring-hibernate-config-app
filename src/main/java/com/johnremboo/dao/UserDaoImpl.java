package com.johnremboo.dao;

import com.johnremboo.models.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {
    @Override
    public User findById(Long id) {
        return getByKey(id);
    }
}
