package ua.od.hillel;

public class ArrayApp {

    public static void main(String[] args) {

        Array a =new Array(10);


        a.insert(1);
        a.insert(3);
        a.insert(5);

        Array b= new Array(10);

        b.insert(2);
        b.insert(4);
        b.insert(8);
        b.insert(9);
        b.insert(12);

        Array c= new Array((a.size()+ b.size()));



        System.out.print("a[]=");
        a.display();
        System.out.println();

        System.out.print("b[]=");
        b.display();
        // присваеваем третему массиву больший, для уменьшения кол вставок
        if (a.size()>b.size())c=a;
        else c=b;



        for (int i = 0; i <a.size() ; i++) {
            c.insert(a.getArray(i));
      }

        System.out.print("c[]=");
        c.display();

    }
}
