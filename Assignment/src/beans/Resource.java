package beans;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resourceId;
    private String resourceName;
    private Date dateOfIssue;
    @ManyToOne
    private Employee employee;

    public Resource(){

    }

    public Resource(int resourceId, String resourceName, Date dateOfIssue, Employee employee) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.dateOfIssue = dateOfIssue;
        this.employee = employee;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
