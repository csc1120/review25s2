package wk4.monday;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWriteWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private TextField filePathInput;
    TextArea textArea;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new VBox();

        textArea = new TextArea();
        Label filePathLabel = new Label("Path to file:");
        filePathInput = new TextField();

        Button loadButton = new Button("Load");
        Button saveButton = new Button("Save");
        Button clearButton = new Button("Clear");
        loadButton.setOnAction((ActionEvent event) ->
                loadButtonAction(event));
        clearButton.setOnAction((ActionEvent event) -> {
            textArea.clear();
            filePathInput.clear();
        });

        HBox buttonPane =
                new HBox(loadButton, saveButton, clearButton);

        root.getChildren().addAll(textArea, filePathLabel,
                filePathInput, buttonPane);

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void loadButtonAction(ActionEvent event) {
        try {
            ArrayList<Integer> values =
                    readFile(filePathInput.getText());
            StringBuilder sb = new StringBuilder();
            for(Integer i: values){
                sb.append(i + " ");
            }
            textArea.setText(sb.toString());
        } catch (FileNotFoundException e){
            Alert alert = new Alert(Alert.AlertType.ERROR,
                    "Error can't file the file at "+filePathInput.getText());
            alert.show();

        }
    }
    public void saveButtonAction(ActionEvent event){
        try{
            writeFile(filePathInput.getText(),
                    textArea.getText().split("\\s+"));
        } catch (FileNotFoundException e){

        }

    }
    private ArrayList<Integer> readFile(String filename)
            throws FileNotFoundException{
        ArrayList<Integer> ret = new ArrayList<>();
        try(Scanner fileIn =new Scanner(new File(filename))){
            while(fileIn.hasNext()){
                String value = fileIn.next();
                try {
                    ret.add(Integer.parseInt(value));
                } catch (NumberFormatException e){
                    System.out.println("Invalid valud: "+value);
                }
            }
        }
        return ret;
    }
    private void writeFile(String filename, String[] values)
            throws FileNotFoundException{
        File file = new File(filename);
        try(PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < values.length; i++) {
                printWriter.print(values[i] + " ");
            }
        }
    }
}
