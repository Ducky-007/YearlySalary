public class Main {
    //input - hours employee works per week
    //amount of money the employee make per hour
    // add input that accounts for vacation days |employee doesn't get paid for vacation days | one vacation day = 8 hours of work
    public static double employeeSalary(double hoursPerWeek, double empHourlyWage, int vacationDays) {
        //if hours per week, vacation days or hourly wage are negative, return -1
        if (hoursPerWeek < 0 || vacationDays < 0 || empHourlyWage < 0) {
            return -1;
        }

        //output gross yearly salary
        double weeklyPaycheck = (hoursPerWeek * empHourlyWage);
        double unpaidTime = vacationDays * empHourlyWage * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    }

    public static void main(String[] arg) {
        double salary = employeeSalary(40, 15, 8);
        System.out.println("Your gross yearly salary is: $" + salary);
    }
}
