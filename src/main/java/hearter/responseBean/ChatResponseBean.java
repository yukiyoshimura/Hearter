package hearter.responseBean;

// Subscriberに送信するメッセージを保持するクラス
public class ChatResponseBean {

    private String content;

    public ChatResponseBean() {
    }

    public ChatResponseBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}