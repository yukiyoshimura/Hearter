package hearter.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import hearter.lib.Utility;
import hearter.requestBean.ChatRequestBean;
import hearter.responseBean.ChatResponseBean;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ChatResponseBean chat(ChatRequestBean message) throws Exception {

    	
        return new ChatResponseBean(Utility.getCurrentTime("yyyy/MM/dd HH:mm") + " | " + HtmlUtils.htmlEscape(message.getMsg()));
    }

}