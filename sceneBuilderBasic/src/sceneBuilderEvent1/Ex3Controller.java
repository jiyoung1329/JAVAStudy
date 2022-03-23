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

public class Ex3Controller implements Initializable{

	@FXML private TextField id;
	@FXML private PasswordField pw;
	@FXML private Button button;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		System.out.println(id.textProperty());
		id.textProperty().addListener( (attribute, before, after)->{
//			System.out.println(attribute);
//			System.out.println(before);
//			System.out.println(after);
			idLengthCheck();
		} );
		
		pw.textProperty().addListener((attribute, before, after) ->{
			pwLengthCheck();
		});
		
		button.setOnAction(event->{
			buttonClick();
		});
	}

	public void buttonClick() {
		if( emptyCheck() )
			return;
		loginCheck();
	}
	public void idLengthCheck() {
		if(id.getLength() > 8) {
			String tmp = id.getText();
			tmp = tmp.substring(0, 8);
			id.setText(tmp);
		}
	}
	//01234567890
	public void pwLengthCheck() {
		if(pw.getLength() > 10) {
			String tmp = pw.getText();
			tmp = tmp.substring(0, 10);
			pw.setText(tmp);
		}
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
//			pw.clear();
		}
	}
	public void message(String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(content);
		alert.show();
	}
	

}
