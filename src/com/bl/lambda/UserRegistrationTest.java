package com.bl.lambda;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenlasttNameWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.lastName();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
