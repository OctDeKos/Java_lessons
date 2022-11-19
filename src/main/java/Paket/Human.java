package Paket;
import org.example.App;
//импорт пакета. Сначала название пакета, потом наименование класса.

public class Human {
    private String name = "Иван";
//Инкапсуляция - сделали приватной переменную. Теперь чтобы с ней работать надо использовать геттеры и сеттеры.
//Полиморфизм - многообразие форм
    //есть конструктор, который работает по-разному в том или ином случае.
    public Human() {
    }
    public Human(int q) {
        System.out.println(q);
    }
    public Human(String q) {
        System.out.println(q);
    }
}
