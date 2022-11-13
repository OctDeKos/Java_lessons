public class Arithmetic {
    public static void main (String[] args) {

        int num1 = 5;
        int num2 = 4;

        int result = num1 + num2;// с минусом аналогично. Умножение *
        //Тут отобразиться результат = 9
        System.out.println("Результат сложения чисел: " + result);
        //Тут будет сложение строк Результат: 54
        System.out.println("Результат сложения строк: " + num1 + num2);
        double num3 = 12; //при использовании int не будет значений после точки
        double num4 = 5;
        double result2 = num3/num4;
        int num5 = 11;
        int num6 = 5;
        int result3 = num5 % num6;

        System.out.println("Результат деления: " + result2);
        System.out.println("Результат деления (вывести остаток от деления): " + result3);
        //Операции инкремента (int num1=num2++) и дикремента (int num2=num1--)
        //применение инкремента к числу является недопустимым. Только к переменныим
        int num7 = 8;
        int num8 = num7++;
        int num9 = num8;
        //++ означает +1 , заменено так как проще считается. Если ставить ++ перед, то будет 1+...
        //тут будет выведено 8
        System.out.println("Результат num9: " + num9);
        //в этом примере будем посчитан результат, в отличие от прошлого.
        int num10 = 8;
        int num11 = ++num10;
        int num12 = num11;
        //++ означает +1 , заменено так как проще считается. Если ставить ++ перед, то будет 1+...
        //тут будет выведено 8
        System.out.println("Результат num12: " + num12);
        //Операции сравнения. Один знак равно - присваивание.
        int num13 = 2;
        int num14 = 3;
        //если нам1 равняется нам2
        if (num13 == num14) {
            System.out.println("Результат : " + num14);
        } else {
            System.out.println("Они не равны");
        }
        //Проверка что они не равны. Еще как вариант <=,>=. Возвращать должен тру о фолс. =)
        if (num13 != num14) {
            System.out.println("Они не равны дважды");
        } else {
            System.out.println("Они равны :" + num14);
        }
        //Пример двойного условия, когда оба тру.
        if (num13 != num14 && num12 == num11) {
            System.out.println("Они не равны 13-14, а равны 11 и 12");
        } else {
            System.out.println("Они равны");
        }
        //Пример двойного условия "ИЛИ"
        if (num13 == num14 || num12 != num11) {
            System.out.println("ИЛИ1");
        } else {
            System.out.println("ИЛИ2");
        }
    }
}
