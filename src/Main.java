import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "anai@Pediatria.com");
        myDoctor.AgregarCitas(new Date(), "4pm");
        myDoctor.AgregarCitas(new Date(), "10am");
        myDoctor.AgregarCitas(new Date(), "1pm");

        System.out.println(myDoctor);

       /* for (Doctor.CitasDisponibles aa: myDoctor.getCitasDisponibles()) {
            System.out.println(aa.getDate() + " "+aa.getTime());
        }*/


        System.out.println("\n \n");
        Patient patient = new Patient("Alejandra", "Alejandra@gmail.com");
        System.out.println(patient);


    }
}
