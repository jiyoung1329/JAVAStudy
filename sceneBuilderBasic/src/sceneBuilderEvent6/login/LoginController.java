package sceneBuilderEvent6.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sceneBuilderEvent6.common.CommonService;
import sceneBuilderEvent6.main.Controller;

public class LoginController implements Initializable{
	@FXML private TextField id;
	@FXML private PasswordField pw;
	
	private LoginService loginSvc;
	private Parent loginForm;
	private Controller controller;
	
	public void setController(Controller controller) {
		this.controller = controller;
	}
	public void setLoginForm(Parent loginForm) {
		this.loginForm = loginForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginSvc = new LoginService();
	}

	public void loginProc() {
		LoginDTO loginDto = loginSvc.loginProc(id.getText(), pw.getText());
		if(loginDto != null) {
			// 로그인 성공 시 로그인 창 닫기.
			CommonService.windowClose(loginForm);
			// 로그인 성공 후 메인 화면 실행
			controller.open("Menu");
		}
	}
	
	public void cancelProc() {
		loginSvc.cancelProc(id, pw);
	}
	
	public void regProc() {
		// 회원 가입 화면 실행
		controller.open("Register");
	}

}
