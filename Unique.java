class Unique
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=4;i++)
{
for(j=1;j<=4;j++)
{
for(k=1;k<=4;k++)
{
if(k!=i && k!=j &&i!=j)
System.out.println(i+" "+j+" "+k);
}
}
}
}
}
