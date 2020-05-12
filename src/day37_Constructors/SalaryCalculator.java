package day37_Constructors;
/*
Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public double salary() {

        return hourlyRate * weeklyHours * 48;

    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {
        return salary() * federalTaxRate;
    }

    public double netIncome() {

        return salary() - (stateTaxRate + federalTax());

    }


    public String toString() {
        return "Weekly Hours: "+weeklyHours+
                "\nHourly Rate: " + hourlyRate +
                "\nState Tax: " + stateTax() +
                "\nFederal Tax: " + federalTax() +
                "\nNet Income: " + netIncome();
    }
}

    class NetIncomeCalculator{

        public static void main(String[] args) {

            SalaryCalculator offer1 = new SalaryCalculator(65,40,0.12,0.08);
            SalaryCalculator offer2 = new SalaryCalculator(75,45,0,0.08);

            System.out.println(offer1.netIncome());
            System.out.println(offer2);






        }






}
