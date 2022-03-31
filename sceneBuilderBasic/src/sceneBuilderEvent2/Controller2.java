package sceneBuilderEvent2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller2 implements Initializable{
	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(this);
	}
	
	public void loginProc() {
		PasswordField pw = (PasswordField) root.lookup("#pw");
		TextField id = (TextField) root.lookup("#id");
		
		System.out.println(id.getText());
		System.out.println(pw.getText());
	}
	
	public void cancelProc() {
		PasswordField pw = (PasswordField) root.lookup("#pw");
		TextField id = (TextField) root.lookup("#id");

		id.clear();
		pw.clear();
		id.requestFocus();
	}

	public void registerProc() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("회원가입 페이지로 이동합니다.");
		alert.show();
	}
}
