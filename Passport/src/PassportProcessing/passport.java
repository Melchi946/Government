package PassportProcessing;

public class passport{
    String PersonName;
    String DateOfBirth;
    String ParentName;

    public passport(String PersonName, String DateOfBirth,String ParentName){
        this.PersonName = PersonName;
        this.DateOfBirth = DateOfBirth;
        this.ParentName = ParentName;
    }

    public void PassportProcess(){
        System.out.println("Person Name: " + PersonName);
        System.out.println("Date of birth: " + DateOfBirth);
        System.out.println("Parent Name: " + ParentName);
    }

}
