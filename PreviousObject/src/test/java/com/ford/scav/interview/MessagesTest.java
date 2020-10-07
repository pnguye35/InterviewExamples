package com.ford.scav.interview;


import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class MessagesTest {
    private Messages messages;

    @Before
    public void setup() {
         this.messages  = new Messages();
         messages.addMessage(
                 new Message("First message", new GregorianCalendar(2020, Calendar.NOVEMBER,1).getTime())
         );
        messages.addMessage(
                new Message("Second message", new GregorianCalendar(2020, Calendar.NOVEMBER,2).getTime())
        );
        messages.addMessage(
                new Message("Third message", new GregorianCalendar(2020, Calendar.NOVEMBER,3).getTime())
        );
        messages.addMessage(
                new Message("Fourth message", new GregorianCalendar(2020, Calendar.NOVEMBER,4).getTime())
        );
        messages.addMessage(
                new Message("Fifth message", new GregorianCalendar(2020, Calendar.NOVEMBER,5).getTime())
        );
    }

    @Test
    public void getMessageBefore() {
        Message inputMessage    =   new Message("Input message", new GregorianCalendar(2020, Calendar.NOVEMBER,4).getTime());
        Message  expectedMessage  =   new Message("Third message", new GregorianCalendar(2020, Calendar.NOVEMBER,3).getTime());

        assertEquals(expectedMessage, messages.getMessageBefore(inputMessage));
    }
}