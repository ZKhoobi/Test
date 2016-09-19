package com.example;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by z.khoobi on 14/09/2016.
 */

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureDataJpa
@DataJpaTest
//@AutoConfigureTestEntityManager
@PropertySource(value = "classpath:application.yml")
@ActiveProfiles("test")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
public class UserDAOTest {
    //    @Autowired
//    private TestEntityManager entityManager;
    int id;
    @Before
    public void setUp() throws Exception {
        ud.save(new User("khoobi","123456"));
        id=ud.save(new User("mohamadi","225")).getId();
    }

    @Autowired
    private UserDAO ud;

    @Test
    public void saveUser() throws Exception {
        User user2=new User("ali alavi", "123");
        ud.save(user2);
        User user = this.ud.findByName("ali alavi");
        assertThat(user.getName()).isEqualTo("ali alavi");
        assertThat(user.getPass()).isEqualTo("123");
    }

    @Test
    public void getUser() throws  Exception{
        User user = this.ud.findByName("khoobi");
        assertThat(user.getPass()).isEqualTo("123456");
    }

    @Test
    public void updateUser() throws  Exception{
        ud.save(new User("user2", "223"));
        User user = this.ud.findByName("user2");
        user.setPass("224");
        ud.save(user);
        User user2 = this.ud.findByName("user2");
        assertThat(user2.getPass()).isEqualTo("224");
    }

    @Test
    public void deleteUser() throws  Exception{
        ud.delete(id);
        User user = this.ud.findByName("mohamadi");
        assertThat(user!=null);
    }

}
