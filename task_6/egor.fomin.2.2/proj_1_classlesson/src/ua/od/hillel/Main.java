package ua.od.hillel;

/**07.03.2018 class_lesson*/

//====File1====
public class Main {

    public static void main(String[] args) {
        // initialisation
        Pie.skidka();
        System.out.println(Pie.cena);
        Pie p1 = new Pie();
        Pie p2 = new Pie();
        Pie p3 = new Pie();


        //====15min======
        p1.otkusit5procentov();
        p1.otkusit5procentov();
        p1.otkusit5procentov();

        p2.otkusit5procentov();

        p3.otkusit5procentov();
        p3.otkusit5procentov();
        p3.otkusit5procentov();
        p3.otkusit5procentov();
        p3.otkusit5procentov();

        //======status
//
//        System.out.println(p1.cena);
//        System.out.println(p2.cena);
//        System.out.println(p3.cena);

        p1.skidka2();

        //======status

        System.out.println(p1.cena);
        System.out.println(p2.cena);
        System.out.println(p3.cena);

        p1.skidka2();
//        p1.skidka2();
//        p1.skidka2();
        p1.showCena();
        p2.showCena();
        p3.showCena();

    }
}

//=====File2====
class Pie {
    {
        System.out.println("я загрузился и доступен для создания пирогов!");
    }


    public static int cena = 250;
    public int testo = 100;
    public int vishnea = 100;

    {
        System.out.println("я начал инициализироваться!" + testo);
    }

    Pie() {  // Конструктор (такое же название как и класс)
        System.out.println("я создался!");
    }

    public void otkusit5procentov() {
        testo -= Math.random() * 5;
        vishnea -= Math.random() * 3;
        }

    public static void skidka() { //есть "static" -> относится к объекту!
        cena -= 50;
    }

    public void skidka2(){ //нет "static" -> относится к классу!
        cena -= 30;
    }

    public void showCena(){
        System.out.println("Цена: " + cena);
    }
}

