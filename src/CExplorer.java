import java.util.ArrayList;

public class CExplorer {

    private class CCell{
        public CPoint point;
        public int parentInd;

        public CCell(CPoint point, int parentInd){
            this.point = new CPoint(point);
            this.parentInd = parentInd;
        }

        @Override
        public String toString() {
            return "["+ this.parentInd + ", " + this.point + "]";
        }
    }

    // ----------------- ATTRIBUTE(s) ---------------- //
    CMaze maze;
    private ArrayList<CCell> discoveryList;
    private int discoveryList_ind;
    private boolean isGoalReached;


    // ---------------- CONSTRUCTOR(s) --------------- //
    CExplorer(CMaze maze){
        this.maze = maze;                       // Stockage par Reference (Pointer - Address)
        discoveryList_ind = 0;
        this.discoveryList = new ArrayList<CCell>();
        this.discoveryList.add(new CCell(this.maze.getStartPosition(), 0));
        isGoalReached = false;
    }

    // ------------ GETTER(s) & SETTER(s) ------------ //


    // ------------------ METHOD(s) ------------------ //
    public boolean execute(){
        if(this.maze.isGoalReached( this.discoveryList.get(this.discoveryList_ind).point)){
            isGoalReached = true;
            return false;
        }else{
            // Actual Position
            CPoint actualPos = this.discoveryList.get(this.discoveryList_ind).point;
            CPoint posToTest = new CPoint(0,0);

            // Test Down
            posToTest.x = actualPos.x;
            posToTest.y = actualPos.y + 1;
            testFreeAndAlreadyInsertAndAddPointToDiscoveryList(posToTest);

            // Test Right
            posToTest.x = actualPos.x + 1;
            posToTest.y = actualPos.y;
            testFreeAndAlreadyInsertAndAddPointToDiscoveryList(posToTest);

            // Test Up
            posToTest.x = actualPos.x;
            posToTest.y = actualPos.y - 1;
            testFreeAndAlreadyInsertAndAddPointToDiscoveryList(posToTest);

            // Test Left
            posToTest.x = actualPos.x - 1;
            posToTest.y = actualPos.y;
            testFreeAndAlreadyInsertAndAddPointToDiscoveryList(posToTest);

            this.discoveryList_ind++;

            return true;
        }

    }

    private void testFreeAndAlreadyInsertAndAddPointToDiscoveryList(CPoint point){
        if(this.maze.isPositionFree(point) == true){
            if(isInDiscoveryList(point) == false) {
                this.discoveryList.add(new CCell(new CPoint(point), this.discoveryList_ind));
            }
        }
    }

    private boolean isInDiscoveryList(CPoint point){
        for (CCell cell:this.discoveryList) {
            if(cell.point.equals(point)){
                return true;
            }
        }
        return false;
    }

    public void displayDiscoveryList(){
        for(int i = 0; i< this.discoveryList.size(); i++){
            System.out.println( "ind " + i + ": " +this.discoveryList.get(i));
         }
    }

    public void displayShortPath(){
        if(this.isGoalReached == true){
            int parentInd;
            int actualInd = this.discoveryList_ind;
            int cpt = 0;
            do{
                parentInd = this.discoveryList.get(actualInd).parentInd;
                System.out.println(this.discoveryList.get(actualInd).point);
                actualInd = parentInd;
                cpt++;
            }while(parentInd != 0);
            System.out.println(this.discoveryList.get(0).point);
            System.out.println("En " + (cpt+1) + " coups");

        }else{
            System.out.println("Goal Not Reached!!!");
        }
    }

}
