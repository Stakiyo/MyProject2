package designpatterns;

public final class SingletonPattern {
    static SingletonPattern s;
    private SingletonPattern()
    {
        System.out.println("constructor called");
    }

   static  SingletonPattern  getObjectInstance()
    {
        if(s==null)
        {
            s=new SingletonPattern();
            return s;
        }
        else
        {
            return s;
        }
    }

    public static void main(String[] args) {
        SingletonPattern single=SingletonPattern.getObjectInstance();
        System.out.println(single);
        System.out.println(single);
    }
}
