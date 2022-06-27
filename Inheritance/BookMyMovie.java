class BookMyMovie{
 
  String movies[] = {"Om", "Mugaru Male" , "Upendra", "H2O", "Rakta Kaneeru" , "A", "Suryavamshi", "Yajmana"};
  int noOfTickets;
  static int ticketPrice = 600;
  int totalNoOfTickets = 200;
  int totalTicketsPrice;
  String snacks [] = {"Gobbi Manchuri","Pani Puri", "Vada Pav", "" };
  int totalSnacks = 1000;
public BookMyMovie(){
  this.theatreName = theatreName;
  this.totalNoOfTickets = totalNoOfTickets;
System.out.println("BookMyMovie Object is created");
}
 public int showTime(int noOfTickets, String bookedBy, String movieName) {
   int totalTicketPrice = 0;
  System.out.println("inside showTime().....");  
  System.out.println("Arg 1 : No Of Tickets" + noOfTickets); 
System.out.println("Arg 2 : Booked By" + bookedBy);
System.out.println("Arg 3 : movieName" + movieName);
for(int index = 0; index < movies.length ; index++){
if(movieName == movies[i]){
  System.out.println("Movie name matched");
  if(noOfTickets < totalNoOfTickets){
totalTicketsPrice = noOfTickets*ticketPrice;
totalNoOfTickets = totalNoOfTickets - noOfTickets;
System.out.println("For Movie : " + movieName+ "No of Tickets are That are remaining : " +toatlNoTicket + "Total Price is " + totalTicktsPrice);
}
else {
System.out.println("Isht Ticket Illa.....");
}
}
else{
System.out.println("Movie is not available");
}
}
return totalTicketsPrice;

 }
 //public int buySnaks(String snackName, int quantity){ 
   // int totalSnackPrice=0;
      // logic for getting snacks and snacksPrice
 //}

}
 



