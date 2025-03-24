public class Facilitator {
    private String name;
    private String password;
    private String email;

    public Facilitator(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String register(String name, String password, String mail) {

        if(name.isEmpty() || password.isEmpty() || email.isEmpty()) {
            return "Error: Name and password are empty";
        }
        else{
            return name;
        }
    }

    public String login(String name, String password, String email) {
        if(name.equals(this.name) && password.equals(this.password) && email.equals(this.email)) {
            return name;
        }
        else{
            throw new IllegalArgumentException("input incorrect");
        }
    }
//    public void createCourses(){
//
//    }


}
