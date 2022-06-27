class BMTester
{
public static void main(String a[])
{
ModeOfTransportation mot = new ModeOfTransportation();
mot.type= "Bus";
mot.address = "Rajajinagar";
mot.toGoHome();
System.out.println(mot.type + " " + mot.address );
}
}