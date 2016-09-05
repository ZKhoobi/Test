package com.example; /**
 * Created by z.khoobi on 05/09/2016.
 */
import org.json.JSONObject;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/user/*")
@RestController
public class UserBusiness {

    @RequestMapping(value = "{UserId}",method = RequestMethod.GET)
    public User getUser(@PathVariable("UserId") int id){
        User user=null;
        return user;
    }

    @RequestMapping(value = "{UserId}",method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable("UserId") int id){
        User user=null;
        return user;
    }

    @RequestMapping(value = "{UserId}",method = RequestMethod.PUT)
    public void updateUser(@RequestBody User newUser,@PathVariable("UserId") int id){
        User user=null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public int insertUser(@RequestBody User newUser){
        User user=null;
        int id=0;
        return id;
    }
    //change status here
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @RequestMapping(value = "/user/{UserId}", method = RequestMethod.POST)
//    public User index(@RequestBody User u2,/*get parameter here*/@PathVariable("UserId") int id) {
//        User user1 = new User();
//        if(id==1) {
//            user1.setName(u2.getName());
//            user1.setPass(u2.getPass());
//
//        }
//        else{
//            user1.setName("12121");
//            user1.setPass("2323");
//        }
//        return user1;
//    }
}
