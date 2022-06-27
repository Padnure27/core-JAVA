class VGTester
{
public static void main(String a[])
{
VCS v = new VCS();
v.vcsName = "Git";
v.version =  "2.36.1";
v.toProStro();
System.out.println(v.vcsName + " " + v.version);
}
}