package model;

public class Patient  extends User{
    private String Birthday;
    private String blood;
    private double weight;
    private double height;

    public  Patient (String name, String email){
        super(name, email);
    }




    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight() {
        return "Peso: "+weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                " \nT.sangre=     " + getBlood () +
                " \nPeso=         " + getWeight() +
                " \nAltura=       " + getHeight() ;
    }
}



