package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
  @FXML
  private MenuItem menuItemClose;

  @FXML
  private JFXTextField username;
  @FXML
  private JFXPasswordField password;

  @FXML
  private JFXButton buttonLogin;

  private ArrayList<User> userList;

  public void handleClose(ActionEvent event) {
    System.exit(0);
  }

  public void handleLogin(ActionEvent event) {
    if(userList == null) {
      userList = new ArrayList<>();
      userList.add(new User());
    }

    boolean success = false;

    for(User user: userList) {
      if(user.doLogin(username.getText(), password.getText())) {
        success = true;
      }
    }

    if(success) {
      doLogin("loggedIn.fxml", event);
    }
  }

  public void doLogin(String fxml, Event event) {

    Parent fxmlStage = null;
    try {
      fxmlStage = FXMLLoader.load(getClass().getResource(fxml));
      Scene scene = new Scene(fxmlStage);
      Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
