package com.example.SecurityMyBatis.mapper;

import com.example.SecurityMyBatis.model.ChatMessage;
import com.example.SecurityMyBatis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;


@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM MESSAGES")
    ArrayList<ChatMessage> getMessages();

    @Insert("INSERT INTO MESSAGES (username, messagetext) VALUES (#{username} ,#{messageText})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId")
    int insert(ChatMessage message);
}
