import java.util.Scanner;
public class KilometersToMiles{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter kilometeres:");
double kms = sc.nextDouble();
double miles =kms* 0.621371;
System.out.println("Miles:"+miles);
}
}