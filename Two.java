# Two
import java.io.*;
import java.util.*;
public class Two
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
for(int i=1;i<=100;i++)
{
if((i&(i-1))==0)
System.out.println(i);
else
System.out.println(n);
}
}
}

