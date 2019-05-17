package Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

public class StartController {

    @FXML private TextField emailFieldLogin;
    @FXML private PasswordField passwordFieldLogin;
    @FXML private TextField passwordTextFieldLogin;
    @FXML private Button loginButton;
    @FXML private CheckBox showPassCheckBox;

    //This method is hiding and showing password
    public void ShowPass_Changed(ActionEvent actionEvent) {
        //Mechanism showing password
        if(showPassCheckBox.isSelected()) {
            passwordTextFieldLogin.setText(passwordFieldLogin.getText());
            passwordTextFieldLogin.setVisible(true);
        }
        else {
            passwordFieldLogin.setText(passwordTextFieldLogin.getText());
            passwordTextFieldLogin.setVisible(false);

        }

    }
}
