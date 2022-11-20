package Paket2;

public class Main {
    public static void main (String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Начало");
            nums[7]= 10;

        } catch (ArrayIndexOutOfBoundsException exc) { //переполнение массива, попытка обратиться за пределы массива
            System.out.println("О нет у нас ошибка!");
        }
        catch (ArithmeticException exc) {
            System.out.println("Арифмитическая ошибка"); //арифметическая ошибка
            //try catch помогает пользователю грамматно обрабатывать исключения.
            //ArrayStoreException //ввести в массив элемент несовместимый тип.
            //ClassCastException - Недопустимое приведение типов
            //IllegalArgumentException - недопустимый параметр
            //NegativeArraySizeException - массив становится отрицательного размера
            //NullPointerException//Недопустимое использование пустой ссылки
            //TypeNotPresentException - неизвестный тип
            //UnsupportedOperationException - неподдедерживаемая операция
            //ClassNotFoundException класс не найден
            //InstantiationException - пытаемся создать абстрактные классы
            //Ошибки бывают довольно разные. Ошибку надо обработать, сделать исключение.
        };
        //вариант один - перейти в вывод описания ошибки,
        //вариант второй - перейти дальше в программе, продолжить выполнение, а не аварийно выключать программу
    }
}
