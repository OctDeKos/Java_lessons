public class Employe {
    public Head head;

    public Employe() {
        this.head = new Head();
    }

    void say() {
        System.out.println("Мой голос" + head.voice);
    }
    class Head { //вложенный класс

        String voice = " тонкий"; //параметр
    }


}
