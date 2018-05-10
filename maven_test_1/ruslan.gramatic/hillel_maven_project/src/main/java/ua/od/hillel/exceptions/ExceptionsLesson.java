package ua.od.hillel.exceptions;

import java.io.IOException;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public class ExceptionsLesson {

    public static void main(String[] args) throws Exception {
        ExceptionsLesson el = new ExceptionsLesson();
        el.exceptionExample2();
    }

    public void exceptionExample2() throws IOException {

        try {
            System.out.println("methodMain: Start");
            if(true)throw new MyDivideArgsException("");
            else if(true) throw new IOException("");
            System.out.println("methodMain: End");
        } catch (IOException e) {
            System.out.println("message: MyDivideArgsException");
        } catch (MyDivideArgsException ee) {
            System.out.println("message: Exception");
        } catch (Exception ie){

        } finally {
            System.out.println("methodMain: finally");
        }
    }

    public void exceptionExample1() throws Exception {
        try {
            System.out.println("methodMain: Step1");
            method1();
            System.out.println("methodMain: Step2");
        } catch (MyDivideArgsException e) {
            System.out.println(e.getMySpecialMessage());
            try {
                if(true)throw new Exception("ddd");
                System.out.println("methodMain: Step7");
            } catch (Exception ee) {
                System.out.println("methodMain: Step5");
                System.out.println(e.getMySpecialMessage());
            } finally {
                System.out.println("methodMain: Step4");
            }
            System.out.println("methodMain: Step6");
        } finally {
            System.out.println("methodMain: Step3");
        }
    }
    //5,4,?6?,3

    public void method1() throws MyDivideArgsException {
        System.out.println("method1: Step1");
        method2();
        System.out.println("method1: Step2");
    }

    public void method2() throws MyDivideArgsException {
        System.out.println("method2: Step1");
        method3();
        System.out.println("method2: Step2");
    }

    public void method3() throws MyDivideArgsException {
        System.out.println("method3: Step1");
        if(true) throw new MyDivideArgsException("hjgdjhg");
        System.out.println("method3: Step2");
    }











    public double divide(float a, float b) throws MyDivideArgsException {
        if(a == 0 || b == 0){
            throw new MyDivideArgsException("any massage");//ArithmeticException("any message");
        } else {
            return a / b;
        }
    }
}


