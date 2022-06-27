class Human
{
void display(String name)
{
System.out.println("Name:" + name);
}
void display(int age)
{
System.out.println("Age:" + age);
}
void display(int id, double height)
{
System.out.println("Id:" + id + "Height:" + height);
}
public static void main(String a[])
{
Human hum = new Human();
hum.display("Shweta");
hum.display(23);
hum.display(123, 5.4);
}
}


