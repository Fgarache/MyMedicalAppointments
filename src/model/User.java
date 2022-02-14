package model;

public abstract class User {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El numero tiene que tener 8 digitos");
        }else if (phoneNumber.length() == 8) {
            this.phoneNumber = "Telefono: "+phoneNumber;
        }

    }

    @Override
    public String toString() {
        return "User{" +
                " \nNombre=       " + name +
                " \nEmail=        " + email +
                " \nDireccion=    " + address +
                " \nTelefono=     " + phoneNumber;
    }
}