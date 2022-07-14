package entities;

public class Users {
	private int id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;
    private String role;
    private String eMail;

    private String phoneNumber;

    private String password;

    public Users() {
    }

    public Users(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }
    
    public Users(String firstName, String lastName, int age, boolean isMale, String role, String eMail, String phoneNumber, String password) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    	this.isMale = isMale;
    	this.role = role;
    	this.eMail = eMail;
    	this.phoneNumber = phoneNumber;
    	this.password = password;
    }

    public int getId() {
    	return this.id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return this.isMale;
    }

    public void setMale(boolean male) {
        this.isMale = male;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPassword() {
    	return this.password;
    }

    public void setPassword(String password) {
    	this.password = password;
    }
    
    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", role='" + role + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber +
                '}';
    }
}
