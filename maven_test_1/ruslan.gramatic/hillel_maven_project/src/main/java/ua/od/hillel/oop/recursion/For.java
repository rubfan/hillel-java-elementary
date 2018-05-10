package ua.od.hillel.oop.recursion;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public abstract class For {
    private int endValue;

    public For(int startValue, int endValue) {
        this.endValue = endValue;
        goCycle(startValue, "@");
    }

    abstract void runBody(int i);

    private void goCycle(int i, String s) {
        if (i < endValue) {
            runBody(i);
            System.out.println(s);
            goCycle(++i, s + "@");
        }
    }
}
