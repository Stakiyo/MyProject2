package com.javaprograms;
class Employee
{
    String name;
    int age;
    Address a;
    Salary s;
    Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    {
       a=new Address("Hampi","Karnataka","India");
       s=new Salary(25.67,56.90,100.67,50000);
    }
    void display()
    {
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("address="+a.add);
        System.out.println("state="+a.state);
        System.out.println("country="+a.country);
        System.out.println("da="+s.da);
        System.out.println("hra="+s.hra);
        System.out.println("pf="+s.pf);
        System.out.println("da="+s.sal);
    }


}
class Address{
    String add;
    String state;
    String country;
    Address(String add,String state,String country)
    {
      this.add=add;
      this.state=state;
      this.country=country;

    }
}

class Salary{
    double sal,da,hra,pf;
    Salary(double da,double hra,double pf,double sal)
    {
        this.da=da;
        this.hra=hra;
        this.pf=pf;
        this.sal=sal;
    }
}


public class InitBlockDemo {
    public static void main(String[] args) {
        Employee e=new Employee("Harshit",23);
        e.display();
    }
}
