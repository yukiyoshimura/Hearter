package hearter.requestBean;

// クライアントからのメッセージを格納するクラス
public class ChatRequestBean {
	   private String msg;

	    public ChatRequestBean() {
	    }

	    public ChatRequestBean(String msg) {
	        this.msg = msg;
	    }

	    public String getMsg() {
	        return msg;
	    }

	    public void setMsg(String msg) {
	    	System.out.print("-----" + msg);
	        this.msg = msg;
	    }
	}