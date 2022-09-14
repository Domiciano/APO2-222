package model;

import excepcions.EmptyFieldException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    //Estado del test
    private Contact contact;

    //Escenarios del test
    public void setup1(){
        contact = null;
    }

    @Test
    public void correctObjectTest(){
        setup1();
        contact = new Contact("Alfa", "123124", "alfa@gmail.com");
        assertEquals("Alfa", contact.getName());
        assertEquals("123124", contact.getPhone());
        assertEquals("alfa@gmail.com", contact.getEmail());
    }

    @Test
    public void noEmptyFieldsTest(){
        setup1();
        boolean exceptionThrow = false;
        try {
            contact = new Contact(null, "", "");
        }catch (EmptyFieldException ex){
            ex.printStackTrace();
            exceptionThrow = true;
        }
        assertTrue(exceptionThrow);

    }

    @Test
    public void noEmptyFieldsTest2(){
        setup1();
        assertThrows(EmptyFieldException.class, ()->{
            contact = new Contact(null, "", "");
        });
    }

    @Test
    public void onlyNumericOnPhoneFieldAllowedTest(){
        setup1();
        try {
            contact = new Contact("Alfa", "A76325", "email@email.com");
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        assertTrue(contact == null);
        assertEquals(null, contact);
    }


}