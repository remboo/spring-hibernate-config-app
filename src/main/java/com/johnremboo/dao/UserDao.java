package com.johnremboo.dao;

import com.johnremboo.models.User;

import java.util.List;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
public interface UserDao {
    User findById(Long id);
}
