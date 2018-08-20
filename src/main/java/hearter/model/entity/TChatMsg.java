package hearter.model.entity;

import lombok.Data;

@Data
public class TChatMsg {

	private String chatId;
	
	private String userId;
	
	private String msg;
	
	private String delete_flg;
	
}
