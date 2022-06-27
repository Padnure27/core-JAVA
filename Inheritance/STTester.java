class STTester
{
public static void main(String a[])
{
TestingTool tt = new TestingTool();
tt.ttName = "Selenium";
tt.stVersion = 4;
tt.toTest();
System.out.println(tt.ttName + " " + tt.stVersion);
}
}