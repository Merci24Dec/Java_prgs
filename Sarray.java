class Sarray
{
public static void main(String args[])
{
int a[]=new int[10],i,small,t;
System.out.println("input numbers in the array are");
for(i=0;i<=9;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("\n "+a[i]);
}
small=a[0];
for(i=0;i<=9;i++)
{
if(a[0]>a[i])
System.out.println("smallest no is="+small);
}
}
}
