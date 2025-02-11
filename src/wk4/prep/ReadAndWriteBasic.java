package wk4.prep;

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
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWriteBasic extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private TextField filenameField;
    private TextArea textArea;
    @Override
    public void start(Stage stage) throws FileNotFoundException{
        Pane pane = new VBox();

        textArea = new TextArea();
        filenameField = new TextField();
        Button loadButton = new Button("Load");
        loadButton.setOnAction((ActionEvent event) -> loadButton(event));
        Button saveButton = new Button("Save");
        saveButton.setOnAction((ActionEvent event) -> saveButton(event));
        Button clearButton = new Button("Clear");
        clearButton.setOnAction((event) -> {
            textArea.clear();
            filenameField.clear(); });
        HBox buttonPanel = new HBox(loadButton, saveButton, clearButton);

        pane.getChildren().addAll(textArea, new Label("Path to file:"), filenameField, buttonPanel);
        Scene scene = new Scene(pane, 400, 250);
        stage.setScene(scene);
        stage.show();
    }

    private void loadButton(ActionEvent event){
        try {
            ArrayList<Integer>values = readFile(filenameField.getText());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<values.size(); i++){
                sb.append(i + values.get(i)+" ");
            }
            textArea.setText(sb.toString());
        } catch (FileNotFoundException e){
            //System.out.println("Error reading the file at "+filenameField.getText());
            makeAlert("Error reading the file at "+filenameField.getText());
            //Alert alert = new Alert(Alert.AlertType.ERROR,"Error reading the file at "+filenameField.getText() );
            //alert.show();
            textArea.clear();
            filenameField.clear();
        }
    }
    private void saveButton(ActionEvent event){
        try {
            writeFile(filenameField.getText(), textArea.getText().split("\\s+"));
        } catch (FileNotFoundException e){
            //System.out.println("Error reading the file at "+filenameField.getText());
            makeAlert("Error writing the file at "+filenameField.getText());
            textArea.clear();
            filenameField.clear();
        }
    }
    private void makeAlert(String msg){
        Alert alert = new Alert(Alert.AlertType.ERROR, msg);
        alert.show();
    }

    private ArrayList<Integer> readFile(String filename) throws FileNotFoundException {
        ArrayList<Integer> ret = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNext()){
                String input = scanner.next();
                try {
                    ret.add(Integer.parseInt(input));
                } catch (NumberFormatException e){
                    System.out.println("Error parsing the value " + input);
                }
            }
        }
        return ret;
    }
    private void writeFile(String filename, String[] values) throws FileNotFoundException {
        try(PrintWriter printWriter = new PrintWriter(filename)){
            for(int i = 0; i<values.length; i++){
                try{
                    Integer.parseInt(values[i]);
                    printWriter.print(values[i] +" ");
                } catch (NumberFormatException e){
                    System.out.println("Value is not an int: "+values[i]);
                }
            }
        }
    }

}
