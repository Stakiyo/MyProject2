package com.javaprograms;
class Test
{
    //method call as argument to another method
    int m1(int x,int y)
    {
        int s=x+y;
        return s;
    }

    void m2(int x,int y,int z){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
public class MethodCallParameter {
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.m1(10,20));
        t.m2(10,t.m1(10,20),20);
    }
}
