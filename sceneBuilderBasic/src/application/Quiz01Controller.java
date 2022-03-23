package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Quiz01Controller implements Initializable {
	
	@FXML private TextField idField;
	@FXML private PasswordField pwField;
	@FXML private Button loginButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MyDB db = new MyDB();
		loginButton.setOnAction(e -> {
			String id = idField.getText();
			String pw = pwField.getText();
			
			if (id.isEmpty()) {
				Alert idEmptyAlert = new Alert(AlertType.INFORMATION);
				idEmptyAlert.setContentText("ID를 입력해주세요.");
				idEmptyAlert.show();
				return;
			} else if (pw.isEmpty()) {
				Alert pwEmptyAlert = new Alert(AlertType.INFORMATION);
				pwEmptyAlert.setContentText("PW를 입력해주세요.");
				pwEmptyAlert.show();
				return;
				
			}
			String dbPw = db.getTable().get(id);
			System.out.println("dbPw : " + dbPw + ", pw : " + pw);
			if (dbPw != null && dbPw.equals(pw)) {
				Alert loginAlert = new Alert(AlertType.INFORMATION);
				loginAlert.setContentText("로그인 성공");
				loginAlert.show();
				return;
				
			} else if (dbPw == null) {
				Alert idAlert = new Alert(AlertType.INFORMATION);
				idAlert.setContentText("아이디가 존재하지 않습니다.");
				idAlert.show();
				return;
			} else if (dbPw != pw){
				Alert pwAlert = new Alert(AlertType.INFORMATION);
				pwAlert.setContentText("비밀번호가 일치하지 않습니다.");
				pwAlert.show();
				return;
			} 
		});
	}

}


