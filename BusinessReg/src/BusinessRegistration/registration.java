package BusinessRegistration;

public class registration {
    String BusinessName;
    String BusinessDescription;

    public registration(String BusinessName, String BusinessDescription){
        this.BusinessName = BusinessName;
        this.BusinessDescription = BusinessDescription;
    }

    public void BusinessInfo(){
        System.out.println("Business Name: " +BusinessName);
        System.out.println("Business Description: " + BusinessDescription);
    }
}
