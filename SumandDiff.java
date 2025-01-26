import java.util.Scanner;

public class SumandDiff {

    public static int addNumbers(int a,int b){
        return a+b;
    }

    public static int subNumbers(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        SumandDiff obj = new SumandDiff();

        System.out.println("Sum = "+obj.addNumbers(a,b));
        System.out.println("Sub = "+obj.subNumbers(a,b));
    }
}




