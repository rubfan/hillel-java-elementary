package ua.od.hillel;

import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.CargoMilitaryAirplane;
import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.PrivateCargoCar;
import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.PrivateTrainCar;
import ua.od.hillel.oop.incapsulation.Pie;
import ua.od.hillel.oop.incapsulation.YeastPie;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        App app = new App();

        //app.showAbstractionExample();

        //app.showIncapsulationExample();

        app.showPolymorphismExample();
    }

    private void showPolymorphismExample() {
        B b = new B();
        A a = b; // здесь происходит формальное преобразование типа: B => A

        int c = a.f(10); // ??? какой из f(...) будет вызван ???
        System.out.println(c);
    }

    private void showIncapsulationExample() {
        System.out.println("-----------Pie 1------------");
        Pie pie = new YeastPie();
        pie.createPie();
        System.out.println("-----------Pie 2------------");
        Pie pie2 = new YeastPie(300);
        pie2.createPie();
    }

    private void showAbstractionExample() {
        System.out.println("-----------Vehicle 1------------");
        CargoMilitaryAirplane cma = new CargoMilitaryAirplane();
        cma.start();
        cma.stop();
        cma.callTrap();


        System.out.println("-----------Vehicle 2------------");
        PrivateCargoCar pcc = new PrivateCargoCar();
        pcc.getMaxWeight();
        pcc.move(10,1,10, 20);
        pcc.start();
        pcc.stop();


        System.out.println("-----------Vehicle 3------------");
        PrivateTrainCar ptc = new PrivateTrainCar();
        System.out.println("min: " + ptc.getNumberOfWheel());
        System.out.println("max: " + ptc.getMaxWeight());

        float parentMaxWeight = ((PrivateCargoCar)ptc).getMaxWeight();// позднее связывание
        System.out.println("max: " + parentMaxWeight);

        PrivateCargoCar pcc2 = ptc;
        System.out.println("max: " + pcc2.getMaxWeight());// позднее связывание
    }
}

class A {
    int x = 3;

    int f(int a) {
        return a + x;
    }
}

class B extends A {
    int y = 8;

    int f(int s) {
        return s * x;
    }
}


