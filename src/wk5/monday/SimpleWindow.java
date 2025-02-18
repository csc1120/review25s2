package wk5.monday;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class SimpleWindow extends Application {
    private TextField fileInput;
    private TextArea textArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root;

        root = new VBox();

        textArea = new TextArea();
        fileInput = new TextField();
        Button loadButton = new Button("Load");
        Button saveButton = new Button("Save");
        Button clearButton = new Button("Clear");

        EventHandler<ActionEvent> handler = (ActionEvent event) ->{
            fileInput.clear();
            textArea.clear();
        };
        clearButton.setOnAction(handler);//(e) -> {
            //fileInput.clear();
            //textArea.clear();
        //});

        loadButton.setOnAction((e) -> loadButtonAction(e));

        Label fileLabel = new Label("Path to file: ");
        HBox buttonPanel = new HBox(loadButton, saveButton, clearButton);
        root.getChildren().addAll(textArea, fileLabel,
                fileInput, buttonPanel);

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void loadButtonAction(ActionEvent event){
        try{
            ArrayList<Integer> values = loadFile(fileInput.getText());

            Stream<Integer> fileValues = values.stream();
            Stream<String> stringValues;

            Optional<String> msg = fileValues.map(n -> 2 * n).
                    filter(n -> n % 3 != 0).map(String::valueOf).
                    reduce((a,b) -> a+":"+b);
                    //collect(Collectors.toList()).toString();
            textArea.setText(msg.get());

        } catch (FileNotFoundException e){
            System.out.println("Error loading the file");
        }

    }
    public ArrayList<Integer> loadFile(String filename)
            throws FileNotFoundException{
        File fileObject = new File(filename);
        ArrayList<Integer> ret = new ArrayList<>();
        try(Scanner fileIn = new Scanner(fileObject)){
            while(fileIn.hasNext()) {
                try {
                    ret.add(fileIn.nextInt());
                } catch (InputMismatchException e){
                    System.out.println("Bad input value");
                }
            }
        }
        return ret;
    }
}
