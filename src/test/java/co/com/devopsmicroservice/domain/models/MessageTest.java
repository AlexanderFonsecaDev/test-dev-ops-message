package co.com.devopsmicroservice.domain.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    public static final Long ID = 1L;
    public static final String MESSAGE = "This is a Test";
    public static final String SENDER = "Juan Perez";
    public static final String RECEIVER  = "Rita Austria";
    public static final int TIMETOLIFESEC = 45;

    @Test
    public void testCreateMessage(){
        Message message = new Message(ID, MESSAGE, SENDER, RECEIVER, TIMETOLIFESEC);
        assertEquals(ID, message.getId());
        assertEquals(MESSAGE, message.getMessage());
        assertEquals(SENDER, message.getSender());
        assertEquals(RECEIVER, message.getReceiver());
        assertEquals(TIMETOLIFESEC, message.getTimeToLifeSec());
    }


}