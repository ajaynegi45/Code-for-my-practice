//!Question 1:- Enter 3 numbers from the user & make a function to print their average.
//! Function type Solution 

// import java.util.*;
// public class practice {
//     public static int average(int a, int b,int c) {
//         return ((a+b+c)/ 3);
//     }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int c = sc.nextInt();
//       System.out.println(average(a, b, c));
//    }
// }

/* without funtion type Solution */
// import java.util.*;
// public class practice {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int c = sc.nextInt();
//       int average = (a + b + c) / 3;
//       System.out.println(average);
//    }
// }

//!Question 2:- Write a function to print the sum of all odd numbers from 1 to n. */
// import java.util.*;
// public class practice {
//     public static void odd(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum = sum + i;
//             }
//             System.out.println(sum);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         odd(n);
//     }
// }



// import java.util.*;
// public class practice {
//     public static void printSum(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum = sum + i;
//             }
//         }
//         System.out.println(sum);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printSum(n);
//     }
// }



//! Question 3:- Write a function which takes in 2 numbers and returns the greater of those two ? 
//! Simple Code with function
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if( a > b){
//             System.out.println(a);
//         }
//         else if(a ==b){
//             System.out.println("Both number are equal !!");
//         }
//         else{
//             System.out.println(b);
//         }
//     }
// }

/*Code With Function Option */
// import java.util.*;
// public class practice{
//     public static int greater(int a,int b) {
//         if ( a > b){
//            return a;
//         }
//         else {
//             return b;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(greater(a, b));
//     }
// }




//! Question 4:- Write a function that takes in the radius as input and returns the circumference of a circle. 
//! Simple Code
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         double circumference = 2 * 3.1415926535 * n;
//         System.out.println(circumference);

//     }
// } 


/**
* ! gcckfkffkuyfuyfuyfyfyufuykfutfuyfuyfuy
* ? kftdkudukdkudkutdkudud
** Code with function option 
*/

// import java.util.*;
// public class practice{
//     public static double radius(double a){
//         return 2 * 3.1415926535*a ; 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         double a = sc.nextInt();
//         System.out.println(radius(a));
        
//     }
// }


//! Question 4:-  Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
//! Simple Code
//  import java .util.*;
//  public class practice{
//      public static void main (String args[]){
//          Scanner sc = new Scanner (System.in);
//          int age = sc.nextInt();
        //  if (age > 18 && age < 101){
        //      System.out.println("You can Vote.");
        //  }
        //  else if (age > 100){
        //      System.out.println("You are over Age");
        //  }
        //  else if (age == 18){
        //      System.out.println("You can Vote Guru");
        //  }
        //  else{
        //      System.out.println("You are minor. You cannot vote.");
        //  }
//      }
//  }

 //! Function code
//  import java.util.*;
//  public class practice{
//      public static boolean voter(int age ){
//         if (age > 17){
//             return true;
//             }
//             return false;
//     }
//      public static void main (String args[]){
//          Scanner sc = new Scanner(System.in);
//          int age = sc.nextInt();
//          System.out.println(voter(age));
//      }
//  }