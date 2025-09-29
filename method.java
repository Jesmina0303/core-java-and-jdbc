class method
{
    public static void info()
    {
        System.out.println( "just print something");
    }
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        int a=10,b=20;
        System.out.println(a+b);
        method obj=new method();
        obj.info();
        add(10,9);
    }
}