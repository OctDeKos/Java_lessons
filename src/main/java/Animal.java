public class Animal {
    //принцип инкапсуляции говорит, что у класса параметры должны быть приватными
    //насследование используем тут.
    private String say = "...";
    private int teeth = 0;
//Нажимаем alt + Ins появляется возможность что-то сгенерировать


    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public static void main (String[] args) {


    }
}
