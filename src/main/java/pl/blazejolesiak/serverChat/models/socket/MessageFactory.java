package pl.blazejolesiak.serverChat.models.socket;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MessageFactory {

    public static transient Gson GSON = new GsonBuilder().create();

    public enum MessageType {
        SEND_MESSAGE, USER_JOIN, USER_LEFT, GET_ALL_USERS, SET_NICK, NICK_NOT_FREE;

    }
        private String message;
        private String author;
        private MessageType messageType;

    public MessageType getMessageType() {
        return messageType;
    }

    public void setType(MessageType type) {
        this.messageType = type;
    }

    public MessageFactory() {
        }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public static Gson getGSON() {
        return GSON;
    }

    public static void setGSON(Gson GSON) {
        MessageFactory.GSON = GSON;
    }

}
