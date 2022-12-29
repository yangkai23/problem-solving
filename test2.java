 class Server{
         String sname;
     Server(String x){
         x=sname;
}
   void serveBeer(){
        system.out.println("serve the beer");
}
}
 class Customer{
       String cname;
    Customer(String y){
       y=cname;
}
  void drink(){
  Server s = new Server("Hrushi");
  s.serveBeer();
      system.out.println("drink the beer");
}
}
 class BeerTest{
   public static void main(String[] args){
   Customer b=new Customer("Anirudh");
   b.drink();
}
}
