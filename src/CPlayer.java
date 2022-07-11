import java.util.ArrayList;

public class CPlayer {


    // ----------------- ATTRIBUTE(s) ---------------- //
    private CPoint position;
    private CPoint proposedPosition;
    private ArrayList<CPoint> ariane;
    private boolean boolMoveAccepted;
    private int fsmState;


    // ---------------- CONSTRUCTOR(s) --------------- //
    public CPlayer(CPoint startPosition) {
        this.position = startPosition;
        this.proposedPosition = new CPoint(0,0);
        this.ariane = new ArrayList<CPoint>();
        this.ariane.clear();
        this.ariane.add(new CPoint(this.position.x, this.position.y));
        this.boolMoveAccepted = true;
        this.fsmState = 0; // LEFT
    }


    // ------------ GETTER(s) & SETTER(s) ------------ //


    public CPoint getPosition() {
        return position;
    }

    // ------------------ METHOD(s) ------------------ //
    public CPoint moveNext(){
        // state definition
        if(boolMoveAccepted==true){
            this.fsmState = 0; //LEFT
        }else {
            this.fsmState++;
        }

        // state actions
        switch (this.fsmState){

            // DOWN
            case 0:
                this.proposedPosition.x = this.position.x;
                this.proposedPosition.y = this.position.y+1;
                if(checkPreviousPosition(this.proposedPosition)){
                    fsmState++;
                }else {
                    break;
                }

            // RIGHT
            case 1:
                this.proposedPosition.x = this.position.x+1;
                this.proposedPosition.y = this.position.y;
                if(checkPreviousPosition(this.proposedPosition)){
                    fsmState++;
                }else {
                    break;
                }

            // UP
            case 2:
                this.proposedPosition.x = this.position.x;
                this.proposedPosition.y = this.position.y-1;
                if(checkPreviousPosition(this.proposedPosition)){
                    fsmState++;
                }else {
                    break;
                }

           // LEFT
            case 3:
                this.proposedPosition.x = this.position.x-1;
                this.proposedPosition.y = this.position.y;
                if(checkPreviousPosition(this.proposedPosition)){
                    fsmState++;
                }else{
                    break;
                }

            default:
                System.out.println("CPLAYER error in fsm switch");
                this.proposedPosition.x = this.position.x;
                this.proposedPosition.y = this.position.y;
                fsmState = 0;
                break;
        }

        this.boolMoveAccepted = false;

        return this.proposedPosition;

    }

    private boolean checkPreviousPosition(CPoint position){
        if(this.ariane.size()>=2) {
            if(position.equals(this.ariane.get(this.ariane.size() - 2))){
                System.out.println(position + "already in ariane");
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public void moveAccepted(boolean status){
        if(status == true) {
            this.position.x = this.proposedPosition.x;
            this.position.y = this.proposedPosition.y;
            this.ariane.add(new CPoint(this.position.x, this.position.y));
        }
        this.boolMoveAccepted = status;
    }

    public void display(){
        System.out.println("Actual position: " + this.position);
    }

}
