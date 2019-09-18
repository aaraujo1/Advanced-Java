package lab4;



/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * Taken over by André Araujo on 10/3/2018
 * @version     1.03
 */
public class Startup {
    public static void main(String[] args) {

        Company myCompany = new Company();

        /*Employee employee = new Employee("Peter","Piper","333-33-3333");
        
        employee.doFirstTimeOrientation("A101");
        employee.getReportService().outputReport();*/

        //have company hire employee
        myCompany.hireEmployee("Peter","Piper","333-33-3333");
    }
    
    
}
