package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by z.khoobi on 19/09/2016.
 */
public interface CountryDAO extends CrudRepository<Country,Integer> {
    public Country getByName(String name);
}
