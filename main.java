class main{
    public static void main(String args[])
    {
        derived d= new derived();
        System.out.println(d.b);
        System.out.println(d.a);
        //System.out.println(d.e);
        d.sub(4,10);
        d.add(18,9);
        //d.mul(15,3);
        //d.div(16,4);
    }
}