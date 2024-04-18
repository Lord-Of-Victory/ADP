package client;

import beans.Employee;
import beans.EmployeeName;
import beans.EmployeeSalary;
import beans.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Resource.class);
        configuration.addAnnotatedClass(EmployeeName.class);
        configuration.addAnnotatedClass(EmployeeSalary.class);

        try {
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Employee employee=new Employee();
            EmployeeName empName= new EmployeeName(1,"FN","MN","LN",employee);
            EmployeeSalary empSalary = new EmployeeSalary(1,100.02,12.5,15.03,11.96,employee);
            List<Resource> resources = new ArrayList<Resource>();
            Resource resource1=new Resource(1,"Desktop",new Date(19102002),employee);
            Resource resource2=new Resource(1,"Printer",new Date(20112020),employee);
            resources.add(resource1);
            resources.add(resource2);

            session.save(empName);
            session.save(empSalary);
            session.save(resource1);
            session.save(resource2);
            String projName="AppDev";
            String city="NGP";
            employee.setEmployeeName(empName);
            employee.setEmployeeSalary(empSalary);
            employee.setResources(resources);
            employee.setJoiningDate(new Date(19102022));
            employee.setAddressCity("Nagpur");
            employee.setProjectName("FlutterDev");
            session.save(employee);
            transaction.commit();
            session.close();
            sessionFactory.close();


        }catch (Exception e){
            System.out.println("Cause: "+e.getCause());
            System.out.println("Message: "+e.getMessage());
        }finally {
            System.out.println("Done Executing ..... Exiting");
        }
    }
}
