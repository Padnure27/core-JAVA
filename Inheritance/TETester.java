class TETester
{
public static void main(String a[])
{
ElectronicDevice ed = new ElectronicDevice();
ed.name= "TubLight";
ed.price = 123.00;
ed.color = "White";
ed.toGetLight();
System.out.println(ed.name + " " + ed.price + "  " + ed.color);
}
}
