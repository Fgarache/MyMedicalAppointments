import static  ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name + "\n" + myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "Alejandra@gmail.com");

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("89224421");
        System.out.println(patient.getPhoneNumber());


    }
}
