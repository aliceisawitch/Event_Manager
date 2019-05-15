package Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

public class StartController {
    public void ShowPass_Changed(ActionEvent actionEvent) {

        if(showPassCheckBox.isSelected()) passwordFieldLogin.setVisible(true);

    }
    @FXML private TextField emailFieldLogin;
    @FXML private PasswordField passwordFieldLogin;
    @FXML private TextField passwordTextFieldLogin;
    @FXML private Button loginButton;
    @FXML private CheckBox showPassCheckBox;
}
