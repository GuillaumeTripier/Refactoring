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
        return(TelNumber.getTelNumber(this.officeAreaCode, this.number));
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(int officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }
}
