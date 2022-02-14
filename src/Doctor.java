public class Doctor {
    static int id=0;
    String name, speciality, email;

    Doctor (){
       System.out.println("El nombre asignado es   "+name);
    }

    Doctor (String name, String speciality){
        System.out.println("nombre "+name);
        id++;
        this.name = name ;
        this.speciality = speciality;

    }

    //comportamientos
    public void showName(){
       // System.out.println(name);
    }

    public void showId (){
        //System.out.println(id);
    }
}
