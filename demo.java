class demo
{
public static void main(String args[])
{
//assignment operator
int a= Integer.parseInt(args[0]);
System.out.println(a);
a+=5;//a=a+5;
System.out.println(a);
a-=2;
System.out.println(a);
a*=3;
System.out.println(a);
a/=5;
System.out.println(a);
a%=2;
//arithmetic operator
int b=Integer.parseInt(args[0]);
int c=Integer.parseInt(args[1]);
System.out.println(b+c);
System.out.println(b-c);
System.out.println(b*c);
System.out.println(b/c);
System.out.println(b%c);

//relational operator
int d=Integer.parseInt(args[0]);
int e=Integer.parseInt(args[1]);
System.out.println(d>e);
System.out.println(d<e);
System.out.println(d==e);
System.out.println(d!=e);
System.out.println(d>=e);
System.out.println(d<=e);


//logical operator
int f=Integer.parseInt(args[0]);
System.out.println(f>10 && f<10);
System.out.println(f>10 || f<10);

//binary operator
int g=Integer.parseInt(args[0]);
System.out.println(f & g);
System.out.println(f| g);
System.out.println(f ^ g);
System.out.println(~f);
System.out.println(f>>g);
System.out.println(f<<g);
}
}

