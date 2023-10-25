package com.javaprograms;
class Car
{
    String name,color; //Aggregation

    int price;
    Car(String name,String color,int price)
    {
      this.name=name;
      this.color=color;
      this.price=price;
    }
    void dispDetails()
    {
        System.out.println("name="+name);
        System.out.println("color="+color);
        System.out.println("price="+price);
    }

}



public class Person {
    public static void main(String[] args) {

        Car c; //weak entity i.e,Aggregation
        // new Engineer() //strong entity i.e,compostion
        c=new Car("nano","blue",3_00_000); ////Association Demo i.e, HAS-A relation
        c.dispDetails();
    }

}
