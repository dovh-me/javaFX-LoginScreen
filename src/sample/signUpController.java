package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class signUpController {
    @FXML
    Button closeBtn;

    @FXML
    AnchorPane page2;

    public void closeWindow(){
        Stage thisStage = (Stage) closeBtn.getScene().getWindow();
        thisStage.close();
    }

    public void nextPage(){
        page2.setVisible(true);
    }
    public void prevPage(){
        page2.setVisible(false);
    }
}
