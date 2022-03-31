package sceneBuilderEvent3;

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
	private LoginService2 loginSvc;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		System.out.println(this);
		loginSvc = new LoginService2();
	}
	
	public void loginProc() {
		loginSvc.loginProc(root);
	}
	
	public void cancelProc() {
		loginSvc.cancelProc(root);
	}

	public void registerProc() {
		loginSvc.registerProc();
	}
}
