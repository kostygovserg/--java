import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
        System.out.println("Введите любое целое число a: ");
		Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        
        System.out.println("Введите любое целое число b: ");
		Scanner B = new Scanner(System.in);
                int b = B.nextInt();
        if(a>b){
            System.out.println ("a > b");
        }
        else if(a<b){
            System.out.println ("a < b");
        }
        else{
            System.out.println ("a = b");
        }
System.out.print ("a + b = ");
System.out.println (a+b);
System.out.print ("a - b = ");
System.out.println (a-b);
System.out.print ("a / b = ");
System.out.println (a/b);
System.out.print ("a * b = ");
System.out.println (a*b);
    }
}