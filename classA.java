class classA
{
    public static void main(String args[])
    {
        classB obj=new classB();
        System.out.println(obj.a);
        obj.show();
        classB obj1=new classB();
        System.out.println(obj1.b);
         obj1.show();
          obj1.b=30;
         classB obj2=new classB();
        System.out.println(obj2.c);
         obj2.show();
         obj2.c=5;
         classB obj3=new classB();
        System.out.println(obj3.d);
         obj3.show();
         obj3.d=6;
        System.out.println(obj.a+" "+obj1.a);
        System.out.println(obj.a+" "+obj1.b);
        System.out.println(obj.a+" "+obj2.c);
        System.out.println(obj.a+" "+obj3.d);
        
        



    }
}