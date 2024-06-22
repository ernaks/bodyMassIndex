import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = sc.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = sc.nextDouble();
        double index = kilo / (boy * boy);
        System.out.println("Vücut kitle indexiniz: " + index);
    }
}