package com.javaprograms;


class BaseClass
{
    int x=10;
    void display()
    {
        System.out.println("display method called");
    }

}

class ChildClass extends BaseClass
{
    int x=20;
    void show()
    {
        System.out.println("x="+x);
        System.out.println("x="+super.x);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
       ChildClass c=new ChildClass();
         c.display();
         c.show();

    }
}
