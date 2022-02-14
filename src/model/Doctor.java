package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;




    public  Doctor (String name, String email){
        super(name, email);
        System.out.println("nombre "+name);
        this.speciality = speciality;

    }


    ArrayList <CitasDisponibles> citasDisponibles = new ArrayList<>();
    public void AgregarCitas (Date date, String time){
        citasDisponibles.add(new CitasDisponibles(date, time));
    }
    public ArrayList<CitasDisponibles> getCitasDisponibles(){
        return citasDisponibles;
    }


public static class CitasDisponibles {
    private int id_cita;
    private Date date;
    private String time;




    public CitasDisponibles(Date date, String time) {
        this.date = date;
        this.time = time;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CitasDisponibles \n" +
                "Fecha=     " + date +
                "Hora=      " + time;
    }
}

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidad    =" + speciality+
                "\nCitas           =" + citasDisponibles.toString() ;
    }
}
