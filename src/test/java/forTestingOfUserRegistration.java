import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class forTestingOfUserRegistration {
    @Test
    void testCase(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserFirstName("Amit"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserLastName("Palandurkar"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("amit123.amit@gmail.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserPhoneNumber("918888879983"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserPassword("Doremon@1234"));

        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc@yahoo.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc-100@yahoo.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc.100@yahoo.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc111@abc.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc-100@abc.net"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc.100@abc.com.au"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc@1.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc@gmail.com"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("abc+100@gmail.com"));
    }
}