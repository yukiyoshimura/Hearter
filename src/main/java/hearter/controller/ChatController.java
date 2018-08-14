package hearter.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import hearter.requestBean.ChatRequestBean;
import hearter.responseBean.ChatResponseBean;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ChatResponseBean chat(ChatRequestBean message) throws Exception {
    	
    	LocalDateTime date = LocalDateTime.now();
    	date.toString();
    	
    	ZonedDateTime now = ZonedDateTime.now();
    	String nowString = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
    	
    	
   // 	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
   // 	LocalDateTime current_time = 
   // 	String current_time = date.format(formatter);
    	
    	
        Thread.sleep(1000); // simulated delay
        return new ChatResponseBean(nowString + " | " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}