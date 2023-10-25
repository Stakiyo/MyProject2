//final keyword on Instance and Local variables  
package com.javaprograms;
class FinalDemo
{
final int a=20;
void show()
{
 final int a=10;
System.out.println("a="+this.a);
System.out.println("a="+a);
}
public static void main(String args[])
{
 FinalDemo f=new FinalDemo();
f.show();
}
}
