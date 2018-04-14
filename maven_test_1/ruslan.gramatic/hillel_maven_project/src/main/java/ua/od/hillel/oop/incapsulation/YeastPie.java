package ua.od.hillel.oop.incapsulation;

import static java.lang.System.out;

/**
 * @author ruslan.gramatic
 */
public class YeastPie implements Pie {

    // инкапсулируем все внутренние состояния(детали пропорций) рецепта приготовления пирога
    private float flourAmount; // количество муки
    private float waterAmount; // количество воды
    private float sugarAmount; // количество сахара
    private float yeastAmount; // количество дрождей
    private float fermentationTime; // время брожжения
    private float raisinsAmount; // количество изюма
    private float ovenCookingTime; // время приготовления в духовке
    private float pieCost = DEFAULT_COST; // стоимость пирога

    public YeastPie() {
        this(DEFAULT_FLOUR_AMOUNT);
    }

    public YeastPie(float flourAmount, float pieCost) {
        this(flourAmount);
        this.pieCost = pieCost;
    }

    public YeastPie(float flourAmount) {
        this.flourAmount = flourAmount;
        fermentationTime = 20;
        ovenCookingTime = 10;
        waterAmount = flourAmount * 0.3f;
        sugarAmount = flourAmount * 0.1f;
        yeastAmount = flourAmount * 0.05f;
        raisinsAmount = flourAmount * 0.15f;
        pieCost = flourAmount / 10;
    }

    public void createPie() {
        out.println("==== Начал готовить пирог с изюмом! ====");

        addFlour(); // добавить муки
        addWater(); // добавить воды
        addSugar(); // добавить сахара
        addYeast(); // добавить дрожди
        waitUntilDoughRise(); // подождать пока тесто подымется
        addRaisins(); // добавить изюма
        putInOven(); // поставить в духовку
        waitCooking(); // подожать приготовления
        takeOutOfOven(); // вынуть из духовки

        out.println("=== Готово! ====");
        out.format("*** Стоимость пирога %s гривен ***\n", pieCost);
    }

    public float getCost() {
        return pieCost;
    }

    // инкапсулируем все действия для приготовления пирога по рецепту и с учетом пропорций
    private void addFlour() {
        out.format("добавил муки %s грамм\n", flourAmount);
    }

    private void addWater() {
        out.format("добавил воды %s милилитров\n", waterAmount);
    }

    private void addSugar() {
        out.format("добавил сахара %s грамм\n", sugarAmount);
    }

    private void addYeast() {
        out.format("добавил дрождей %s грамм\n", yeastAmount);
    }

    private void waitUntilDoughRise() {
        out.format("подождал пока тесто подымется %s минут\n", fermentationTime);
    }

    private void addRaisins() {
        out.format("добавил изюма %s грамм\n", raisinsAmount);
    }

    private void putInOven() {
        out.println("положил в духовку");
    }

    private void waitCooking() {
        out.format("подождал %s минут пока приготовиться\n", ovenCookingTime);
    }

    private void takeOutOfOven() {
        out.println("вытащил из духовки");
    }
}
