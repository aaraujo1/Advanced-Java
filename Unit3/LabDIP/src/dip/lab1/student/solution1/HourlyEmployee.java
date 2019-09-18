package dip.lab1.student.solution1;

/**
 * This class is responsible for Employees whose wages are calculated by hour.
 * It implements an Employee interface.
 *
 * @author andregaraujo
 * @version 1.1
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    /* default constructor. Is this the best way to go? */
    //public HourlyEmployee() {}

    /**
     * Convenience constructor.
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    //@Override

    /**
     * Method to get an employee's annual wage
     * @return hourly rate * total hours per year as a double
     */
    public double getAnnualWage() {
        return hourlyRate * totalHrsForYear;

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
     * Method to set an hourly employee's total hours per year
     * @param totalHrsForYear total hours per year as a double
     */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
}
