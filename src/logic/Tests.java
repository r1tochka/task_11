    package logic;


    import java.util.ArrayList;
    import java.util.List;

    public class Tests {

        List<String> tests = new ArrayList<>() {{
            add("Михаил Юрьевич Лермонтов");
            add("ГЕРОЙ НАШЕГО ВРЕМЕНИ");
            add("Я ехал на перекладных из Тифлиса. " +
                    "Вся поклажа моей тележки состояла из одного небольшого чемодана, " +
                    "который до половины был набит путевыми записками о Грузии. " +
                    "Большая часть из них, к счастию для вас, потеряна, а чемодан с остальными вещами, " +
                    "к счастью для меня, остался цел.");
            add("Год написания: 1839");
            add("Съешь ещё этих мягких французских булок, да выпей же чаю");

        }};


        public void getTests(){
            for (String test : tests){
                System.out.println(Transliteration.transliterateCyrillicToLatin(test));
            }
        }

        public static void main(String args[]){
            Tests testInstance = new Tests();
            testInstance.getTests();
        }
    }
