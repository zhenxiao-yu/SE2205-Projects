
public class Patient {

    private int patientPriority;
    private String Name;
    public static int c = 0;

    public Patient(String name, int priorityLevel) {
        this.Name = name;
        this.patientPriority = priorityLevel;
        c++;

    }

    Patient() {

    }

    public int getP() {
        return patientPriority;
    }

    public String getN() {
        return Name;
    }

    public int getC() {
        return c;
    }
}
