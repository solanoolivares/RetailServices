package mx.com.gigantito.services.service;

import mx.com.gigantito.commons.to.UserTO;
import mx.com.gigantito.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class UserServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.userService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
