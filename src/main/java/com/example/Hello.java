package com.example; /**
 * Created by z.khoobi on 05/09/2016.
 */
import org.json.JSONObject;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    //change status here
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @RequestMapping(value = "/user/{UserId}", method = RequestMethod.POST)
    public User index(@RequestBody User u2,/*get parameter here*/@PathVariable("UserId") int id) {
        User user1 = new User();
        if(id==1) {
            user1.setName(u2.getName());
            user1.setPass(u2.getPass());

        }
        else{
            user1.setName("12121");
            user1.setPass("2323");
        }
        return user1;
    }
}
