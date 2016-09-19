package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by z.khoobi on 19/09/2016.
 */
public interface RoleDAO extends CrudRepository<Role,Integer> {
    public Role getByName(String name);
}
