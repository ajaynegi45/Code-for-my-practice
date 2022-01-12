//// multiplication of two no.
// public class firstclass {
//     public static void main(String[] args) {
//         int number1 = 12;
//         int number2 = 2;
//         int num_3 = number1 * number2;
//         System.out.print( num_3);

//     }
// }

//// Wish Happy New Year
// public class firstclass {
//     public static void main(String[] args) {
//          String year = "2021";
//          System.out.print("Happy New Year " + year.replace('1','2'));

//     }
// }

// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//          String year = "2021";
//          System.out.print(year.getType());
//     }
// }

// // Finding area of Circle With Radius
// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             int a = input.nextInt();
//             System.out.print(3.1415926535 * a * a);
//         }
//     }
// }

// // Table Maker
// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             int a = input.nextInt();
//             System.out.println(a + " x" + " 1" +" = " + a*1 );
//             System.out.println(a + " x" + " 2" +" = " + a*2 );
//             System.out.println(a + " x" + " 3" +" = " + a*3 );
//             System.out.println(a + " x" + " 4" +" = " + a*4 );
//             System.out.println(a + " x" + " 5" +" = " + a*5 );
//             System.out.println(a + " x" + " 6" +" = " + a*6 );
//             System.out.println(a + " x" + " 7" +" = " + a*7 );
//             System.out.println(a + " x" + " 8" +" = " + a*8 );
//             System.out.println(a + " x" + " 9" +" = " + a*9 );
//             System.out.println(a + " x" + " 10" +" = " + a*10 );
//         }
//     }
// }

// // Voter Checker 
// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             int age = input.nextInt();
//             if (age > 17){
//                 System.out.println("You Can Vote");
//             }
//             else{
//                 System.out.println("You Cannot Vote");
//             }

//         }
//     }
// }

/* Odd Even finder */
// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             int num = input.nextInt();
//             if (num % 2 == 0){
//                 System.out.println("Even");
//             }
//             else{
//                 System.out.println("Odd");
//             }

//         }
//     }
// }

// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             int a = input.nextInt();
//             int b = input.nextInt();
//             if ( a == b ){
//                 System.out.println("Equal");
//             }
//             else{
//                 if ( a > b){
//                 System.out.println("a is greter Than B ");
//             }
//                 else {
//                     System.out.println("A is less than b");
//                 }

//             }

//         }
//     }
// }

/* Calculator  */
// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//              int b = sc.nextInt();
//              int c = sc.nextInt();
//              switch (c){
//                  case 1: System.out.println( a + b );
//                  break;
//                  case 2 : System.out.println(a - b);
//                  break;
//                  case 3 : System.out.println(a / b);
//                  break;
//                  case 4 : System.out.println(a * b);
//                  break;
//                 default: System.out.println("Invaild Key ");
//              }
//         }
//     }
// }

// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//             for(int a = 0; a <10; a++){
//                 System.out.println(a + "x"+"1" + );

//             }
//         }
//     }
// }

//import java.util.*;

// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner s = new Scanner(System.in)) {
//             int a = s.nextInt();

//             int sum = 0;
//             for (int i = 0; i <= a; i++) {
//                 sum = sum + i;
//             }
//             System.out.println(sum);
//         }
//     }
// }

// import java.util.*;

// public class firstclass {
//     public static void main(String[] args) {
//         try (Scanner s = new Scanner(System.in)) {
//             int n = s.nextInt();
//             for (int i=1; i<11; i++) {
//                 System.out.println(n+" x "+i+" = "+i*n);
//             }

//         }
//     }
// }

// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//             int input;
//             for (int i = 1; i <= input; i++) {
//                 if (i % input == 0) {
//                     System.out.println(i);
//                 }else{
//                     continue;
//                 }
//             } 
//     }
// }

// import java.util.*;
// public class firstclass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int input;
//         do {
//             int marks = sc.nextInt();
//             if (marks >= 90 && marks <= 100) {
//                 System.out.println("This is Good");
//             } else if (marks >= 60 && marks <= 89) {
//                 System.out.println("This is also Good");
//             } else if (marks >= 0 && marks <= 59) {
//                 System.out.println("This is Good as well");
//             } else {
//                 System.out.println("Invaild Key");
//             }
//             System.out.println("Want to continue ? (yes(1) or no(0))");
//             input = sc.nextInt();
//         } while (input == 1);

//     }

// }




// public class firstclass {
// public static void main(String args[]) {
// int n = 25;

// for (int i = 1; i <= n; i++) {
// if (i % 2 == 0) {
// System.out.println(i);
// }
// }
// }
// }

// public class firstclass {
// public static void main(String[] args) {
// for(; ;) {
// System.out.println("Apna College");
// }

// }
// }
