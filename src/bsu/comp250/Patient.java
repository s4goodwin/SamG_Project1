package bsu.comp250;

public class Patient extends Person{

    String doctor;

    public Patient(String name, int age, String doctor) {
        super(name, age);
        this.doctor=doctor;
    }

    @Override
    public String toString() {
        return super.toString()+" "+doctor;
    }
}
