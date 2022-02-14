public class Doctor {
    static int id=0;
    String name, speciality;

    Doctor (){
        System.out.println("metodo constructor   "+name);
        id++;
 }

    public void showName(){
        System.out.println(name);
    }

    public void showId (){
        System.out.println(id);
    }
}
