 class Conductor{
    void issueTicket(){
}
}
 class Passenger{
    void travel(){
    Conductor c = new Conductor();
    c.issueTicket();
}
    public static void main(String[] args){
    Passenger p = new Passenger();
    p.travel();
}
}
