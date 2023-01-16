import java.util.Scanner;

public class Question3 {
    public static void multiply(){
        Scanner sc = new Scanner(System.in);
    int a,b,c;

        System.out.println("enter the first number is");
    a= sc.nextInt();
        System.out.println("enter the seconde number");
    b = sc.nextInt();
    c = a*b;
        System.out.println("multiply number is "+c);
}

    public static void main(String[] args) {
multiply();
    }
}
