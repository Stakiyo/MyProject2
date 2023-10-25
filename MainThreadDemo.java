package com.javaprograms;
class MyThread
{
static
{
System.out.println("Thread name in static block:"+Thread.currentThread().getName());
}
}
class MainThreadDemo
{
public static void main(String args[])
{
MyThread m=new MyThread();
System.out.println("Thread name in main method:"+Thread.currentThread().getName());
}
}
