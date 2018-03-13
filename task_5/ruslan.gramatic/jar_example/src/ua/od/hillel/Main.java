package ua.od.hillel;


//=======File1======
public class Main {

    public static void main(String[] args) {

        // initialisation
        Pie p1 = new Pie();
        Pie p2 = new Pie();
        Pie p3 = new Pie(100);

        // ======status=======
        System.out.println("=================");
        System.out.println(p1.testo);
        System.out.println(p2.testo);
        System.out.println(p3.testo);
    }
}

//=======File2=======
class Pie {
    static {
        System.out.println("я загрузился и доступен для создания пирогов!");
    }

    public int cena = 250;
    public int testo = 150;
    public int vishnea = 100;

    {
        System.out.println("я начал инициализироваться!" + cena);
    }

    Pie() {
        System.out.println("я создался!");
        System.out.println(this.testo);
    }

    Pie(int testo) {
        this.testo = testo;
        System.out.println(this.testo);
    }


    public void otcusiti5procentov() {
        testo -= Math.random() * 5;
        vishnea -= Math.random() * 3;
    }

    public void skidka() {
        cena -= 50;
    }

    public void showCena() {
        System.out.println("Цена:" + cena);
    }
}
