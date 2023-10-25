import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {
        welcome();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = s.nextInt();
        System.out.println("Enter your second number: ");
        int b = s.nextInt();
        sum(a, b);
        string();

    }
    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void welcome(){
        String str = "Welcome to system";
        int i;
        for(i=1; i<2; i++){
            System.out.println(str);
        }
    }
    public static String string(){
        String str = "Buy";
        System.out.println(str);
        return str;
    }
}
