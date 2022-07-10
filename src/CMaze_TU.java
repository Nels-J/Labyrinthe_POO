import java.util.ArrayList;

public class CMaze_TU {

    // ----------------- ATTRIBUTE(s) ---------------- //


    // ---------------- CONSTRUCTOR(s) --------------- //


    // ------------ GETTER(s) & SETTER(s) ------------ //


    // ------------------ METHOD(s) ------------------ //

    public static void main(String[] args) {
        System.out.println("CMaze_TU");

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


        // Mini Test
        if(maze.isGoalReached(startPosition)==false){
            System.out.println("maze.isGoalReached STEP 1.1: OK");
        }else{
            System.out.println("maze.isGoalReached STEP 1.1: NOK");
        }

        if(maze.isGoalReached(goalPosition)==true){
            System.out.println("maze.isGoalReached STEP 1.2: OK");
        }else{
            System.out.println("maze.isGoalReached STEP 1.2: NOK");
        }

        if(maze.isPositionFree(new CPoint(-1,1))==false) {
            System.out.println("maze.isPositionFree STEP 2.1: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 2.1: NOK");
        }

        if(maze.isPositionFree(new CPoint(7,1))==false) {
            System.out.println("maze.isPositionFree STEP 2.2: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 2.2: NOK");
        }

        if(maze.isPositionFree(new CPoint(1,-1))==false) {
            System.out.println("maze.isPositionFree STEP 2.3: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 2.3: NOK");
        }

        if(maze.isPositionFree(new CPoint(1,6))==false) {
            System.out.println("maze.isPositionFree STEP 2.4: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 2.4: NOK");
        }

        if(maze.isPositionFree(new CPoint(1,0))==false) {
            System.out.println("maze.isPositionFree STEP 3.1: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 3.1: NOK");
        }

        if(maze.isPositionFree(new CPoint(3,4))==false) {
            System.out.println("maze.isPositionFree STEP 3.2: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 3.2: NOK");
        }

        if(maze.isPositionFree(new CPoint(2,0))==true) {
            System.out.println("maze.isPositionFree STEP 3.3: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 3.3: NOK");
        }

        if(maze.isPositionFree(new CPoint(4,4))==true) {
            System.out.println("maze.isPositionFree STEP 3.4: OK");
        }else {
            System.out.println("maze.isPositionFree STEP 3.4: NOK");
        }

    }
}
