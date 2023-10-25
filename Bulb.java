package com.javaprograms;

class Bulb
{
int watt;
int total;
float price;
String color;
boolean state;
static int counter;
static String cname;
String con;


static {
counter=0;
cname="Surya";
}

{
 counter++;
}

Bulb()
{
price=100f;
color="yellow";
watt=30;
state=false;
}

Bulb(float p,String col,int w,boolean s)
{
price=p;
color=col;
watt=w;
state=s;
}

void showDetails()
{
System.out.println("Bulb company:"+cname);
System.out.println("Bulb price:"+price);
System.out.println("Bulb color:"+color);
System.out.println("Bulb watt:"+watt);
System.out.println("Bulb state was before:"+state);

}

void changeState()
{
state=(state==true)?false:true;
System.out.println("Bulb state after was:"+state);
System.out.println("-----------************---------");
}
static void countBulb()
{
System.out.println("Bulb"+" " +counter +" is created");
}

void totalNumberOfBulbs()
{
total=total+counter;
System.out.println("Total Number of bulbs:"+total);
}

void changeCompanyName(String company)
{
cname=company;
}

public static void main(String args[])
{

countBulb();
Bulb b1=new Bulb();
countBulb();
b1.showDetails();
b1.changeState();

Bulb b2=new Bulb();
countBulb();
b2.showDetails();
b2.changeState();

Bulb b3=new Bulb();
countBulb();
b3.showDetails();
b3.changeState();

Bulb b4=new Bulb(20f,"red",10,true);
countBulb();
b4.showDetails();
b4.changeState();

Bulb b5=new Bulb(30f,"white",15,false);
countBulb();
b5.changeCompanyName("Phillips");
b5.showDetails();
b2.changeState();
Bulb b6=new Bulb(50f,"green",30,false);
countBulb();
b6.showDetails();
b6.changeState();

b1.totalNumberOfBulbs();
}
}
