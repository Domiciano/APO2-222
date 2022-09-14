package model;

import excepcions.EmptyFieldException;

public class Contact {

    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) throws EmptyFieldException, NumberFormatException {
        if(name == null || name.isEmpty()
                || phone == null || phone.isEmpty()
                || email == null || email.isEmpty()
        ){
            throw new EmptyFieldException();
        }else{
            Integer.parseInt(phone);

            this.name = name;
            this.phone = phone;
            this.email = email;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
