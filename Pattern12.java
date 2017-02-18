import java.util.Scanner;
class Pattern12
{
 public static void main(String arg[])
 {
 	System.out.print("\nEnter the number of rows=");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int i=1;i<=a-1;i++)
	{
	 for(int m=1;m<2*a;++m)
	 {
 	  System.out.print(" ");
	 }
 	 for(int j=a;j>i;j--)
	 {
 	  System.out.print(" ");
	 }
	 for(int k=1;k<=i*2;k++)
	 {
	  if(k%2==1)
 	   System.out.print("*");
	  else
	   System.out.print(" ");	
	 }
	 System.out.println();
	}
	for(int i=1;i<=a;i++)
	{
	 for(int m=1;m<2*a;++m)
	 {
 	  System.out.print(" ");
	 }
 	 for(int j=1;j<i;j++)
	 {
	  System.out.print(" ");
	 }
	 for(int k=a;k>=i;k--)
	 {
	  System.out.print("* ");
	 }
	 System.out.println();
	}
	

for(int i=1;i<=a-1;i++)
	{
	 for(int j=a;j>i;j--)
	 {
 	  System.out.print(" ");
	 }
	 for(int k=1;k<=i*2;k++)
	 {
	  if(k%2==1)
 	   System.out.print("*");
	  else
	   System.out.print(" ");	
	 }
	 for(int m=3*a;m>i+3;m--)
	 {
 	  System.out.print(" ");
	 }
	 for(int j=a;j>=i;j--)
	 {
 	  System.out.print(" ");
	 }
	 for(int k=1;k<=i*2;k++)
	 {
	  if(k%2==1)
 	   System.out.print("*");
	  else
	   System.out.print(" ");
	 }
	 System.out.println();
	}
	for(int i=1;i<=a;i++)
	{
 	 for(int j=1;j<i;j++)
	 {
	  System.out.print(" ");
	 }
	 for(int k=a;k>=i;k--)
	 {
	  System.out.print("* ");
	 }
	  for(int m=1;m<=2*a+i-3;++m)
	 {
 	  System.out.print(" ");
	 }
	 for(int j=1;j<i;j++)
	 {
	  System.out.print(" ");
	 }
	 for(int k=a;k>=i;k--)
	 {
	  System.out.print("* ");
	 }
	 System.out.println();
	}
	
	for(int i=1;i<=a-1;i++)
	{
	 for(int m=1;m<2*a;++m)
	 {
 	  System.out.print(" ");
	 }
 	 for(int j=a;j>i;j--)
	 {
 	  System.out.print(" ");
	 }
	 for(int k=1;k<=i*2;k++)
	 {
	  if(k%2==1)
 	   System.out.print("*");
	  else
	   System.out.print(" ");	
	 }
	 System.out.println();
	}
	for(int i=1;i<=a;i++)
	{
	 for(int m=1;m<2*a;++m)
	 {
 	  System.out.print(" ");
	 }
 	 for(int j=1;j<i;j++)
	 {
	  System.out.print(" ");
	 }
	 for(int k=a;k>=i;k--)
	 {
	  System.out.print("* ");
	 }
	 System.out.println();
	}





 }
}	