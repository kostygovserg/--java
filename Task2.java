import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Введите любое слово или фразу: ");
		Scanner A = new Scanner(System.in);
        String a = A.next();
        
        System.out.println("Введите ещё одно любое слово или фразу: ");
		Scanner B = new Scanner(System.in);
        String b = B.next();
        if(a.equals(b)){
            System.out.println ("Строки идентичны");
        }
        else{
            System.out.println ("Строки не идентичны"); 
        }
    }
}