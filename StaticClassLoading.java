//static class loading
class A 
{
 static
{
System.out.println("A class static block called");
}
A()
{
System.out.println("A cons...");
}

}

class B
{
 static
{
System.out.println("B class static block called");
}
B()
{
System.out.println("B cons...");
}

}

class C
{
public static void main(String args[])
{
A a=new A();
B b=new B();
}
}