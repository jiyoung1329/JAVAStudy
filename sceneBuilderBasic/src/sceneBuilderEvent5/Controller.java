package sceneBuilderEvent5;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private TextField id;
	@FXML private PasswordField pw;
	private Parent regForm;
	
	public void setRegForm(Parent regForm) {
		this.regForm = regForm;
	}

	private LoginService loginSvc;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginSvc = new LoginService();
	}
	
	public void loginProc() {
		System.out.println("regForm : "  + regForm);
		System.out.println("regForm : " + ((TextField)regForm.lookup("#id")).getText());
		loginSvc.loginProc(id.getText(), pw.getText());
	}
	
	public void cancelProc() {
		loginSvc.cancelProc(id, pw);
	}

	public void registerProc() throws Exception {
		loginSvc.registerProc();
	}
	
	public void regCancelProc() {
		System.out.println(id.getText());
		loginSvc.regCancelProc(regForm);
	}
}
