package com.javaprograms;



public class ConstructorOverloading {
    int a,b;
    ConstructorOverloading()
    {
        System.out.println("ConstructorOverloading called");
    }

    ConstructorOverloading(int x)
    {
        System.out.println("x="+x);
    }
    ConstructorOverloading(int x,int y)
    {
        a=x;
        b=y;
    }
    ConstructorOverloading(ConstructorOverloading c1){
        a=c1.a;
        b=c1.b;

    }

    void disp(ConstructorOverloading o1){
        System.out.println(a);
        System.out.println(b);
    }

    void show(ConstructorOverloading o2){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        ConstructorOverloading c=new ConstructorOverloading();
        ConstructorOverloading c1=new ConstructorOverloading(23);
        ConstructorOverloading c2=new ConstructorOverloading(30,40);
        ConstructorOverloading c4=new ConstructorOverloading(c2);
        c4.disp(c2);
        c4.show(c2);
    }

}
