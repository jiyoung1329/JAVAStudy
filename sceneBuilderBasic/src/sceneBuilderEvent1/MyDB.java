package sceneBuilderEvent1;

import java.util.HashMap;

public class MyDB {
	private HashMap<String, String> table;
	
	public MyDB() {
		table = new HashMap<String, String>();
		table.put("admin", "1234");
		table.put("user1", "1111");
		table.put("user2", "2222");
	}

	public String getPw(String viewId) {
		return table.get(viewId);
	}
}
