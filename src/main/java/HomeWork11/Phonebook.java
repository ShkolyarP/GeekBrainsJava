package HomeWork11;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {


    private final String surname;

    private List<String> telephoneNumber;
    static List<Phonebook> phonebooks = new ArrayList<>();


    public Phonebook(String surname, List<String> telephoneNumber) {
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;

    }


    public List<String> getTelephoneNumber() {
        return telephoneNumber;
    }

    public static void add(String surname, String telephoneNumber) {

        if (checkingCompliance(surname)) {

            for (Phonebook phonebook : phonebooks
            ) {
                if (phonebook.surname.equals(surname)){
                phonebook.telephoneNumber.add(telephoneNumber);}
            }

        } else {

            List<String> number = new ArrayList<>();
            number.add(telephoneNumber);
            Phonebook book = new Phonebook(surname, number);

            phonebooks.add(book);
        }

    }

    public static void get(String surname) {
        for (Phonebook phonebook : phonebooks
        ) {
            if (phonebook.surname.equals(surname)) {
                System.out.println(surname + " " + phonebook.getTelephoneNumber());
            }
        }
    }

    private static boolean checkingCompliance(String surname) {

        for (Phonebook phonebook : phonebooks
        ) {
            if (phonebook.surname.equals(surname)) {
                return true;
            }
        }
        return false;
    }


}
