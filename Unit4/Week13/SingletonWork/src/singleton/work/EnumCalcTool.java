package singleton.work;

public enum EnumCalcTool {
    /*
    INSTANCE;
   private SingleInstance() {}
   public void dostuff() {
    ...
} }
     */

    INSTANCE;

    /*-- FROM CalcTool.Java --*/
    public static int totalBMICalculated = 0;
    public static int numberOfCalculations = 0;

    enum MeasurementSystem {METRIC, ENGLISH}


    /**
     * Constructor
     */
    EnumCalcTool() {
    }


    /*public void dostuff() {

    }*/


    public double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == EnumCalcTool.MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }

    public double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }
}
