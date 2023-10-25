package com.javaprograms;
class Demo
{

}


public class ThisMethodDemo {

    void method1(ThisMethodDemo t1)
    {
        System.out.println("method1 called");
    }
    void method2()
    {
        method1(this);
        System.out.println("method2 called");
    }
    void method3()
    {
        System.out.println("method3 called");
    }
    void method4()
    {
        System.out.println("method4 called");
    }

    public static void main(String[] args) {
        ThisMethodDemo t=new ThisMethodDemo();
        t.method1(t);
    }
}
