package day46_final_abstract;

public class _03_Credentials {

    final private String username = "Cybertek";
    final private String password = "CyberTek12345";

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    // Since we cannot reassign , so we cannot use setter method for this, but we can use getter method for see purpose only.
}
