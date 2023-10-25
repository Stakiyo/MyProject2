package com.javaprograms;
class Person1
{
  String getName()
  {
      return "programmerStak";
  }

}
class Programmer extends Person1
{
  String getCodingLanguage()
  {
      return "Java";

  }
}
class Program extends Programmer
{
    int getLineOfCode()
    {
        return 200;
    }
}
public class MultilevelInheritence
{
    public static void main(String[] args) {
        Program p=new Program();
        System.out.println("I am "+p.getName() +" and I code in "+p.getCodingLanguage()
        +".This code contains "+p.getLineOfCode()+" lines.");
    }

}
