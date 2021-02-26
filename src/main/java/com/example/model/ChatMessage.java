package com.example.model;

import lombok.Data;

/**
 * @author
 * @create 2021 - 02 - 26 下午 03:10
 **/
@Data
public class ChatMessage {

    private MessageType type;
    private String contents;
    private String sender;
    private String time;

    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }

}
