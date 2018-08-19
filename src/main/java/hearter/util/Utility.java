package hearter.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Utility {
	
	/*  
	 * システム日付を取得するメソッド
	 *  引数: 日付フォーマット
	 *  戻り値: String
	 */ 
	public static String getCurrentTime(String format) {	
    	ZonedDateTime now = ZonedDateTime.now();
    	return now.format(DateTimeFormatter.ofPattern(format));
//		Optional<String> format_str = Optional.ofNullable(format);
//		format = format_str.orElse("yyyy/MM/dd HH:mm");
	}
	
}
