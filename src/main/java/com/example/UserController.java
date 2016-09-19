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
public class UserController {

    @Autowired(required = true)
    UserDAO ud;
    @Autowired(required = true)
    CountryDAO cd;
    @Autowired(required = true)
    RoleDAO rd;

    @RequestMapping(value = "/{UserId}",method = RequestMethod.GET)
    public UserDTO getUser(@PathVariable("UserId") int id){
        User user1 = ud.findOne(id);
        return new UserDTO(user1);
    }

    @RequestMapping(method = RequestMethod.POST)
    public int insertUser(@RequestBody UserDTO dtoUser){
        return ud.save(getUser(dtoUser)).getId();
    }

    @RequestMapping(value = "/{UserId}",method = RequestMethod.PUT)
    public int updateUser(@RequestBody UserDTO dtoUser,@PathVariable("UserId") int id){
        User newUser=getUser(dtoUser);
        newUser.setId(id);
        return ud.save(newUser).getId();
    }

    @RequestMapping(value = "/{UserId}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("UserId") int id){
        ud.delete(id);
    }

    @RequestMapping(value = "")
    public List<UserDTO> getAllUsers(){
        List<User> userList=(List<User>) ud.findAll();
        List<UserDTO> dtoList=new ArrayList<>();
        for (User u: userList
             ) {
            dtoList.add(new UserDTO(u));
        }
        return dtoList;
    }

    private User getUser(UserDTO dto)
    {
        User u=new User();
        u.setName(dto.getName());
        u.setPass(dto.getPass());
        Set<Role> roleSet=new HashSet<>();
        for (String s:dto.getRoles()
                ) {
            Role r=rd.getByName(s);
            if(r==null){
                r=new Role(s);
            }
            roleSet.add(r);
        }
        u.setRoleSet(roleSet);
        Country c=cd.getByName(dto.getCountry());
        if(c==null){
            c=new Country(dto.getCountry());
        }
        u.setCountry(c);
        return u;
    }
}
