package project2;
//Create Registration Class in which you would have variables such as email,userName and password
// that have an access scope only within its own class.
//After each method separately pass values to set users email, username and password.
//Requiremreating an object of the class, the user should be able to call methods
////and in eents:
//● Valeid mail consider to be only yahoo
//● Valid userName and password cannot be empty and should be of length larger than 6 characters.
// Also valid passwords cannot contain userName

public class Task14Registration {

    private String email;
    private String userName;
    private String password;
    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("Email is valid");
        } else {
            System.out.println("Invalid email");
        }
    }
            public void setUserName(String userName ){
            if (userName.isEmpty()) {
                this.userName = userName;
                System.out.println("invalid");
            } else {
                System.out.println("valid userName");
            }}
         public void setPassword(String password) {
        if (password.length()<6||password.isEmpty()) {
            this.password=password;
            System.out.println("invalid password");
        } else {
            System.out.println("valid password");
        }
    }}







