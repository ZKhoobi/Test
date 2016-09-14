package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by z.khoobi on 12/09/2016.
 */
public interface UserDAO extends CrudRepository<User,Integer>{
    User findByName(String name);
}
