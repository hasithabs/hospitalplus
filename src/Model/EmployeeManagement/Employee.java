/*
 * This class handles all the operations regarding to the employees 
 * in addition to that this holds all the attributes regarding to the Employees
 */
package Model.EmployeeManagement;

public class Employee {

    private String Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String ConfigPassword;

    // getters and setters for the employee object
      public String getId() {
        return Id;
    }
      
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getConfigPassword() {
        return ConfigPassword;
    }
    
    public void setId(String Id) {
        this.Id = Id;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setConfigPassword(String ConfigPassword) {
        this.ConfigPassword = ConfigPassword;
    }
}
