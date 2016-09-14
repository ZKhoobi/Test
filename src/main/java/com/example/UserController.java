package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by z.khoobi on 12/09/2016.
 */
@RequestMapping(value = "/users")
@RestController
public class UserController {

    @Autowired(required = true)
    UserDAO ud;

    @RequestMapping(value = "/{UserId}",method = RequestMethod.GET)
    public User getUser(@PathVariable("UserId") int id){
        User user1 = ud.findOne(id);
        return user1;
    }

    @RequestMapping(method = RequestMethod.POST)
    public int insertUser(@RequestBody User newUser){
        ud.save(newUser);
        int id=ud.findByName(newUser.name).getId();
        return id;
    }

    @RequestMapping(value = "/{UserId}",method = RequestMethod.PUT)
    public int updateUser(@RequestBody User newUser,@PathVariable("UserId") int id){
        newUser.setId(id);
        ud.save(newUser);
        return id;
    }

    @RequestMapping(value = "/{UserId}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("UserId") int id){
        ud.delete(id);
    }

    @RequestMapping(value = "")
    public List<User> getAllUsers(){
        return (List<User>) ud.findAll();
    }
}
