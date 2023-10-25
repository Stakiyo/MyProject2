package com.javaprograms;



class MethodDemo
{
    //method without parameters and without returntype
    void m1(){
        System.out.println("m1 called");
    }
    //method with parameter and without returntype
    void m2(int x)
    {
        System.out.println("m2 called");
        System.out.println("x="+x);
    }
    //method without parameter and with returntype
    int m3()
    {
        System.out.println("m3 called");
        return 10;
    }
    //mehtod with parameter and with returntype
    int m4(int x,int y){
        int s=x+y;
        return s;
    }
}
public class Methods
{
    public static void main(String[] args) {
        MethodDemo m=new MethodDemo();
        m.m1();
        m.m2(10);
        System.out.println(m.m3());
        System.out.println(m.m4(10,20)+40);
    }
}
