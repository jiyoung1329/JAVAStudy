package sceneBuilderEvent1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Ex1Controller implements Initializable{

	@FXML private TextField id;
	@FXML private PasswordField pw;
	@FXML private Button button;
	
	public void buttonClick() {
		if( emptyCheck() )
			return;
		loginCheck();
	}
	public boolean emptyCheck() {
		if(id.getText().isEmpty()) {
			message("아이디를 입력하세요");
			id.requestFocus();
			return true;
		}
		if(pw.getText().isEmpty()) {
			message("비밀번호를 입력하세요");
			pw.requestFocus();
			return true;
		}
		return false;
	}
	public void loginCheck() {
		MyDB db = new MyDB();
		String dbPw = db.getPw(id.getText());
		if(dbPw != null && dbPw.equals( pw.getText())) {
			message("로그인 성공");
		}else {
			message("로그인 실패");
			pw.clear();
		}
	}
	public void message(String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(content);
		alert.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setOnAction(event->{
			buttonClick();
		});
	}

}
