package com.ddy.data.vue;

import com.ddy.data.vue.Dao.PersonRepository;
import com.ddy.data.vue.Model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.List;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class RepositoryTest {

    @Autowired
    PersonRepository repository;

    private static Logger log = LoggerFactory.getLogger(RepositoryTest.class);

    @Test
    public void testpersonDao() throws Exception {
        List<Person> list= repository.findAll();
        Assert.assertNotNull(list);
        log.info("This is my first respository date: "+list.get(0).toString());
    }
}
