package com.ford.scav.interview;

import java.util.ArrayList;
import java.util.List;

public class Messages {
    private List<Message> listOfMessages;

    public Messages() {
        this.listOfMessages =   new ArrayList<Message>();
    }

    //Retrieve the message with the max timestamp that's before the input message
    public Message getMessageBefore(Message inputMessage) {
        //Code goes here
        Message candidateMessage    =   null;
        for (Message m : this.listOfMessages) {
            if (inputMessage.getTimestamp().after(m.getTimestamp())) {
                if (candidateMessage == null) {
                    candidateMessage    =   m;
                } else {
                    if (candidateMessage.getTimestamp().before(m.getTimestamp())) {
                        candidateMessage    =   m;
                    }
                }
            }
        }
        return candidateMessage;
    }

    public void addMessage(Message message){
        this.listOfMessages.add(message);
    }
}
