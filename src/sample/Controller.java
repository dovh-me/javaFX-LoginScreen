package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    Button loginBtn;

    public void loginAnimationOnEnter(){
        loginBtn.setText("LOGIN >>>");
    }
    public void loginAnimationOnExit(){
        loginBtn.setText("LOGIN");
    }
    public void closeBtn(){
        Stage thisStage = ((Stage) loginBtn.getScene().getWindow());
        thisStage.close();
    }
}
