class Industries{
String industriesName;
static String location;
long contactNo; 
static int noOfEmployee;
public Industries (int noOfEm, String indNa, String loc, long cNo);
{
    System.out.println("Industries object is created");
    noOfEmployee = noOfEm;     
    industriesName = indNa ;
    location = loc;
    contactNo = cNo;

}
//main method --- starting point
public static void main(String a[])
{
//Constructor are used to init instance variable of a class
Industries ind = new Industries("ABC", "Rajajinagar", 12345679890L, 66);
System.out.println(ind.industriesName+  "  " + ind.location + "  " + ind.contactNo + "  " + ind.noOfEmployee);


//System.out.println(Industries.location + "  " + Industries.noOfEmployee);

Industries ind1 = new Industries("XYZ", "Rajajinagar", 12358679890L, 66);
System.out.println(ind1.industriesName+  "  " + ind1.location + "  " + ind1.contactNo + "  " + ind1.noOfEmployee);

//System.out.println(Industries.location + "  " + Industries.noOfEmployee);
}
}
 



