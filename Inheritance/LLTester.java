class LLTester
{
public static void main(String a[])
{
LIC lic = new LIC();
lic.name = "LIC";
lic.policyValidity = "3 Years"; 
lic.toGetMoney();
System.out.println(lic.name + " " + lic.policyValidity);
}
}