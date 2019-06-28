public class Person {
    private String name;
    private int number;
    private int officeAreaCode;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getTelNumber(){
        return("" + this.officeAreaCode + "" + number);
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private int getOfficeAreaCode() {
        return officeAreaCode;
    }

    private void setOfficeAreaCode(int officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }
}
