import java.util.*;

class Income_taxCalculation {
    static final double subsequent = 5000;

    public static void main(String args[]) {
        double income_tax = 0.0, income, first, first_tax, sub_tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly gross income");
        income = Math.floor(sc.nextDouble());

        if (income <= 39999) {
            first = 0;
            first_tax = 0;
            sub_tax = 0;
        } else if (income <= 59999) {
            first = 40000;
            first_tax = 0.3;
            sub_tax = 0.1;
        } else if (income <= 89999) {
            first = 60000;
            first_tax = 0.4;
            sub_tax = 0.1;
        } else if (income <= 119999) {
            first = 90000;
            first_tax = 0.3;
            sub_tax = 0.125;
        } else {
            first = 120000;
            first_tax = 0.3;
            sub_tax = 0.13;
        }

        income_tax = calculate_tax(income, first, first_tax, sub_tax);

        System.out.printf("Total tax to pay is %.2f", income_tax);
        sc.close();

    }

    private static double calculate_tax(double income, double first, double first_tax, double sub_tax) {
        double subtracted = (income - first);
        return first * first_tax +  subtracted / subsequent * subsequent * sub_tax;
    }
}