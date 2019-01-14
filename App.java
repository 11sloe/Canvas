import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;

public class App extends Application
{

    @Override public void start(Stage primaryStage)
    {

        Pane pane = new Pane();  

        // Ein Canvas erstellen
        Canvas canvas = new Canvas(300,200);
        
        // Position des Canvas festlegen
        canvas.setLayoutX(100);
        canvas.setLayoutY(100);
        
        // in die Pane einfügen
        pane.getChildren().add(canvas);

        // Auf das Canvas zeichnen mit Hilfe des GraphicsContexts
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.strokeRect(0,0,299,199);
        gc.setFill(Color.GREEN);

        // Mit Mouse-Events arbeiten:
        Label label = new Label("Klicke in das Rechteck!");
        pane.getChildren().add(label);
        label.setLayoutX(100);
        label.setLayoutY(50);
        
        canvas.setOnMouseClicked(me -> gc.fillOval(me.getX(), me.getY(),10, 10));

        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Beispiel");
        primaryStage.show();

    }

}
