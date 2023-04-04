import java.util.Scanner;

public class UcgenMain {
    public static void main(String[] args) {
        int a, b, c;
        double u;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı giriniz : ");
        b = input.nextInt();
        System.out.print("3. Kenarı giriniz : ");
        c = input.nextInt();

        u = (a+b+c)/2;
        area = Math.sqrt (u * (u-a) * (u-b) * (u-c));
        System.out.print("Üçgenin Alanı : " + area);
    }
}
