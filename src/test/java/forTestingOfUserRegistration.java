import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class forTestingOfUserRegistration {
    @Test
    void testCase(){
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserFirstName("Amit"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserLastName("Palandurkar"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserEmailID("amit123.amit@co.co.in"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserPhoneNumber("918888879983"));
        Assertions.assertEquals("Valid",UserRegisterationTesting.getUserPassword("Doremon@1234"));
    }

}
