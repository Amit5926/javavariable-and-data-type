import java.util.Scanner;

public class Question5 {
        public static void swap(){
            Scanner sc = new Scanner(System.in);
            int a,b,c;
            a =sc.nextInt();
            b= sc.nextInt();
            System.out.println("first number is "+a);
            System.out.println("second number is "+b);
            c = a;
            a = b;
            b = c;
            System.out.println("swap number is "+a);
            System.out.println("swap number is "+b);

        }

        public static void main(String[] args) {
        swap();
    }
}
