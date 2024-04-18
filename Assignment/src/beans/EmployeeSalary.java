package beans;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class EmployeeSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryId;
    private double basicSalary;
    private double dearnessAllowance;
    private double houseRentAllowance;
    private double yearlyBonus;
    @OneToOne
    private Employee employee;

    public EmployeeSalary() {
    }

    public EmployeeSalary(int salaryId, double basicSalary, double dearnessAllowance, double houseRentAllowance, double yearlyBonus, Employee employee) {
        this.salaryId = salaryId;
        this.basicSalary = basicSalary;
        this.dearnessAllowance = dearnessAllowance;
        this.houseRentAllowance = houseRentAllowance;
        this.yearlyBonus = yearlyBonus;
        this.employee = employee;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getDearnessAllowance() {
        return dearnessAllowance;
    }

    public void setDearnessAllowance(double dearnessAllowance) {
        this.dearnessAllowance = dearnessAllowance;
    }

    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
