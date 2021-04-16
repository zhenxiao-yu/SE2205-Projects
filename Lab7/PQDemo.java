import java.util.Date;

public class PQDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer, String> reservation = new PriorityQueue<>();
        Date date = new Date();
        int regular = Math.abs((int)date.getTime());
        //patient info
        Patient p1 = new Patient ("Alice",regular);
        Patient p2 = new Patient ("Bob",3);
        Patient p3 = new Patient ("Cat",regular);
        Patient p4 = new Patient ("Dan",regular);
        Patient p5 = new Patient ("Eric",1);
        
        
        reservation.insert(p1.getP(), p1.getN());
        reservation.insert(p2.getP(), p2.getN());
        reservation.insert(p3.getP(), p3.getN());
        reservation.insert(p4.getP(), p4.getN());
        reservation.insert(p5.getP(), p5.getN());

        System.out.println("Patients will be treated in the following order:");
        for (int i = 0; i < p1.getC(); i++) {
            
            System.out.print((i + 1) + ": ");
            System.out.println(reservation.removeMin().getValue());
        }
    }
}
