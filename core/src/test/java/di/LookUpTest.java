package di;


import io.ace.springframework.core.ioc.di.lookupmethod.LookUpAppConfig;
import io.ace.springframework.core.ioc.di.lookupmethod.StudentServices;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LookUpAppConfig.class})
public class LookUpTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void whenLookUpMethodCalled_newInstanceReturned() {
        StudentServices service1 = applicationContext.getBean(StudentServices.class);
        StudentServices service2 = applicationContext.getBean(StudentServices.class);

        Assert.assertEquals(service1, service2);

        Assert.assertNotEquals(service1.getStudentNotification(), service2.getStudentNotification());

    }
}
