/**
 * SkyPro. My code dz#3. Переменные.
 *
 * @author Раиль
 * @version dated Apr 17, 2022
 */

public class ExampleThree {
    public static void main(String[] args) {

        System.out.println();
        // Задача 1
        System.out.println("Задание 1");
        byte b = 122;
        short s = 24456;
        int i = 1345456575;
        long l = 332433244234L;
        float f = 2.3341f;
        double d = -1.526685681;
        System.out.println("  b = " + b + "  s = " + s + "  i = " + i + "  l = " + l + "  f = " + f + "  d = " + d);
        System.out.println("");

        // Задача 2
        System.out.println("Задание 2");
        float FirstBoxer = 78.2f;
        float SecondBoxer = 82.7f;
        float Sum = FirstBoxer + SecondBoxer;
        float Difference = (Sum - FirstBoxer) % FirstBoxer;
        System.out.println("  Total weight of boxers = " + Sum + " kg");
        System.out.println("  Boxers weight difference = " + Difference + " kg");
        System.out.println("");

        // Задача 3
        System.out.println("Задание 3");
        int WeightOneBanane = 80;
        float WeightOneMilk = 105 / 100f;
        int WeightOneIceCream = 100;
        int WeightOneEgg = 70;
        byte AmountBanane = 5;
        short AmountMilk = 200;
        byte AmountIceCream = 2;
        byte AmountEgg = 4;
        float TotalWeightGramm = (WeightOneBanane * AmountBanane) + (WeightOneMilk * AmountMilk) +
                (WeightOneIceCream * AmountIceCream) + (WeightOneEgg * AmountEgg);
        float TotalWeightKilogramm = TotalWeightGramm / 1000;
        System.out.println("  Sports breakfast weight in grams = " + TotalWeightGramm + " g");
        System.out.println("  Sports breakfast weight in kilograms = " + TotalWeightKilogramm + " kg");
        System.out.println("");

        // Задача 4
        System.out.println("Задание 4");
        int LoseWeight = 7000;
        int LoseWeightSlow = 250;
        int LoseWeightHigh = 500;
        int DayLoseWeightSlow = LoseWeight / LoseWeightSlow;
        int DayLoseWeightHigh = LoseWeight / LoseWeightHigh;
        int AverageDayLoseWeight = (DayLoseWeightSlow + DayLoseWeightHigh) / 2;
        System.out.println("  Number of days of weight loss at a slow pace = " + DayLoseWeightSlow + " days");
        System.out.println("  Number of days of weight loss at a high pace = " + DayLoseWeightHigh + " days");
        System.out.println("  Number of days of weight loss at a average pace = " + AverageDayLoseWeight + " days");
        System.out.println("");

        // Задача 5
        System.out.println("Задание 5");
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int ChristinaSalary = 76230;
        int MashaSalaryAllowance = MashaSalary + MashaSalary * 10 / 100;
        int DenisSalaryAllowance = DenisSalary + DenisSalary * 10 / 100;
        int ChristinaSalaryAllowance = ChristinaSalary +ChristinaSalary * 10 / 100;
        int MashaSalaryYearDifference = (MashaSalaryAllowance - MashaSalary) * 12;
        int DenisSalaryYearDifference = (DenisSalaryAllowance - DenisSalary) * 12;
        int ChristinaSalaryYearDifference = (ChristinaSalaryAllowance - ChristinaSalary) * 12;
        System.out.print("  Masha earns = " + MashaSalaryAllowance + " in month       ");
        System.out.println("  Masha's salary increased by = " + MashaSalaryYearDifference + " in year");
        System.out.print("  Denis earns = " + DenisSalaryAllowance + " in month       ");
        System.out.println("  Denis's salary increased by = " + DenisSalaryYearDifference + " in year");
        System.out.print("  Christina earns = " + ChristinaSalaryAllowance + " in month   ");
        System.out.println("  Christina's salary increased by = " + ChristinaSalaryYearDifference + " in year");

    }
}