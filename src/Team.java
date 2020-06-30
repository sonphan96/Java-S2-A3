/** This class use to draw a team with 3 Robots.
 *  When created it have all the feature below.
 *  The user can modify x, y Co-ordinate,...
 *  @author Phan, Truong Son
 *  */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Team {
    private double x;
    private double y;
    private String name;
    private Player player1, player2, player3 ;
    private double teamAverage;

    /**
     * Constructor to create a team object.
     * @param name
     * @param x
     * @param y
     * @param color
     */
    public Team(String name, double x, double y, Color color){
        this.name = name;
        this.x = x;
        this.y = y;
        player1 = new Player(x, y,color);
        player2 = new Player(x + 150, y,color);
        player3 = new Player(x + 300, y,color);
        teamAverage = (player1.getAverage() + player2.getAverage() + player3.getAverage())/ 3.0;
    }

    /**
     * Draw the team of robot.
     * @param gc
     */
    public void draw(GraphicsContext gc){
        gc.strokeText(name + "team average " + teamAverage,x,y + 70);
        player1.draw(gc);
        player2.draw(gc);
        player3.draw(gc);
    }
}
