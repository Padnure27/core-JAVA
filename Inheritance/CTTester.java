class CTTester
{
public static void main(String a[])
{
ChipManufacturingCompany cmc = new ChipManufacturingCompany();
cmc.name = "TSM";
cmc.cost = 123;
cmc.toChip();
System.out.println(cmc.name + " " + cmc.cost);
}
}