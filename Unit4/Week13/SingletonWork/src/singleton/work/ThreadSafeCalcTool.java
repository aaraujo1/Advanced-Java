package singleton.work;

public class ThreadSafeCalcTool {
    /*
    public class SingleInstance {
   private SingleInstance inst = null;
   private SingleInstance(){}
   public static SingleInstance getInstance() {
       synchronized(SingleInstance.class) {
           if(inst == null) {
               inst = new SingleInstance();
           }
}
       return inst;
   }
   public void dostuff() {
    ...
} }
     */

    /*-- FROM CalcTool.Java --*/
    public static int totalBMICalculated = 0;
    public static int numberOfCalculations = 0;

    enum MeasurementSystem {METRIC, ENGLISH}

    private static ThreadSafeCalcTool inst = null;

    /**
     * Constructor
     */
    private ThreadSafeCalcTool() {
    }

    public static ThreadSafeCalcTool getInstance() {
        synchronized (ThreadSafeCalcTool.class) {
            if (inst == null) {
                inst = new ThreadSafeCalcTool();
            }
        }
        return inst;
    }

    /*public void dostuff() {

    }*/


    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == ThreadSafeCalcTool.MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }

    public static double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }
}
