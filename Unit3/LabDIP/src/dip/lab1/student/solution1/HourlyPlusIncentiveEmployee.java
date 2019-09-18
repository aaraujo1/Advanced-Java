package dip.lab1.student.solution1;

/**
 * Demonstrating that other Employees with different wage types can be added to the system.
 * This class would be responsible for Employees whose wages are calculated by salary and get an incentive.
 * It implements an Employee interface.
 *
 * @author andregaraujo
 * @version 1.1
 */
public class HourlyPlusIncentiveEmployee implements Employee{
    private double hourlyRate;
    private double totalHrsForYear;
    private double incentive;


    /**
     * Convenience constructor.
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyPlusIncentiveEmployee(double hourlyRate, double totalHrsForYear, double incentive) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
        setIncentive(incentive);
    }

    //@Override

    /**
     * Method to get an employee's annual wage
     * @return hourly rate * total hours per year plus their incentive as a double
     */
    public double getAnnualWage() {
        return (hourlyRate * totalHrsForYear) + getIncentive();
    }


    /**
     * Method to get an hourly employee's hourly rate
     * @return an hourly employee's hourly rate as a double
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Method to set an hourly employee's hourly rate
     * @param hourlyRate hourly rate as a double
     */
    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     * Method to get an hourly employee's total hours per year
     * @return an hourly employee's total hours per year as a double
     */
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * Method to set an hourly employee's total hours per year w
     * @param totalHrsForYear total hours per year as a double
     */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }

    /**
     * Method to set an incentive
     * @return incentive as a double
     */
    public double getIncentive() {
        return incentive;
    }

    /**
     * Method to get an incentive
     * @param incentive incentive as a double
     */
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
}
