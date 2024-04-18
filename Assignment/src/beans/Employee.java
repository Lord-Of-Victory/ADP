package beans;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int employeeId;

        private Date joiningDate;
        @OneToOne(mappedBy = "employee")
        private EmployeeName employeeName;
        @OneToOne(mappedBy = "employee")
        private EmployeeSalary employeeSalary;
        @OneToMany(mappedBy = "employee")
        private List<Resource> resources;
        private String projectName;
        private String addressCity;

        public Employee(){

        }

    public Employee(int employeeId, Date joiningDate, EmployeeName employeeName, EmployeeSalary employeeSalary, List<Resource> resources, String projectName, String addressCity) {
        this.employeeId = employeeId;
        this.joiningDate = joiningDate;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.resources = resources;
        this.projectName = projectName;
        this.addressCity = addressCity;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(EmployeeName employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeSalary getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(EmployeeSalary employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }
}
