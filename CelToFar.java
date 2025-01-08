import java.util.*;
public class CelToFar{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int celsius=sc.nextInt();
int fahrenheit=((celsius) * (9/5)) + 32;
System.out.println("celsius:"+celsius);
System.out.println("fahrenheit:"+fahrenheit);
}
}