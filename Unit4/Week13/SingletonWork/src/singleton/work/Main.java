package singleton.work;

public class Main {

    public static void main(String[] args) {
        /*-- With CalcTool --*/
        System.out.println("With CalcTool");
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + CalcTool.calcBMI(70, 195, CalcTool.MeasurementSystem.ENGISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + CalcTool.calcBMI(1.7, 84, CalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + CalcTool.calcBMI(63, 135, CalcTool.MeasurementSystem.ENGISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + CalcTool.calcBMI(2.1, 141, CalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calculated in this Run is " + CalcTool.averageBMI());

        /*-- With ThreadSafeCalcTool --*/
        System.out.println("\nWith ThreadSafeCalcTool");

        /*System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + ThreadSafeCalcTool.calcBMI(70, 195, ThreadSafeCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + ThreadSafeCalcTool.calcBMI(1.7, 84, ThreadSafeCalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + ThreadSafeCalcTool.calcBMI(63, 135, ThreadSafeCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + ThreadSafeCalcTool.calcBMI(2.1, 141, ThreadSafeCalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calculated in this Run is " + ThreadSafeCalcTool.averageBMI());*/

        ThreadSafeCalcTool threadSafeCalcTool = ThreadSafeCalcTool.getInstance();
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + threadSafeCalcTool.calcBMI(70, 195, ThreadSafeCalcTool.MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + threadSafeCalcTool.calcBMI(1.7, 84, ThreadSafeCalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + threadSafeCalcTool.calcBMI(63, 135, ThreadSafeCalcTool.MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + threadSafeCalcTool.calcBMI(2.1, 141, ThreadSafeCalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calculated in this Run is " + threadSafeCalcTool.averageBMI());

        /*-- With EnumCalcTool --*/
        System.out.println("\nWith EnumCalcTool");

        /*System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + EnumCalcTool.calcBMI(70, 195, EnumCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + EnumCalcTool.calcBMI(1.7, 84, EnumCalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + EnumCalcTool.calcBMI(63, 135, EnumCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + EnumCalcTool.calcBMI(2.1, 141, EnumCalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calculated in this Run is " + EnumCalcTool.averageBMI());*/


        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(70, 195, EnumCalcTool.MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(1.7, 84, EnumCalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(63, 135, EnumCalcTool.MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + EnumCalcTool.INSTANCE.calcBMI(2.1, 141, EnumCalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calculated in this Run is " + EnumCalcTool.INSTANCE.averageBMI());
    }
}
