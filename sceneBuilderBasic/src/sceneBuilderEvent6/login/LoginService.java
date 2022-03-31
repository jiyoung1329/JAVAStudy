package sceneBuilderEvent6.login;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sceneBuilderEvent6.common.CommonService;

public class LoginService {
	
	public LoginDTO loginProc(String id, String pw) {
		LoginDAO loginDao = new LoginDAO();
		LoginDTO loginDto = loginDao.selectId(id);
		if(loginDto != null && loginDto.getPw().equals(pw)) {
			CommonService.msg("로그인 성공");
			return loginDto;
		}else {
			// 로그인 실패
			CommonService.msg("로그인 실패");
			return null;
		}
	}
	
	public void cancelProc(TextField id, PasswordField pw) {
		id.clear(); pw.clear();
		id.requestFocus();
	}
	
}
