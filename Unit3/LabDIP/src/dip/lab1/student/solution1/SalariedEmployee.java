package dip.lab1.student.solution1;

/**
 * This class is responsible for Employees whose wages are calculated by salary.
 * It implements an Employee interface.
 *
 * @author andregaraujo
 * @version 1.1
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    /** default constructor. Is this the best way to go? */
    //public SalariedEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }


    //@Override
    /**
     * Method to get an employee's annual wage
     * @return annual salary + annual bonus as a double
     */
    public double getAnnualWage() {
        return annualSalary + annualBonus;
    }

    /**
     * Method to get an employee's annual salary
     * @return an employee's annual salary as a double
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Method to set an employee's annual salary
     * @param annualSalary an employee's annual salary
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * Method to get an employee's annual bonus
     * @return an employee's annual bonus as a double
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * Method to set an employee's annual bonus
     * @param annualBonus an employee's annual bonus
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
}
