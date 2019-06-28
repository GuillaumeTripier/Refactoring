public class Main {

    public static void main(String[] args) {
        Person person = new Person("Bob");
        person.setNumber(64122892);
        person.setOfficeAreaCode(01);
        System.out.println(person.getTelNumber());
    }
}
