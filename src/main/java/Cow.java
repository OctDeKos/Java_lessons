public class Cow extends Animal { //добавили наследование

    //создаем конструктор alt + ins Конструктор выбираем
    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }

    //корова наследует метода основного класса animal.
    //возможно надо переопределить методы или сделать так, чтобы метод коровы работал
    //немного по-другому - делаем публичным, чтобы вызывать в других местах

    public String getSay() {
        String say = super.getSay();
        return say + " New! ";
    }


    //метод му создали
    void mu () {
        System.out.println(getSay() + " во все свои " + getTeeth() + " зуба");
    }
}
