package sceneBuilderEvent3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginService {
	
	@FXML private TextField id;
	@FXML private PasswordField pw;
	
	
	public void loginProc(String id, String pw) {
		System.out.println(id);
		System.out.println(pw);
	}
	
	public void cancelProc(TextField id, PasswordField pw) {
		id.clear();
		pw.clear();
		id.requestFocus();
	}
	
	public void registerProc() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("회원가입창으로 이동");
		alert.show();
		
	}
}
