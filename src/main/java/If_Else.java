import java.io.IOException;

public class If_Else {

    public static void main (String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какая буква загадана? ");
        System.out.print("Попытайтесь ее угадать: ");//чтобы каретка не могла переехать на следующую строку.
        //Добавлен дополнительный ввод данных - метод read. После введения метода предлагает добавить throws IOException.
        //Добавил также import вверху
        //без чар идет инт, тут принудительно установлен char
        ch = (char)System.in.read();

        if (ch == answer) {
            System.out.println("Правильно. Поздравляю!");
        } else if ( ch > answer ){
            System.out.println("Перестарался ");
        } else {
            System.out.println("Недостарался ");
        }

    }
}
