 class calculator
 {
    int a=50,b=40;
    
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }    
    public void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    public void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String args[])
    {
        calculator c= new calculator();
        c.add(50,13);
        c.sub(13,6);
        c.mul(14,8);
        c.div(12,5);

    }


    
 }