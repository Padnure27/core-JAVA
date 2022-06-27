class Transportation{
int id;
 String name = "Train";
static int noOfTrain = 45;
static String location;
long contactNo;
public ShowRoom4(int transId, String loc, long cNo, int noFT)
{
System.out.println("Transportation object is created");
id = transId;
location = loc;
contactNo = cNo;
noOfTrain = noFT; 
}
public static void main(String a[])
{
Transportation tran = new Transportation(123, "Rajajinagar", 12345679890L, 15);
System.out.println(show.id+  "  " + .location + "  " + show.contactNo);


System.out.println(ShowRoom4.name + "  " + ShowRoom4.noOfBranches);

Transportation tran1 = new Transportation(992, "Rajajinagar", 12358679890L, 9 );
System.out.println(tran1.id+  "  " + tran1.location + "  " + tran1.contactNo);

System.out.println(ShowRoom4.name + "  " + ShowRoom4.noOfBranches);
}
}
