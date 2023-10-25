//Dynamic class loading
package com.javaprograms;
class X
{
 static
{
System.out.println("A class static block called");
}

}

class Y
{
 static
{
System.out.println("B class static block called");
}
}

public class DynamicClassLoading
{
public static void main(String args[])
{
try
{
Class c=Class.forName(args[0]);
}
catch(Exception e)
{
e.printStackTrace();
}

}
}