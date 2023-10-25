package com.javaprograms;

public class ThisDemo {
    int x=10;
    //DataShadowing
    void show()
    {
        int x=20;
        System.out.println("x="+x);
        System.out.println("x="+x);
    }
    void disp()
    {
        //DataShadowing resolved using this keyword
        int x=20;
        System.out.println("x="+this.x);
        System.out.println("x="+x);
    }



    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.show();
        t.disp();


    }
}
