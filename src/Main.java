import java.util.Scanner;

public class Main {

    // Bir sayının palindrom olup olmadığını kontrol eden fonksiyon
    static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Sayının tersini bulma işlemi
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        // Orijinal sayı ile tersi karşılaştırılır
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınır
        System.out.print("Bir sayı girin: ");
        int inputNumber = scanner.nextInt();

        // isPalindrom fonksiyonu ile palindrom kontrolü yapılır
        if (isPalindrom(inputNumber)) {
            System.out.println(inputNumber + " bir palindrom sayıdır.");
        } else {
            System.out.println(inputNumber + " bir palindrom sayı değildir.");
        }
    }
}
