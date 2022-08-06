import javax.swing.ButtonGroup;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Compile Command
// javac --module-path javafx-sdk-18.0.1/lib --add-modules=javafx.controls HelloWorld.java

// Run command
// java --module-path javafx-sdk-18.0.1/lib --add-modules=javafx.controls HelloWorld

public class HelloWorld extends Application {
    private class CustomEventHandler implements EventHandler<ActionEvent> {
        public void handle (ActionEvent event) {
            System.out.println("Hello World");
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage mainStage) {
        mainStage.setTitle("Hello World Program");

        Button btn = new Button();
        btn.setText("Print Hello World!");
        btn.setOnAction(rvent -> System.out.println("hello world"));
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 300);
        mainStage.setScene(scene);
        mainStage.show();
    }

}
