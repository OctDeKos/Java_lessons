public class Computer {
    //паблик - модификатор, говорит нам что это класс можно использовать в других классах.
    //импортировать.
    //снизу три параметра. Поля класса
    private int memory;
    private int cpu;
    private String name;
    //тут два конструктора. В зависимости от того, что будет передаваться.
    //с параметрами или нет, будет использован тот или иной конструктор.
    Computer() {
        //первый конструктор. Дефолтный конструктор.
    }

        //второй конструктор.
    Computer(int memory, int cpu, String name) {
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;

    }

    //Изначально нулевые значения. Что не корректно. Нужно создать конструктор класса.

    //Добавим возможность просмотра значений.
    //Возможность будет называться методом. Метод создается с помощью void.
    //Чтобы сказать, что это метод нам надо поставить круглые скобки.

    //Методы класса.
    void getCpu() {
        System.out.println("Процессор: " + cpu);
    }

    void getMemory() {
        System.out.println("Память: " + memory);
    }

    void getName() {
        System.out.println("Имя: " + name);
    }

    void setMemory (int m) {
        //метод присваивает мемори какое-то значение
        memory = m;
    }

    void setName (String n) {
        //метод присваивает мемори какое-то значение
        name = n;
    }
    void setCpu (int l) {
        //метод присваивает мемори какое-то значение
        cpu = l;
    }


}