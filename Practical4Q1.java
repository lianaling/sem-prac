// public class Practical4Q1 {
//     public static void main(String[] args){
//         double total = 0.4;
//         for (int n = 0; n < 100; n++){
//             total += 0.4;
//         }
//         System.out.println("total = " + total);
//     }
// }

// Problem of performance: for loop takes a lot of resources & more time - slower
// Imprecise floating point using for loop
// LOSS OF PRECISION
// Prevention: use multiplication

class Test {
    public static void main(String[] args){
        double total = 0.4 * 101;
        System.out.println("total = " + total);
    }
}

// class Test {
//     public static void main(String[] args) {
// 	    BigDecimal total=new BigDecimal("0.4").multiply(new BigDecimal("101"));
// 		System.out.println("Hello World"+total);
// 	}
// }