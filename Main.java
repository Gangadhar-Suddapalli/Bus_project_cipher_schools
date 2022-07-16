package org.example;

public class Main {
    public static void main(String[] args) {

        LoginSignup loginSignup = new LoginSignup();
        UserOperation userOperation = new UserOperation();
        AdminOperations adminOperations = new AdminOperations();
//        Signing up into the portal
        System.out.println(loginSignup.signup("Gangadhar",123456789,"gangadhar.suddapalli@gmail.com","Kota street","Konakondla","ap","1234567890"));
        System.out.println(loginSignup.signup("jayakrishna",987654321,"jaya@gmail.com","ameerpet","hyderabad","talangana","1234567890"));
        System.out.println(loginSignup.signup("kedhar",528639417,"kedhar@gmail.com","madinaguda","hyderabad","talangana","12345678"));
//        Logging in into the portal
        System.out.println(loginSignup.login("gangadhar.suddapalli@gmail.com","1234567890"));
        System.out.println(loginSignup.login("kedhar@gmail.com","12345678"));
//        Creating new bus details
        adminOperations.createBus("AP 21 CG 3281","self","AP","Delhi");
        adminOperations.createBus("AP 71 CG 1234","driver","UP","HYD");
//        updating username
        userOperation.updateUserName("kedhar@gmail.com","Kedhar");
//        displaying the updated username
        System.out.println(userOperation.findUser("gangadhar.suddapalli@gmail.com"));
    }
}