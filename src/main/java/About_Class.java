public class About_Class {

    public static void main (String[] args) {
        //Классы основа для языка Java (Computer класс)
        //Java - ООП. Фундаментальное понятие которое важно усвоить.
        //класс - это именно структура. Как форма для печенья.

        Computer apple = new Computer( ); //наш класс используем как тип данных (тип данных Computer).
        //Даем название apple. new - выделяем память под новый Computer.

        //обращаемся через переменную apple. И он обладает вот такими параметрами.

        //Computer deal = new Computer();
        //deal.cpu = 4300;
        //deal.isCpu();

        apple.getMemory();
        apple.getName();
        apple.getCpu();



    }
}
