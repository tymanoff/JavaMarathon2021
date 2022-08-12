package day13;

import java.time.LocalDateTime;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private LocalDateTime today;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.today = LocalDateTime.now();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public LocalDateTime getToday() {
        return today;
    }

    public void setToday(LocalDateTime today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender +
                "\nTO: " + receiver +
                "\nON: " + today + "\n" +
                text + "\n";
    }
}
