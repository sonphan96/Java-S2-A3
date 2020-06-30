
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Phan, Truong Son
 */
public class Assignment3 extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        
        Canvas canvas = new Canvas(650, 450); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 

        // Create 3 team object with different value
        Team team1 = new Team("Team A", 50,50, Color.GREEN);
        Team team2 = new Team("Team B", 50,200, Color.BLUE);
        Team team3 = new Team("Team C", 50,350, Color.RED);

        // Create referee object with Player class
        Player referee = new Player(500,200, Color.GREEN, "Referee");

        // Draw all the players and referee
        team1.draw(gc);
        team2.draw(gc);
        team3.draw(gc);
        referee.draw(gc);
        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
