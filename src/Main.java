import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,alan,cevre,u;
        Scanner ucgen = new Scanner (System.in);

        System.out.print("Lütfen 1. Kenar Uzunluğunu Giriniz: ");
        a = ucgen.nextDouble();

        System.out.print("Lütfen 2. Kenar Uzunluğunu Giriniz: ");
        b = ucgen.nextDouble();

        System.out.print("Lütfen 3. Kenar Uzunluğunu Giriniz: ");
        c = ucgen.nextDouble();


        cevre = (a+b+c);
        u = (cevre)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.print("Üçgenin Alanı: " + alan);


    }
}
