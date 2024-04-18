package beans;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
public class EmployeeName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nameId;
    private String firstName;
    private String middleName;
    private String lastName;
    @OneToOne
    private Employee employee;

    public EmployeeName() {

    }

    public EmployeeName(int nameId, String firstName, String middleName, String lastName, Employee employee) {
        this.nameId = nameId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.employee = employee;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

