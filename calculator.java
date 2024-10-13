import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=scanner.nextInt();
        System.out.println("Enter Second Number:");
        int b=scanner.nextInt();

    
        System.out.println("Sum"+ "="+ a+b);
        
        System.out.println("Substraction"+ "="+ (a-b));
    
        System.out.println("Multiplication"+ "="+ a*b);  
    }

}
