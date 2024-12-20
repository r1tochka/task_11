package logic;

import java.util.HashMap;
import java.util.Map;

public class Transliteration {

    public static String transliterateCyrillicToLatin(String text) {
        // Создаем словарь для транслитерации
        Map<Character, String> translitAlphabet = new HashMap<>();
        translitAlphabet.put('а', "a");
        translitAlphabet.put('б', "b");
        translitAlphabet.put('в', "v");
        translitAlphabet.put('г', "g");
        translitAlphabet.put('д', "d");
        translitAlphabet.put('е', "e");
        translitAlphabet.put('ё', "e");
        translitAlphabet.put('ж', "zh");
        translitAlphabet.put('з', "z");
        translitAlphabet.put('и', "i");
        translitAlphabet.put('й', "i");
        translitAlphabet.put('к', "k");
        translitAlphabet.put('л', "l");
        translitAlphabet.put('м', "m");
        translitAlphabet.put('н', "n");
        translitAlphabet.put('о', "o");
        translitAlphabet.put('п', "p");
        translitAlphabet.put('р', "r");
        translitAlphabet.put('с', "s");
        translitAlphabet.put('т', "t");
        translitAlphabet.put('у', "u");
        translitAlphabet.put('ф', "f");
        translitAlphabet.put('х', "h");
        translitAlphabet.put('ц', "ts");
        translitAlphabet.put('ч', "ch");
        translitAlphabet.put('ш', "sh");
        translitAlphabet.put('щ', "shch");
        translitAlphabet.put('ъ', "ie");
        translitAlphabet.put('ы', "y");
        translitAlphabet.put('ь', "");
        translitAlphabet.put('э', "e");
        translitAlphabet.put('ю', "iu");
        translitAlphabet.put('я', "ia");

        translitAlphabet.put('А', "A");
        translitAlphabet.put('Б', "B");
        translitAlphabet.put('В', "V");
        translitAlphabet.put('Г', "G");
        translitAlphabet.put('Д', "D");
        translitAlphabet.put('Е', "E");
        translitAlphabet.put('Ё', "E");
        translitAlphabet.put('Ж', "Zh");
        translitAlphabet.put('З', "Z");
        translitAlphabet.put('И', "I");
        translitAlphabet.put('Й', "I");
        translitAlphabet.put('К', "K");
        translitAlphabet.put('Л', "L");
        translitAlphabet.put('М', "M");
        translitAlphabet.put('Н', "N");
        translitAlphabet.put('О', "O");
        translitAlphabet.put('П', "P");
        translitAlphabet.put('Р', "R");
        translitAlphabet.put('С', "S");
        translitAlphabet.put('Т', "T");
        translitAlphabet.put('У', "U");
        translitAlphabet.put('Ф', "F");
        translitAlphabet.put('Х', "H");
        translitAlphabet.put('Ц', "TS");
        translitAlphabet.put('Ч', "CH");
        translitAlphabet.put('Ш', "SH");
        translitAlphabet.put('Щ', "SHCH");
        translitAlphabet.put('Ъ', "IE");
        translitAlphabet.put('Ы', "Y");
        translitAlphabet.put('Ь', "");
        translitAlphabet.put('Э', "E");
        translitAlphabet.put('Ю', "IU");
        translitAlphabet.put('Я', "IA");


        StringBuilder result = new StringBuilder(); //у него чуть больший функционал, чем у самой строки, поэтому используем его
        String a = new String();
        StringBuilder b = new StringBuilder();

        // Проходим по каждому символу строки
        for (char symbol : text.toCharArray()) {
            // Если символ есть в словаре, заменяем его
            if (translitAlphabet.containsKey(symbol)) {
                result.append(translitAlphabet.get(symbol));
            } else {
                // Иначе оставляем символ без изменений
                result.append(symbol);
            }
        }
        return result.toString();
    }

}