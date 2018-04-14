package ua.od.hillel.oop.inner_classes;

/**
 * Created by ruslangramatic on 4/4/18.
 */
class MyOuterClassDemo2 {
    private int x= 1;

    private interface SampleInterface {
        void showMessage();
    }

    private Object o = new Object() {
      {
          showMessage();
      }

      public void showMessage() {
          System.out.println("Message!!!");
      }
    };

    public static void main(String[] args) {
        MyOuterClassDemo2 mocd2 = new MyOuterClassDemo2();
        // mocd2.o.showMessage();
    }

    public void doThings() {

        final String name ="local variable";

        // inner class defined inside a method of outer class
        class MyInnerClassDemo {
            public void seeOuter () {
                System.out.println("Outer Value of x is :" + x);
                System.out.println("Value of name is :" + name);
            }
        }
    }
}


