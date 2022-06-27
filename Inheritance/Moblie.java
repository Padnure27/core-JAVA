class Moblie{
String brandName;
int modelNo;
String color;
int price;
public static void main(String[] args){
   //ClassName refvariable = new ClassName();
Moblie mob = new Moblie();
mob.brandName="Samsung";
mob.modelNo=123;
mob.color="Blue";
mob.price=2000;
  System.out.println("The brandName of moblie is" + mob.brandName);
  System.out.println("The modelNo of moblie is" + mob.modelNo);
  System.out.println("The color of moblie is" + mob.color);
  System.out.println("The price of moblie is" + mob.price);
}
}