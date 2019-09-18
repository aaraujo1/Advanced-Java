package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 * HR department in charge of hiring employee
 */
public class HR {
    //list of employees
    private List<Employee> employees;

    //constructor
    public HR() {
        //instantiate ArrayList when HR is constructed
        employees = new ArrayList();
    }

    //method for HR to hire an employee
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName,lastName,ssn);
        employees.add(e);
        orientEmployee(e);
    }

    //HR sets up orientation
    public void orientEmployee(Employee e) {
        //e.doFirstTimeOrientation(e.getCubeId());

        /*FROM SOLUTION*/
        //this method would make EVERY employee have a cubeID of "B101"
        e.doFirstTimeOrientation("B101");
    }

    /*FROM SOLUTION*/
    //method to generate report
    public void outputReport(String ssn) {
        Employee e = null;

        //find employee in list
        for(Employee emp : employees) {
            if(emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                // if not found end method prematurely
                return;
            }
        }

        //if found run report
        if(e.isMetWithHr() && e.isMetDeptStaff()
                && e.isReviewedDeptPolicies() && e.isMovedIn()) {

            e.getReportService().outputReport();

        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
