import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        String str = "Hello worldlslks!";
        System.out.println(str);

        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("a sayisini giriniz :");
        a = input.nextInt();
        System.out.println(a);

 */
 /*
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matemetik Notunu Giriniz:");
        mat = input.nextInt();
        System.out.print("Lütfen Fizik Notunu Giriniz:");
        fizik = input.nextInt();
        System.out.print("Lütfen Kimya Notunu Giriniz:");
        kimya = input.nextInt();
        System.out.print("Lütfen Turkce Notunu Giriniz:");
        turkce = input.nextInt();
        System.out.print("Lütfen Tarih Notunu Giriniz:");
        tarih = input.nextInt();
        System.out.print("Lütfen Muzik Notunu Giriniz:");
        muzik = input.nextInt();

        Double result = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;

        System.out.print("Ortalama :" + result);

 */
 /*
        double price, result;
        double kdvPrice = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Giriniz: ");
        price = input.nextDouble();
        result = price * kdvPrice;

        System.out.println("KDV' li tutar : " + result);

 */

        int a,b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Kenari Giriniz: ");
        a = input.nextInt();

        System.out.println("İkinci Kenari Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs: " + c);
    }
}