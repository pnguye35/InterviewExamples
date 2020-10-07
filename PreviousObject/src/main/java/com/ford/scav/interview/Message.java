package com.ford.scav.interview;

import java.util.Date;

public class Message {
    private String payload;
    private Date timestamp;

    public Message(String payload, Date timestamp) {
        this.payload    =   payload;
        this.timestamp  =   timestamp;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Message)) {
            return false;
        }

        Message message =    (Message) o;
        System.out.println("Printing the Payload : " + this.payload + ":" + message.payload);
        System.out.println("Printing the time : " + this.timestamp + ":" + message.timestamp);
        return (this.payload.equals(message.payload) && this.timestamp.equals(message.timestamp));
    }

    @Override
    public String toString() {
        return "Payload : " + this.payload + ". Time : " + this.timestamp;
    }
}
