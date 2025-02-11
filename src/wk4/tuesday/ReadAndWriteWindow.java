package wk4.tuesday;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadAndWriteWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private TextField pathInputField;
    private TextArea textArea;
    @Override
    public void start(Stage primaryStage) {

        Pane root = new VBox();

        textArea = new TextArea();
        pathInputField = new TextField();

        Button loadButton = new Button("Load");
        Button saveButton = new Button("Save");
        Button clearButton = new Button("Clear");

        loadButton.setOnAction(e -> loadButtonAction(e));
        saveButton.setOnAction(e -> saveButtonAction(e));
        clearButton.setOnAction((ActionEvent event) ->{
            textArea.clear();
            pathInputField.clear();
        });

        HBox buttonPane = new HBox(loadButton, saveButton, clearButton);

        root.getChildren().addAll(textArea, new Label("Path to file:"),
                pathInputField, buttonPane);

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void saveButtonAction(ActionEvent event){
        String text = textArea.getText();
        String[] values = text.split("\\s+");
        try {
            saveFileValue(pathInputField.getText(), values);
        } catch (FileNotFoundException e){
            Alert alert = new Alert(Alert.AlertType.WARNING,
                    "Error loading the file "+pathInputField.getText());
            alert.show();
        }

    }
    private void saveFileValue(String filename, String[] values)
            throws FileNotFoundException{
        try(PrintWriter printWriter = new PrintWriter(new File(filename))){
            for(int i = 0; i<values.length; i++){
                printWriter.print(values[i] + " ");
            }
        }
    }

    public void loadButtonAction(ActionEvent event) {
        try {
            ArrayList<Integer> values =
                    readFile(pathInputField.getText());
            StringBuilder sb = new StringBuilder();
            for(Integer i:values){
                sb.append(i+ " ");
            }
            textArea.setText(sb.toString());
        } catch (FileNotFoundException e){
            showAlert("Error loading the file "+pathInputField.getText());
        }
    }

    private void buttonPress(ActionEvent event){

        try{
            Button source = (Button)event.getSource();
            if(source.getText().equals("Gray")){

            }
        } catch (Exception e){

        }

    }
    private void showAlert(String msg){
        Alert alert = new Alert(Alert.AlertType.WARNING, msg);
        alert.show();
    }
    private ArrayList<Integer> readFile(String filename)
            throws FileNotFoundException {
        //read the file and then store the contents in the arraylist
        ArrayList<Integer> ret = new ArrayList<>();
        try(Scanner fileIn = new Scanner(new File(filename))){
            while(fileIn.hasNext()) {
                if (fileIn.hasNextInt()) {
                    ret.add(fileIn.nextInt());
                } else {
                    String v = fileIn.next();
                    System.out.println("Skipping "+v);
                }
            }

        }
        return ret;
    }
}



//            while(fileIn.hasNext()) {
//                try {
//                    ret.add(fileIn.nextInt());
//                }catch (InputMismatchException e){
//                    System.out.println("Error reading a value");
//                }
//            }