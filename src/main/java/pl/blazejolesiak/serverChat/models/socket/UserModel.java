package pl.blazejolesiak.serverChat.models.socket;

import org.springframework.web.socket.WebSocketSession;


import java.time.LocalTime;

public class UserModel {
    private String nick;
    private WebSocketSession session;
    private String localTime = LocalTime.now().getHour()+ ":"+ LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();

    public UserModel(WebSocketSession session) {
        this.session = session;
        nick = null;
    }

    public String getLocalTime() {
        return localTime;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public WebSocketSession getSession() {
        return session;
    }

    public void setSession(WebSocketSession session) {
        this.session = session;
    }

}
