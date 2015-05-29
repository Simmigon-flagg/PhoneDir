/*Simmigon Flagg 3410 MW 12:00pm - 1:15pm
 Documentation:
    1.     Purpose
           The purpose is to gain experience using The Linked List Data Structure.
            We will create, read, update and delete objects from A linked list Data Structure.
==============================================================================
 2.     Solution

    - Declare and initialize the linked list of data Objects
    - Declare String for user input
    - Create a do while loop to repeatly add a new contact  
    
3.  The purpose of the contact class is
        is to make an object that sets three attributes.
        first name ,last name and phone number alone with their
        getter and setter methods
 */
        
package phonedir;

import java.util.*;

public class PhoneDir {

    public static void main(String[] args) {
        //Create linked List Objects
        LinkedList<Contact> phoneContacts = new LinkedList<Contact>();
        //Create Scanner Object for user input
        Scanner input;
        ////Create int for  storing index values
        int index = 0;
        //Create String Object for user input
        String command;
        //Start a do while loop
        do {
            //Print a message to the screen
            System.out.println(""
                    + "a Show all records.\n"
                    + "d Delete the current record.\n"
                    + "f Change the first name in the current record.\n"
                    + "l Change the last name in the current record.\n"
                    + "n Add a new record.\n"
                    + "p Change the phone number in the current record.\n"
                    + "s Select a record from the record list to become the current record.\n"
                    + "q Quit.\n");

            input = new Scanner(System.in);
            System.out.println("Enter a command from the list above (q to quit):");
            //All command are lower case
            command = input.next().toLowerCase();
            //Use a switch structure for the commands
            switch (command) {
                case "a":
                    //if statment to check for an empty Linklist
                    if (phoneContacts.isEmpty()) {
                        System.out.println("No Current Record");

                    } else {
                        System.out.println("All records!");
                        // for loop to print out all the contacts
                        for (int i = 0; i < phoneContacts.size(); i++) {
                            System.out.println(phoneContacts.get(i).toString());
                        }//end for loop
                    }

                    break;
                case "d":
                    //if statment to check for an empty Linklist
                    if (phoneContacts.isEmpty()) {
                        System.out.println("No current record");
                    } else {
                        System.out.println("Delete record!");
                    }

                    break;
                case "f":
                    //if statment to check for an empty Linklist
                    if (phoneContacts.isEmpty()) {
                        System.out.println("No current record");
                    } else {
                        //change the first Name
                        System.out.println(phoneContacts.getFirst());
                        System.out.println("Enter new first name:");
                        String changeFirstName = input.next();
                        phoneContacts.getFirst().setLastName(changeFirstName);

                        String firstName = phoneContacts.getFirst().getFirstName();
                        String lastName = phoneContacts.getFirst().getLastName();
                        String number = phoneContacts.getFirst().getNumber();

                    }//nd of else

                    break;

                case "l":
                    //if statment to check for an empty Linklist
                    if (phoneContacts.isEmpty()) {
                        System.out.println("No Contact Record");
                    } else {
                        //get the first Element
                        System.out.println("Current record is: " + phoneContacts.getFirst());
                        int count = 0;

                        System.out.println("Enter last Name: ");
                        //get the new last name
                        String changelastName = input.next().toUpperCase();
                        //set the new last name
                        phoneContacts.getFirst().setLastName(changelastName);
                      
                        String firstName = phoneContacts.getFirst().getFirstName();
                        String lastName = phoneContacts.getFirst().getLastName();
                        String number = phoneContacts.getFirst().getNumber();
                        //phoneContacts.remove(index);
                        if (phoneContacts.isEmpty()) {
                              //set the new name back in the list
                            phoneContacts.add(new Contact(firstName, lastName, number));
                            phoneContacts.offerFirst(new Contact(firstName, lastName, number));
                            System.out.println("Current record is: " + firstName + " " + lastName + " " + number);

                        }/*end of if*/ else {
                            count = 0;
                              //Remove old last name ans place back into the list
                            phoneContacts.remove();
                            for (int i = 0; i < phoneContacts.size(); i++) {
                                //keep track of the number of loop                                
                                ++count;                              
                                //The lowest letter A is compare all values for last name
                                //If the letter and the same move place at that location
                                if (lastName.compareTo("A") == phoneContacts.get(i).getLastName().compareTo("A")) {                                
                                    phoneContacts.add(i, new Contact(firstName, lastName, number.toString()));
                                    break;                                    
                                    //else if the letter is lower than the last name place the letter in front of the 
                                    //largerest values
                                }/*end of else if*/ else if (lastName.compareTo("A") < phoneContacts.get(i).getLastName().compareTo("A")) {                                                                       
                                    phoneContacts.add(i, new Contact(firstName, lastName, number.toString()));
                                    break;
                                }/*end of else if*/ else {
                                    //Check the number of element in the loop
                                    // if it equal size then you are done searching 
                                    //You are are the end of the loop.
                                    //This is now the last element
                                    if (phoneContacts.size() == count) {
                                          //Place the element at the back of the loop
                                        phoneContacts.add(new Contact(firstName, lastName, number.toString()));                                      
                                        break;
                                    }/*end of if*/
                                }/*end of else*/
                                index = i;
                            }//end of for loop    
                            //make the element the first in the list
                            phoneContacts.offerFirst(new Contact(firstName, lastName, number.toString()));
                            System.out.println("Current record is: " + firstName + " " + lastName + " " + number.toString());
                        }//end of else
                    }
                    break;
                case "n":

                    String firstName;
                    String lastName;

                    int count;

                    //System.out.println("==================NEW CONTACT!");
                    // System.out.println("Size: " + phoneContacts.size());
                    //System.out.println(number.toString());
                    System.out.print("Enter First Name: ");
                    firstName = input.next();

                    System.out.print("Enter Last Name: ");
                    lastName = input.next().toUpperCase();

                    System.out.print("Enter Phone number: #1231231234");
                    StringBuilder number = new StringBuilder();
                    char[] Digit = new char[10];
                    //Do while loop for the formatting of the phone number
                    do {
                        Digit = input.next().toCharArray();
                        //if the number of inputs is not 10
                        //print a message
                        if (Digit.length != 10) {
                            System.out.println("Not a valid number.");
                        } else {
                            //for looop to move thought the char array adding
                            //a phone number format
                            for (int i = 0; i < Digit.length; i++) {
                                
                                if (i == 0) {
                                    number.append('(');
                                }
                                if (i == 3) {
                                    number.append(')');
                                    number.append('-');
                                }
                                if (i == 6) {
                                    number.append('-');
                                }
                                number.append(Digit[i]);
                            }
                            number.toString();
                        }                        
                        //while digit not ten keep looping
                    } while (Digit.length != 10);
                 
                    //if statment to check for an empty Linklist
                    if (phoneContacts.isEmpty()) {
                        phoneContacts.add(new Contact(firstName, lastName, number.toString()));
                        phoneContacts.offerFirst(new Contact(firstName, lastName, number.toString()));
                        System.out.println("Current record is: " + firstName + " " + lastName + " " + number.toString());
                    }/*end of if*/ else {
                        count = 0;
                        phoneContacts.remove();
                        for (int i = 0; i < phoneContacts.size(); i++) {
                            ++count;                           
                                 //The lowest letter A is a compare all values for last name
                                //If the letter and the same move place at that location
                            if (lastName.compareTo("A") == phoneContacts.get(i).getLastName().compareTo("A")) {                            
                                phoneContacts.add(i, new Contact(firstName, lastName, number.toString()));
                                break;
                                 //else if the letter is lower than the last name place the letter in front of the 
                                    //largerest values
                            }/*end of else if*/ else if (lastName.compareTo("A") < phoneContacts.get(i).getLastName().compareTo("A")) {
                                phoneContacts.add(i, new Contact(firstName, lastName, number.toString()));
                                break;
                            }/*end of else if*/ else {
                                 //Check the number of element in the loop
                                    // if it equal size then you are done searching 
                                    //You are are the end of the loop.
                                    //This is now the last element
                                if (phoneContacts.size() == count) {
                                    phoneContacts.add(new Contact(firstName, lastName, number.toString()));                                    
                                    break;
                                }/*end of if*/

                            }/*end of else*/

                        }//end of for loop
                        //make the element the first in the list
                        phoneContacts.offerFirst(new Contact(firstName, lastName, number.toString()));
                        System.out.println("Current record is: " + firstName + " " + lastName + " " + number.toString());
                    }//end of else
                    break;
                case "p":
                    //Change phone number
                    System.out.print("Enter Phone number: ");
                    StringBuilder changeNumber = new StringBuilder();
                    char[] changeDigit = new char[10];
                     //Do while loop for the formatting of the phone number
                    do {
                        changeDigit = input.next().toCharArray();
                        
                        if (changeDigit.length != 10) {
                            System.out.println("Not a valid number.");
                        } else {
                            //if the number of inputs is not 10
                            //print a message
                            for (int i = 0; i < changeDigit.length; i++) {
                                if (i == 0) {
                                    changeNumber.append('(');
                                }
                                if (i == 3) {
                                    changeNumber.append(')');
                                    changeNumber.append('-');
                                }
                                if (i == 6) {
                                    changeNumber.append('-');
                                }
                                changeNumber.append(changeDigit[i]);
                            }
                            changeNumber.toString();
                        }
                    //while digit not ten keep looping
                    } while (changeDigit.length != 10);

                    changeNumber.append("");
                    phoneContacts.getFirst().setNumber(changeNumber.toString());
                    System.out.println("Phone number Changed to!" + phoneContacts.getFirst());
                    break;
                case "q":
                    //exits the program
                    System.out.println("Quit!");
                    break;
                case "s":
                    String currentfirstName = "";
                    String currentlastName = "";
                    String currentPhoneNumber = "";
                    phoneContacts.pop();
                    phoneContacts.push(new Contact(currentfirstName, currentlastName, currentPhoneNumber));
                    System.out.println("Current record!" + phoneContacts.element());
                    break;
                default:
                    //All non commands
                    System.out.println("Illegal command!");
                    break;
            }
            //end the do while loop to exit the program
        } while (!command.equals("q"));
    }

}
