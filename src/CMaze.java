import java.util.ArrayList;

public class CMaze {
    //TODO: check method input on CPoint (private boolean isPointInMaze())

    // ----------------- ATTRIBUTE(s) ---------------- //
    private int lengthX;
    private int lengthY;
    private CPoint startPosition;
    private CPoint goalPosition;
    private ArrayList<CPoint> walls;

    // ---------------- CONSTRUCTOR(s) --------------- //

    public CMaze(int lengthX, int lengthY, CPoint startPos, CPoint goalPos, ArrayList<CPoint> walls) {
        this.lengthX = lengthX;
        this.lengthY = lengthY;
        this.startPosition = startPos;
        this.goalPosition = goalPos;
        this.walls = walls;
    }


    // ------------ GETTER(s) & SETTER(s) ------------ //

    public CPoint getStartPosition() {
        return startPosition;
    }


    // ------------------ METHOD(s) ------------------ //

    public boolean isGoalReached(CPoint point){
        if(this.goalPosition.equals(point))
            return true;
        else
            return false;
    }



    public boolean isPositionFree(CPoint point){
        // check x interval
        if( point.x < 0 || point.x >= this.lengthX )
            return false;

        // check y interval
        if( point.y < 0 || point.y >= this.lengthY )
            return false;

        // check walls
        for (CPoint wall:this.walls) {
            if(wall.equals(point))
                return false;
        }
        return true;
    }
    public void display(){
        System.out.println("Maze: " + this.lengthX + "x" + this.lengthY );
        System.out.println("Start position: " + this.startPosition);
        System.out.println("Goal position: " + this.goalPosition);
        System.out.println("Walls: " + this.walls.toString());
    }
}
