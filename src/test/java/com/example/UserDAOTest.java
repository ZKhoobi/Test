package com.example;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by z.khoobi on 14/09/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@AutoConfigureDataJpa
//@DataJpaTest
@AutoConfigureTestEntityManager
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
public class UserDAOTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserDAO ud;

    @Test
    public void saveTest() throws Exception {
        User user2=new User("ali alavi", "123");
        //user2.setId(2);
        //this.entityManager.persist(user2);
        ud.save(user2);
        User user = this.ud.findByName("ali alavi");
        assertThat(user.getName()).isEqualTo("ali alavi");
        assertThat(user.getPass()).isEqualTo("123");
    }

}
