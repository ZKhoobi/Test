package com.example; /**
 * Created by z.khoobi on 05/09/2016.
 */
import org.json.JSONObject;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User index(@RequestBody User u2) {
        User user1=new User();
        user1.setName(u2.getName());
        user1.setPass(u2.getPass());
        return user1;
    }
}
