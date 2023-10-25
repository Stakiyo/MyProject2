package com.javaprograms;

public class StaticBlockDemo {
    static
    {
        System.out.println("static block1 called");
    }
    static
    {
        System.out.println("static block2 called");
    }

    StaticBlockDemo()
    {
        System.out.println("constructor called");
    }

    void display()
    {
        System.out.println("display called");
    }

    public static void main(String[] args) {
        StaticBlockDemo s=new StaticBlockDemo();
        s.display();
    }

}
