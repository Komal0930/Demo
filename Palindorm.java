import java.util.Scanner;
public class Palindorm{
public static void main(String args[]){
 int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the num");
  n=sc.nextInt();
  int temp;
  temp=n;
  int rev=0;
  while (temp>0)
  {
   int rem;
   rem=temp%10;
   rev=(rev*10)+rem;
   temp=temp/10;
  }
  if (rev==n)
  { 
   System.out.println("No is Palindrom");
  }
else 
  System.out.println("Not");
 }
}

