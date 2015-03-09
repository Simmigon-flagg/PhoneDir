package phonedir;

import java.util.*;

public class PhoneDir {

    public static void main(String[] args) {
        LinkedList<Contact> phoneContacts = new LinkedList<Contact>();
        Scanner input;
        String command;

        do {

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
            command = input.next().toLowerCase();
            switch (command) {
                case "a":
                    System.out.println("All records!");
                    for (int i = 0; i < phoneContacts.size(); i++) {

                        System.out.println(phoneContacts.get(i).toString());
                    }
                    break;
                case "d":
                    System.out.println("Delete record!");
                    break;
                case "f":

                    phoneContacts.element().setFirstName("Simmigon");
                    System.out.println("First name changed!");

                    break;
                case "l":
                    System.out.println("Last name changed!");
                    phoneContacts.element().setLastName("Simmigon");
                    break;
                case "n":
                    System.out.println("==================NEW CONTACT!");
                    System.out.println("Size: " + phoneContacts.size());
                    System.out.println("Enter First Name:");

                    String firstName = input.next();

                    System.out.println("Enter Last Name:");
                    String lastName = input.next().toUpperCase();

                    System.out.println("Enter Phone number:");
                    String number = input.next();

                    if (phoneContacts.isEmpty()) {
                        phoneContacts.add(new Contact(firstName, lastName, number));
                    }/*end of if*/ else {
                        int count = 0;

                        for (int i = 0; i < phoneContacts.size(); i++) {

                            System.out.println("Size: " + phoneContacts.size());
                            ++count;
                            System.out.println("Count: " + count);

                            if (lastName.compareTo("A") == phoneContacts.get(i).getLastName().compareTo("A")) {
                                //notes
                                System.out.println("Same letter == ");

                                System.out.println("List numbers: " + phoneContacts.get(i).getLastName().compareTo("A") + " Letter: " + phoneContacts.get(i).getLastName());
                                System.out.println("New number: " + lastName.compareTo("A") + " New letter: " + lastName);
                                //notes
                                phoneContacts.add(i, new Contact(firstName, lastName, number));
                                break;
                            }/*end of if*/ else if (lastName.compareTo("A") < phoneContacts.get(i).getLastName().compareTo("A")) {
                                System.out.println("else if");
                                System.out.println("List numbers: " + phoneContacts.get(i).getLastName().compareTo("A") + " Letter: " + phoneContacts.get(i).getLastName());
                                System.out.println("New number: " + lastName.compareTo("A") + " New letter: " + lastName);
                                phoneContacts.add(i, new Contact(firstName, lastName, number));
                                break;

                            }/*end of else if*/ else if (lastName.compareTo("A") < phoneContacts.get(i).getLastName().compareTo("A")) {
                                System.out.println("else if");
                                System.out.println("List numbers: " + phoneContacts.get(i).getLastName().compareTo("A") + " Letter: " + phoneContacts.get(i).getLastName());
                                System.out.println("New number: " + lastName.compareTo("A") + " New letter: " + lastName);
                                phoneContacts.add(i, new Contact(firstName, lastName, number));
                                break;
                            }/*end of else if*/  else {
                                System.out.println("else");
                                if (phoneContacts.size() == count) {
                                    phoneContacts.add(new Contact(firstName, lastName, number));
                                    System.out.println("List numbers: " + phoneContacts.get(i).getLastName().compareTo("A") + " Letter: " + phoneContacts.get(i).getLastName());
                                    System.out.println("New number: " + lastName.compareTo("A") + " New letter: " + lastName);
                                    break;
                                }/*end of if*/ 

                            }/*end of else*/ 

                        }//end of for loop

                    }//end of else

                    break;
                case "p":
                    System.out.println("Phone number Changed!");
                    break;
                case "q":
                    System.out.println("Quit!");
                    break;
                case "s":
                    System.out.println("Current record!");
                    System.out.println(phoneContacts.element() + "\n" + phoneContacts.getFirst());
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;

            }

        } while (!command.equals("q"));
    }

}
