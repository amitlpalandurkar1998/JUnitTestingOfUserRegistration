import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class forTestingOfUserRegistration {
    @Test
    void testFirstName(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserFirstName("Amit"));
    }
    @Test
    void testLastName(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserLastName("Palandurkar"));
    }
    @Test
    void testEmailID(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("amit123.amit@gmail.com"));
    }
    @Test
    void testPhoneNumber(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserPhoneNumber("918888879983"));
    }
    @Test
    void testPassword(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserPassword("Doremon@1234"));
    }

    //multiple entry for the Email Address.

    @Test
    void testEmailID_1(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc@yahoo.com"));
    }
    @Test
    void testEmailID_2(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc-100@yahoo.com"));
    }
    @Test
    void testEmailID_3(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc.100@yahoo.com"));
    }
    @Test
    void testEmailID_4(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc111@abc.com"));
    }
    @Test
    void testEmailID_5(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc-100@abc.net"));
    }
    @Test
    void testEmailID_6(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc.100@abc.com.au"));
    }
    @Test
    void testEmailID_7(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc@1.com"));
    }
    @Test
    void testEmailID_8(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc@gmail.com"));
    }
    @Test
    void testEmailID_9(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc+100@gmail.com"));
    }
}