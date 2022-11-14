import java.io.IOException;

public class Cycle {

    public static void main (String[] args) throws IOException {
//цикл for
       /* for (int i = 0; i < 5; i++) { //for показывает что это цикл. Первое создаем переменную i,
            //которой присваиваем значение 0
            //Логика следующая пройти от 0 до 4 пять итераций
            System.out.println("Итерация: " + i);
        }

        for (int i = 0; (char) System.in.read() != 'S'; i++) { //for показывает что это цикл. Первое создаем переменную i,
// с каждым
            //в цикле используется только переменная i. Снаружи она недоступна.
            System.out.println("Итерация: " + i);

            //другая запись неудобный вариант
            /*int i;
            i=0;
            for (;i>5;) {
            System.out.println("Итерация: " + i);
            i++;
            }
             */
            int count = 0;
            while (count < 10) {
                System.out.println(count);
                count++; //с каждой итерацией цикла значение i будет увеличиваться на 1
                //пока будет тру условие count < 10, будет выполняться условие в скобках.
            }

        // Ключевая особенность что одна итерация цикла пройдет в любом случае
            do
         {
            System.out.println(count);
            count++; //с каждой итерацией цикла значение i будет увеличиваться на 1
            //пока будет тру условие count < 10, будет выполняться условие в скобках.
        } while (count < 10);

            while (count < 10) {
            System.out.println(count);
            count++;

            if(count==5) break;
        }

            //if((count%2) != 0) continue; условие с выводом четных цифр. континуе возвращает к началу кода
        //BREAK ВЫЙТИ CONTINUE ВЕРНУТЬСЯ К НАЧАЛУ.


        //}

    }
}
