package com.javaprograms;


class A
{

    public static void main(String[] args)
    {
        System.out.println(" class A main() called ");
    }
}

class B
{

    public static void main(String[] args)
    {
        System.out.println("class B main() called");
    }
}

class C
{
    public static void main(String ...args)
    {
        System.out.println("class C main() called ");
    }
}
class D
{
    public static void main(String[] args)
    {
        System.out.println("class D main() called");
    }
}

public class MainMethodDemo {
    public static void main(String[] args) {
        A.main(null);
        B.main(new String[]{"hello"});
        C.main();
        D.main(args);

    }
}
