import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent; 
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.geometry.Orientation;

/**
 * @author 
 */
public class Painter extends Application {
  //Borderpane
  private BorderPane borderPane;
  //Canvas
  private Canvas canvas;
  
  public void start(Stage primaryStage) {
    //Initializing private fields
    borderPane = new BorderPane();
    canvas = new Canvas(500,500);
    GraphicsContext getc = canvas.getGraphicsContext2D();
    ColorPicker colorPicker = new ColorPicker(Color.BLACK);
    Slider penSlider = new Slider(1,101,10);
    penSlider.setOrientation(Orientation.VERTICAL);
    penSlider.setShowTickMarks(true);
    penSlider.setShowTickLabels(true);
    penSlider.setMajorTickUnit(10);
    penSlider.setBlockIncrement(1);
    
    canvas.setOnMouseDragged(e -> {
      getc.setFill(colorPicker.getValue());
      double penSize = penSlider.getValue();
      //Adjusted for the placement of the circle because it was annoying me
      //Edit: turns out I just unknowingly did some of task 6
      getc.fillOval(e.getX()-penSize/2,e.getY()-penSize/2,penSize,penSize);
    });
                             
    BorderPane pane = new BorderPane();      // create a 5 region layout for the window
    pane.setCenter(canvas);
    pane.setTop(colorPicker);
    pane.setRight(penSlider);

    Scene scene = new Scene(pane);           // Create a "scene" that contains this border area

    primaryStage.setTitle("Lab 13");
    primaryStage.setScene(scene);            // Add the "scene" to the main window
    primaryStage.show();                     // Display the window
  }
  
  public static void main(String[] args) {
     Application.launch(args);
  }
}







