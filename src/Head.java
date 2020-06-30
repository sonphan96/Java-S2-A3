/** This class use to draw a head of robot.
 *  When created it have all the feature below.
 *  The user can modify x, y Co-ordinate
 *  @author Phan, Truong Son
 *  */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Head {
    private double x;
    private double y;

    /**
     * Constructor to create a head object.
     * @param x coordinate
     * @param y coordinate
     */
    public Head(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Draw function to draw head and neck of robot.
     * @param gc
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillOval(x , y , 30, 30);
        gc.fillRect(x+ 10, y + 30, 5, 5);
    }
}
