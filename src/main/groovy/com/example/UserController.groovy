package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by z.khoobi on 12/09/2016.
 */
@RequestMapping(value = "/users")
@RestController
class UserController {

    @Autowired//(required = true) is default
    UserDAO ud
    @Autowired
    CountryDAO cd
    @Autowired
    RoleDAO rd

    @RequestMapping(value = "/{UserId}",method = RequestMethod.GET)
    UserDTO getSingleUser(@PathVariable("UserId") int id){
        new UserDTO(ud.findOne(id))
    }

    @RequestMapping(method = RequestMethod.POST)
    public int insertUser(@RequestBody UserDTO dtoUser){
        return ud.save(getUser(dtoUser)).id
    }

    @RequestMapping(value = "/{UserId}",method = RequestMethod.PUT)
    public int updateUser(@RequestBody UserDTO dtoUser,@PathVariable("UserId") int id){
        User newUser=getUser(dtoUser)
        newUser.setId(id)
        return ud.save(newUser).id
    }

    @RequestMapping(value = "/{UserId}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("UserId") int id){
        ud.delete(id)
    }

    @RequestMapping(value = "")
    public List<UserDTO> getAllUsers(){
        ud.findAll().collect {new UserDTO(it)}
    }

    private User getUser(UserDTO dto)
    {
        new User(name: dto.name, pass: dto.pass,
                roleSet: dto.roles.collect{rd.getByName(it)?:new Role(it)},
                country: cd.getByName(dto.country)?:new Country(dto.country))
    }
}
