
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Info.info();
    double a, b;
    try {
        String in = new Scanner(System.in).nextLine();
        System.out.println(Calculator.checkAndCalculate(in));

        } catch(RuntimeException e){
        System.out.println(e.getMessage());
    }



    }
}