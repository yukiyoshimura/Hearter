package hearter.requestBean;

public class ChatRequestBean {
	   private String name;

	    public ChatRequestBean() {
	    }

	    public ChatRequestBean(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	}