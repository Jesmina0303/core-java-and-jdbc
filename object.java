class object
{
    public void info()
    {
        System.out.println("just print something");
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static void main(String args[])
    {
        int a=15,b=14;
        System.out.println(a+b);
        object obj=new object();
        obj.info();
        System.out.println(add(12,9));
        System.out.println(sub(10,5));
        System.out.println(mul(14,3));
        System.out.println(div(14,6));
        int num=add(15,10);
        int num1=sub(8,5);
        int num2=mul(12,8);
        int num3=div(8,4);
        System.out.println(num*2);
        System.out.println(num1*2);
        System.out.println(num2*2);
        System.out.println(num3*2);

}
}