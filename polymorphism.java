class person
{
    void role()
        System.out.println("i am a person");
    }
    class Father extends Person
    {
         @override void role()
        {
            System.out.println("i am a father");
        }
    }
    public static void main(String args[])
    {
        person p=new person();
        p.role();
    }
    
}