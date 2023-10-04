package dk.easv.mytodoapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btnToDo2InProgress;

    @FXML
    private Button btnInProgress2ToDo;

    @FXML
    private Button btnInProgress2Done;

    @FXML
    private Button btnDone2InProgress;

    @FXML
    private ListView lstTodo;

    @FXML
    private ListView lstInProgress;

    @FXML
    private ListView lstDone;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onCreateNewToDo(ActionEvent actionEvent) {
        lstTodo.setEditable(true);
        lstTodo.setCellFactory(TextFieldListCell.forListView());
        lstTodo.getItems().add("New Todo Item");
    }

    public void OnTodo2InProgress(ActionEvent actionEvent) {
        MoveFromAndToListView(lstTodo, lstInProgress);
    }

    private void MoveFromAndToListView(ListView from, ListView to)
    {
        Object selectedObj = from.getSelectionModel().getSelectedItem();
        if(selectedObj != null)
        {
            to.getItems().add(selectedObj);
            from.getItems().remove(selectedObj);
        }
    }

    public void OnInProgress2Todo(ActionEvent actionEvent) {
        MoveFromAndToListView(lstInProgress, lstTodo);
    }

    public void OnInProgress2Done(ActionEvent actionEvent) {
        MoveFromAndToListView(lstInProgress, lstDone);
    }

    public void OnDone2Inprogress(ActionEvent actionEvent) {
        MoveFromAndToListView(lstDone, lstInProgress);
    }
}