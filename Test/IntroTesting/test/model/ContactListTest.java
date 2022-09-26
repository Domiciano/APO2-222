package model;

import excepcions.DuplicatedNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactListTest {

    //Estado del test
    private ContactList list;

    //Escenarios

    //Escenario: Lista vacía
    public void setup1(){
        list = new ContactList();
    }

    //Escenerario: 2 contactos en la lista
    public void setup2(){
        list = new ContactList();
        list.addContact(new Contact("A","11111","a@a.com"));
        list.addContact(new Contact("B","22222","b@b.com"));
    }


    @Test
    public void addContactTest(){
        setup1();
        Contact contact = new Contact(
                "Domiciano",
                "456465",
                "domic.rincon@gmail.com"
        );
        list.addContact(contact);
        assertEquals(contact, list.getContacts().get(0));
        assertEquals(1, list.getContacts().size());
    }

    @Test
    public void searchContactByPhoneTest(){
        setup2();
        Contact contact = list.searchContactByPhone("22222");
        assertEquals("22222", contact.getPhone());
        assertEquals("B", contact.getName());
        assertEquals("b@b.com", contact.getEmail());
    }

    @Test
    public void searchNotExistingContactTest(){
        setup2();
        Contact contact = list.searchContactByPhone("123423");
        assertEquals(null, contact);
    }

    @Test
    public void notDuplicatesAllowedTest(){
        setup2();
        Contact contact = new Contact("Alfredo", "11111", "alfred@gmail.com");

        try {
            list.addContact(contact);
        }catch (DuplicatedNumberException ex){
            ex.printStackTrace();
        }
        assertEquals(2, list.getContacts().size());



    }







}