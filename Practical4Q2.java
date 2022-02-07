// import java.util.*;

// public class Practical4Q2 {
//     public static void main(String[] args){
//         String combineText = "", str;
//         boolean flag = true;
//         Scanner sc = new Scanner(System.in);

//         while(flag) {
//             System.out.println("Enter the word to combine: ");
//             String st = sc.nextLine();
//             combineText = combineText + st;
//             if(st.equalsIgnoreCase("stop")){
//                 flag = false;
//             }
//             System.out.println("The combine text is: " + combineText);

//         }
//     }
// }

// Problem: memory overload, concatenation
// Solution: string builder,

import java.util.*;

public class Practical4Q2 {
    public static void main(String[] args){
        StringBuilder combineText = new StringBuilder();
        String str;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the word to combine: ");
            str = sc.nextLine();
            if(str.equalsIgnoreCase("stop")){
                break;
            }
            combineText.append(str);
            System.out.println("The combine text is: " + combineText);

        }

        sc.close();
    }
}
