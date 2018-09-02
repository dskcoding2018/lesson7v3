package sample;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoggedInController {
  @FXML
  private JFXTextArea messageArea;
  @FXML
  private JFXTextField userInput;

  public void handleSendMessage(ActionEvent event) {
    messageArea.appendText(userInput.getText() + System.lineSeparator());
  }
}
