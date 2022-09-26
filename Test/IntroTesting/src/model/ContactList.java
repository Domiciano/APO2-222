package model;

import excepcions.DuplicatedNumberException;

import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;

    public ContactList(){
        contacts = new ArrayList<>();
    }
    public void addContact(Contact contact) throws DuplicatedNumberException {
        Contact search = searchContactByPhone(contact.getPhone());
        if(search == null){
            contacts.add(contact);
        }else{
            throw new DuplicatedNumberException();
        }
    }
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public Contact searchContactByPhone(String phone){
        for(int i=0 ; i<contacts.size() ; i++){
            if(  phone.equals(  contacts.get(i).getPhone()  )  ){
                return contacts.get(i);
            }
        }
        return null;
    }
}
