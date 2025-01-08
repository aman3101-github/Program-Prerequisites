import java.util.*;
public class VolumeOfCylinder{
public static void main(String [] args){
double pi=3.14;
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int h=sc.nextInt();
double volume=pi*r*r*h;
System.out.println("volume of cylinder:"+volume);
}
}