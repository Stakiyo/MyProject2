package com.javaprograms;

import java.sql.SQLOutput;

public class MethodOverloading {
    void show()
    {
        System.out.println("show called");
    }
    int show(int x)
    {
        System.out.println("x="+x);
        return 20;
    }

    void show(int x,int y)
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    int show(int x,int y,int z)
    {
        int sum=x+y+z;
        return sum;
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.show();
        System.out.println(m.show(10));
        m.show(10,20);
        System.out.println(m.show(10,20,30));
    }
}
