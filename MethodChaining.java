package com.javaprograms;

//Method Chaining Program
public class MethodChaining {
    MethodChaining()
    {
        System.out.println("const called ");

    }

    MethodChaining display()
    {
        System.out.println("disp called");
        return this;
    }


    MethodChaining show()
    {
        System.out.println("show called");
        return this;
    }

    MethodChaining disp()
    {
        System.out.println("disp called");
        return this;
    }

    public static void main(String[] args) {
        new MethodChaining().display().show().disp();

    }
}
