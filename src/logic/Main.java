package logic;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Введите текст для транслитерации: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String text1 = "Чаша Цапля Щенок Щётка Объект Лень Яблоко Юбка Ёжик Тыква Йод Туфля Шок Экватор 1234";
        String transliteratedText = Transliteration.transliterateCyrillicToLatin(text);
        System.out.println(transliteratedText);
    }

}
