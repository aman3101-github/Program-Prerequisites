import java.util.*;
public class PowerCalculation{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter base number:");
double b=sc.nextInt();
System.out.println("Enter exponent number:");
double e=sc.nextInt();
double num=(Math.pow(b,e));
System.out.println("Result :"+num);
}
}