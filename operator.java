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
}
}

