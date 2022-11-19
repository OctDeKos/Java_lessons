public class Stroka {
    public static void main (String[] args) {
//тип данных
        String str1 = new String("Hello ");
        String str2 = "World!";
        String str5 = str2.toUpperCase() ; //используем метод увеличения всех букв до заглавных
        String str3 = str1 + str2;
        String str4 = str2.substring(1, 4); //используем substring метод для типа String
        //первый символ говорит с какого индекса начинать передавать и на каком заканчивать.
        System.out.println(str3);
        //когда хотим сравнить строки и получить тру о фолс
        //
        System.out.println(str1.equals(str2)); //метод проверки эквивалентности
        System.out.println(str1.equalsIgnoreCase(str2)); //все равно на размер буквы
        System.out.println(str5);
        int str6 = str3.length(); //узнать длину строки
        System.out.println(str6);
        String[] str7 = {"Hello", "World", "People"};//массив из строк
        System.out.println(str7[2]); //в скобках квадратных идет вызов по индексу из массива

        //string неизменяемый тип данных.

        //переходим в терминал
        //набираем cd src\main\java
        //dir - читаем содержимое директории, проверяем что нужное там есть.
        //clear - очищаем содержимое окна терминала
        System.out.println(args[0] + " " + args[1]);
        //для компиляции в код нужна утилита javac
        //пишем в терминале javac Start.java (нужное имя вместо Start)
        //скомпилировала в байткод
        //ошибок нет
        //далее пишем в терминале java Start Hi USA c добавлением пары аргументов

    }

}
