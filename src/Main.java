import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome on the Maze!");

        CPoint startPosition = new CPoint(0,0);
        CPoint goalPosition = new CPoint(4,2);

        ArrayList<CPoint> walls = new ArrayList<CPoint>();
        walls.add(new CPoint(1,0));
        walls.add(new CPoint(1,1));
        walls.add(new CPoint(3,1));
        walls.add(new CPoint(4,1));
        walls.add(new CPoint(6,1));
        walls.add(new CPoint(1,2));
        walls.add(new CPoint(3,2));
        walls.add(new CPoint(4,3));
        walls.add(new CPoint(5,3));
        walls.add(new CPoint(1,4));
        walls.add(new CPoint(3,4));
        walls.add(new CPoint(1,5));
        walls.add(new CPoint(5,5));

        CMaze maze = new CMaze(7,6, startPosition, goalPosition, walls);

        maze.display();

    }
}