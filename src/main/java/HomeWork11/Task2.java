package HomeWork11;

public class Task2 {
    public static void main(String[] args) {
        Phonebook.add("Ivanov", "775-35-23");
        Phonebook.add("Petrov", "224-65-56");
        Phonebook.add("Petrov", "224-65-57");
        Phonebook.add("Sidorov", "992-11-13");
        Phonebook.add("Sidorov", "992-11-14");

        Phonebook.get("Petrov");
        Phonebook.get("Ivanov");
        Phonebook.get("Sidorov");

        
    }
}
