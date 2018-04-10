package ua.od.hillel.oop.inner_classes;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class MyOuterClassDemo3 {
    public static void main(String[] args) {
        
    }
}
abstract class Pizza {
    abstract public void eat();
}
class Food {
    /* There is no semicolon(;)
     * semicolon is present at the curly braces of the method end.
     */
    Pizza p = new Pizza(){
        public void eat()
        {
            System.out.println("anonymous pizza");
        }
    };
}