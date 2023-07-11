import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisterationTesting {

    public static String getUserFirstName(String firstName){
        Pattern pattern = Pattern.compile("[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        String validOrInvalid;

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("First Name Is Valid.\n");
            validOrInvalid="Valid";
        }else {
            System.out.println("First Name Is InValid.");
            validOrInvalid="InValid";
        }
        return validOrInvalid;
    }
    public static String getUserLastName(String lastName){
        Pattern pattern = Pattern.compile("[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        String validOrInvalid;

        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Last Name Is Valid.\n");
            validOrInvalid="Valid";
        }else {
            System.out.println("Last Name Is InValid.");
            validOrInvalid="InValid";
        }
        return validOrInvalid;
    }
    public static String getUserEmailID(String emailID){
        Pattern pattern = Pattern.compile("[a-z0-9]{3,}.[a-z0-9]{3,}@{1}(abc|bl|co){1}.co.in");
        String validOrInvalid;

        Matcher matcher = pattern.matcher(emailID);
        if (matcher.matches()){
            System.out.print("Email ID Is Valid.\n");
            validOrInvalid="Valid";
        }else {
            System.out.println("Email ID Is InValid.");
            validOrInvalid="InValid";
        }
        return validOrInvalid;
    }
    public static String getUserPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("91{1}[6-9]{1}\\d{9}");
        String validOrInvalid;

        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()){
            System.out.println("Phone Number Is Valid.\n");
            validOrInvalid="Valid";
        }else {
            System.out.println("Phone Number Is InValid.");
            validOrInvalid="InValid";
        }
        return validOrInvalid;
    }
    public static String getUserPassword(String password){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");
        String validOrInvalid;

        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Password Is Valid.\n");
            validOrInvalid="Valid";
        }else {
            System.out.println("Password Is InValid.");
            validOrInvalid="InValid";
        }
        return validOrInvalid;
    }
}
