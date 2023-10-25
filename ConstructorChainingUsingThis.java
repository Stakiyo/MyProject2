package com.javaprograms;
//Constructor Chaining Program

public class ConstructorChainingUsingThis
{
    ConstructorChainingUsingThis()
    {
        this(10);
        System.out.println("default const called..");
    }

    ConstructorChainingUsingThis(int x)
    {
        this(10,20);
        System.out.println("x="+x);
    }

    ConstructorChainingUsingThis(int x, int y)
    {
        this(10,20,30);
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
    ConstructorChainingUsingThis(int x, int y, int z)
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

    }

    public static void main(String[] args)
    {
      ConstructorChainingUsingThis c=new ConstructorChainingUsingThis();

    }


}
