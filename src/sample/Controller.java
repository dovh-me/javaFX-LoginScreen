package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

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

    public void signUpBtn(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
            Stage newStage = new Stage();
            newStage.initStyle(StageStyle.UNDECORATED);
            newStage.setScene(new Scene(root, 500,600));
            newStage.show();
            closeBtn();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
