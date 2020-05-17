import java.util.Scanner;

public class Palindrome {

    // Функция "main"
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Сканнер
        String str; // Переменная для входной строки
        str = in.nextLine(); // Считываем входную строку
        String delimeter = " "; // Переменная "разделитель"
        args = str.split(delimeter); // Разделяем входную строку на массив слов
        for (int i = 0; i < args.length; i++) { // Проверяем каждое слово
            String s = args[i];
            if (isPalindrome(s))
                System.out.println(s + " является полиндромом");
            else
                System.out.println(s + " не является полиндромом");
        }
    }
    // Функция, которая разворачивает слово
    public static String reverseString(String s) {
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--)
            a += s.charAt(i);
        return a;
    }
    // Функция, которая сравнивает перевёрнутую строку с исходной
    public static boolean isPalindrome(String s) {
        String a = reverseString(s);
        if (a.equals(s))
            return true;
        else
            return false;
    }
}