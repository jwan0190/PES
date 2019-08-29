public class Customer extends User {
    private String customerID;
    public Customer(){
        this.customerID = "";
    }
    public Customer(String userID){
        this.customerID = userID;
    }
}
