// import java.util.*;
 
// public class string {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
 
//        boolean isPrime = true;
//     /*//    for(int i=2; i<=n/2; i++) { 
//     //     if(n % i == 0) {
//     //         isPrime = false;
//     //         break;
//     //     }
//     // }*/

//     if(isPrime) {
//         if(n == 1) {
//             System.out.println("This is neither prime not composite");
//         } else {
//             System.out.println("This is a prime number");
//         }
//     } else {
//         System.out.println("This is not a prime number");
//     }
// }   
// }


/*  
import java.util.*;
public class string{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nu = s.nextInt();
        for(int i = 1;i<=n; i++){
            for(int j=1; j<=nu; j++){
                System.out.print("* ");
            }
            System.out.println("*");

        }
    }
}
*/


// import java.util.*;
// public class string{
//     public static void main(String arg[]){
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int m = s.nextInt();
//         // // outer loop
//         for(int i = 1; i <= n; i++){
//             // // inner loop
//             for(int j=1; j <= m; j++ ){
//                 // // cell -> ( i , j )
//                 if(j == m || i == n ||i == 1||j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// // // Half Pyramid
// import java.util.*;
// public class string{
//     public static void main(String arg[]){
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         // // outer loop
//         for (int i = 1; i <= n; i++){
//            // // inner loop
//             for(int j = 1; j <=i; j++ ){
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//     }
// }

// // Inverted Half Pyramid
// import java.util.*;
// public class string{
//     public static void main(String arg[]){
//         try (Scanner s = new Scanner(System.in)) {
//             int n = s.nextInt();
//             // // outer loop
//             for (int i = n; i >= 1; i--){
//                // // inner loop
//                 for(int j = 1; j <=i; j++ ){
//                     System.out.print("*");
//                 }
//             System.out.println();
//             }
// //         }
// //     }
// // }



// // // // 
// // import java.util.*;
// // public class string{
// //     public static void main(String arg[]){
// //         Scanner s = new Scanner(System.in);
// //         int n = s.nextInt();
// //         // // outer loop
// //         for (int i = 1; i <= n; i++){
// //            // // inner loop for print blank space
// //             for(int j = 1; j <=n-i; j++ ){
// //                 System.out.print(" ");    
// //             }
// //             // // inner loop for printing star
// //             for(int j = 1; j<= i; j++){
// //                 System.out.print("*");
// //             }
// //         System.out.println();
// //         }
// //     }
// // }


// // // half pyramid with number
// // import java.util.*;
// // public class string{
// //     public static void main(String arg[]){
// //         Scanner s = new Scanner(System.in);
// //         int n = s.nextInt();
// //         // // outer loop
// //         for (int i = 1; i <= n; i++){
// //            // // inner loop
// //             for(int j = 1; j <=i; j++ ){
// //                 System.out.print(j+" ");
// //             }
// //         System.out.println();
// //         }
// //     }
// // }


// // // // Rombus
// import java.util.*;
// public class string{
//    public static void main(String args[]) {
//     Scanner s = new Scanner(System.in);
//     int n = s.nextInt();
 
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
 
//            //stars
//            for(int j=1; j<=n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }   
// }



// import java.util.*;
// public class string{
//     public static void main(String arg[]){
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         for (int i = 1; i <=n-i; i++){
//             for(int j= 1; j <=n; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j =1; j<=n;j++ ){
//                 System.out.print(1 + j);
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class string{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();

//         printMyName(name);
//     }
// }



// // adding two number
// import java.util.*;
// public class string{
//     public static int calulator(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String arg[]){
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         int b = s.nextInt();
//         int sum = calulator(a, b);
//         System.out.println("This is sum of your two number:-  " + sum);
        
        
//     }
// }



// import java.util.*;
// public class string{
//     public static int calulator(int a, int b){
//         return a * b;
//     }
//     public static void main(String arg[]){
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         int b = s.nextInt();
//         System.out.println("This is multiply of your two number:-  " + calulator(a, b));
        
        
//     }
// }


// import java.util.*;
// public class string{
//     public static void factor(int n){
//         if (n<0){
//             System.out.println("Invaild Key");
//             return;
//         }
//         int factorial = 1;
//         for(int i = n; i >=1; i--){
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();  
//         factor(n);      
//     }
// }
