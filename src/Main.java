import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("@ntrel gorcoxutyun@");
            System.out.println();
            System.out.println("1 [ + ] gumarum");
            System.out.println();
            System.out.println("2 [ - ] hanum");
            System.out.println();
            System.out.println("3 [ * ] bazmapatkum");
            System.out.println();
            System.out.println("4 [ / ] bajanum");


            double person = scanner.nextDouble();
            double result;
            if (person == 5) {
                break;
            } else if (person == 1) {
                System.out.println("grel 1 tiv@");
                double x = scanner.nextDouble();
                System.out.println("grel 2 tiv@");
                double y = scanner.nextDouble();
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                result = x + y;
                System.out.println("patasxan@ = " +  result);
            } else if (person == 2) {
                System.out.println("grel 1 tiv@");
                double x = scanner.nextDouble();
                System.out.println("grel 2 tiv@");
                double y = scanner.nextDouble();
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                result = x - y;
                System.out.println("patasxan@ = " +  result);
            } else if (person == 3) {
                System.out.println("grel 1 tiv@");
                double x = scanner.nextDouble();
                System.out.println("grel 2 tiv@");
                double y = scanner.nextDouble();
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                result = x * y;
                System.out.println("patasxan@ = " +  result);
            } else if (person == 4) {
                System.out.println("grel 1 tiv@");
                double x = scanner.nextDouble();
                System.out.println("grel 2 tiv@");
                double y = scanner.nextDouble();
                if (y == 0) {
                    System.out.println("problem@ 0-n a");
                }
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                result = x / y;
                System.out.println("patasxan@ = " +  result);
            } else {
                System.out.println("@tenc gorcoxutyun chka");
            }


        }
        System.out.println("sxal gorcoxutyun");

    }
}