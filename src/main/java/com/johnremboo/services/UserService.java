package com.johnremboo.services;

import com.johnremboo.models.User;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
public interface UserService {
    User findById(Long id);
}
