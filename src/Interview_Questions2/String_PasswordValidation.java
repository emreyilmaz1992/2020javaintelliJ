package Interview_Questions2;

public class String_PasswordValidation {

    /*
     Write a return method that can verify if a password is valid or not.

    requirements:

    1. Password MUST be at least have 6 characters and should not contain space

    2. PassWord should at least contain one upper case letter

    3. PassWord should at least contain one lowercase letter

    4. Password should at least contain one special characters

    5. Password should at least contain a digit
     */

    public static void main(String[] args) {

        String password = "Ne122ksdjfsdjflksdjflksdjflksjflkjsdlkfjsdlkfjs@";
        System.out.println(passWordValidation(password));





    }
    public static boolean passWordValidation(String password){

        String lowercase    = "(.*[a-z].*)";
        String uppercase    = "(.*[A-Z]*.)";
        String numbers      = "(.*[0-9]*.)";
        String specialChars = "(.*[-/, :-@].*)";

        boolean hasLower = password.matches(lowercase),hasUpper = password.matches(uppercase),
                hasNumbers = password.matches(numbers),hasSpecialChars = password.matches(specialChars);
        boolean valid = false;



        if(password.length()>=6 && !password.contains(" ")){
            if(hasLower & hasUpper&hasNumbers&hasSpecialChars){

                valid =true;
            }
        }

        return valid;



    }

}
