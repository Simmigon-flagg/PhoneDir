/*Simmigon Flagg 3410 MW 12:00pm - 1:15pm*/
package phonedir;

public class Contact {

    //fields for contact class
    private String firstName;
    private String lastName;
    private String number;
    
    //Contrutor
    //Pre: Takes three String in its Parameters
    //Pos: Set value for the object
    public Contact(String firstName, String lastName, String number) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }
    //Pre: None
    //Pos:Returns a String
    public String getFirstName() {
        return firstName;
    }
    //Pre: Takes a String in its Parameters
    //Pos: Returns void
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //Pre: None
    //Pos: Returns a String
    public String getLastName() {
        return lastName;
    }
    //Pre: Takes a String in its Parameters
    //Pos: Returns void
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Pre: None
    //Pos: Returns a String
    public String getNumber() {
        return number;
    }
    //Pre: Takes a String in its Parameters
    //Pos: Returns void
    public void setNumber(String number) {
        this.number = number;
    }
    //Pre: None
    //Pos: Returns a set of Strings
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + number;
    }
}
