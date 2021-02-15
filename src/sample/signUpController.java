package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class signUpController {
    @FXML
    Button closeBtn;

    public void closeWindow(){
        Stage thisStage = (Stage) closeBtn.getScene().getWindow();
        thisStage.close();
    }
}
