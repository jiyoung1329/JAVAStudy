package sceneBuilderEvent6.common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonService {

	public static void msg(String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(content);
		alert.show();
	}
	
	public static void windowClose(Parent form) {
		Stage stage = (Stage)form.getScene().getWindow();
		stage.close();
	}
}
