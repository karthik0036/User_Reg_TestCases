package com.bridge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.firstName("Jeef");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.firstName("jeef");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.lastName("Hassan");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.lastName("hassan");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLAstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.lastName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.lastName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.email("jeefkarth123@gmail.com");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.email("jfk_sd@");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = userRegistration.firstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.phone("91 9898989898");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.phone("919898989898");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.phone(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.phone("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    //password
    @Test
    public void givenPasswordAsPerRule1_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.pwdRule1("abcAGH123@#");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule1_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.pwdRule1("AG67@");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule1(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule1("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.pwdRule2("ASasc123@");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnFalse() {
        try {
            boolean valid = userRegistration.pwdRule2("abc1234@df1");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule2(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule2("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.pwdRule3("ABCabc123@");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenInvalid_ShouldReturnFalse() {
        try {
            boolean valid = userRegistration.pwdRule3("abcAFG$%");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule3(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule3("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenValid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.pwdRule4("ABCabcB123$");
            Assert.assertEquals(true, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenInvalid_ShouldReturnTrue() {
        try {
            boolean valid = userRegistration.pwdRule4("abcAOP123");
            Assert.assertEquals(false, valid);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule4(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.pwdRule4("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc123@.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator(".abc@abc.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.email(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.email("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            e.printStackTrace();
        }
    }
}
