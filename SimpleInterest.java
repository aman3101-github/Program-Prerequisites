import java.util.*;
public class SimpleInterest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter principal:");
int p=sc.nextInt();
System.out.println("Enter rate of interest:");
double r=sc.nextInt();
System.out.println("Enter time:");
double t=sc.nextInt();
double si=(p*r*t)/100;
System.out.println("Simple Interest :"+si);
}
}