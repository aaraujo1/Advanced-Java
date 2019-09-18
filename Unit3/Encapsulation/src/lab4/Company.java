package lab4;

/**
 * A company that an HR person hires an employee
 */
public class Company {
    //HR department
    private HR hr;

    //when a Company object is created, an HR department is instantiated
    public Company() {
        //new instance of HR department
        setHr(new HR());
    }

    //when a company hires an employee, it goes through HR
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }


    public HR getHr() {
        return hr;
    }

    public void setHr(HR hr) {
        this.hr = hr;
    }
}
