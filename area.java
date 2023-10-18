import java.util.*;
class areacircle
{
double radius;
double getarea(double radius)
{
return (Math.PI*radius*radius);
}
}
class area
{
public static void main(String arg[])
{
Scanner in=new Scanner(System.in);
areacircle obj=new areacircle();
System.out.println("enter the radius");
double rad=in.nextDouble();
double area=obj.getarea(rad);
System.out.println("area of circle is"+area);
}
}

