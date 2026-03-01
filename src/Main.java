import java.util.Scanner;

public class Main{
    public static void checkAge(int age){
        if (age>=18 ){
            System.out.println("you are eligible 18+");
        } else {
            System.out.println("you are under age");
        }
    }

    //method to print pattern
    public static void printPattern(int n){
        System.out.println("Star Pattern ");
        for (int i =1; i<=n; i++){
            int j = 1;
            while (j<=i){
                System.out.print("* ");
                j++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        // Taking age as a input
        System.out.print("enter your name ");
        String name = sc.nextLine();

        // Taking age as a input
        System.out.print("Enter your age ");
        int age = sc.nextInt();

        checkAge(age); //calling method

        //switch method
        System.out.println("choose option 1 and 2 subtract ");
        int choice =sc.nextInt();

        System.out.print("enter the first number ");

        int a = sc.nextInt();
        System.out.print("enter the second number ");
        int b = sc.nextInt();  // to get the output

        switch(choice){
            case 1:
                System.out.println("addition = "+(a+b));
            case 2:
                System.out.println("subtractiom = "+ (a-b));
                break;
            default:
                System.out.println("Invalid choices ");



        }

        // Array example
        int [] numbers ={10,20,30,40,50,60};
        int sum =0;

        int i = 0;
        while (i< numbers.length) {
            sum+= numbers [i];


            i++;
        }

        System.out.println("sum of array = " + sum);
        // Pattern
        printPattern(5);

        sc.close();
    }
}