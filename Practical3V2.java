import java.util.*;

class Income_taxCalculation {

    public static void main(String args[]) {
        double income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly gross income");
        income = sc.nextDouble();
        income = Math.floor(income);

        // Create taxation levels
        Taxation[] tax_levels = {
            new Taxation("1st Level: less than 39999", 0, 0, 0, 0),
            new Taxation("2nd Level: 40000 - 59999", 40000, 40000, 0.3, 0.1),
            new Taxation("3rd Level: 60000 - 89999", 60000, 60000, 0.4, 0.1),
            new Taxation("4th Level: 90000 - 119999", 90000, 90000, 0.3, 0.125),
            new Taxation("5th Level: more than 120000", 120000, 90000, 0.3, 0.125)
        };

        for(int i = tax_levels.length - 1; i >= 0;i--){
            if(income >= tax_levels[i].min){
                System.out.printf("Total tax to pay is %.2f in %s", tax_levels[i].calculate_tax(income), tax_levels[i].name);
                break;
            }
        }

    }
}

class Taxation {
    String name;
    double min, first, first_tax, sub_tax;
    final double subsequent = 5000;

    public Taxation(String name, double max, double first, double first_tax, double sub_tax) {
        this.name = name;
        this.min = max;
        this.first = first;
        this.first_tax = first_tax;
        this.sub_tax = sub_tax;
    }

    public double calculate_tax(double income) {
        double subtracted = (income - first);
        return first * first_tax +  subtracted / subsequent * subsequent * sub_tax;
    }

}