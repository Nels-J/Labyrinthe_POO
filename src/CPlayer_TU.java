import java.util.ArrayList;

public class CPlayer_TU {

    // ----------------- ATTRIBUTE(s) ---------------- //


    // ---------------- CONSTRUCTOR(s) --------------- //


    // ------------ GETTER(s) & SETTER(s) ------------ //


    // ------------------ METHOD(s) ------------------ //

    public static void main(String[] args) {

        System.out.println("CPlayer_TU");

        CPoint p1 = new CPoint(0,0);
        CPoint p2 = new CPoint(0,0);
        boolean test2 =p1.equals(p2); // return TRUE
        boolean test =(p1 == p2); // return FALSE /!\

        CPlayer play1 = new CPlayer(new CPoint(0,0));

        play1.display();

        CPoint point1 = play1.moveNext();
        System.out.println("moving to left" + point1); // LEFT x-1


        play1.moveAccepted(false);
        point1 = play1.moveNext();
        System.out.println("moving up" + point1); // UP y-1

        play1.moveAccepted(false);
        point1 = play1.moveNext();
        System.out.println("moving right" + point1);

        play1.moveAccepted(false);
        point1 = play1.moveNext();
        System.out.println("moving down" + point1);

        play1.moveAccepted(false);
        point1 = play1.moveNext();
        System.out.println("default NOK" + point1);

        System.out.println("---------INIT--------------");
        CPlayer player2 = new CPlayer(new CPoint(10,10));
        player2.display();

        System.out.println("-----------------------");
        CPoint point2 = player2.moveNext();
        System.out.println(point2);
        player2.display();
        player2.moveAccepted(true);
        player2.display();

        System.out.println("-----------------------");
        point2 = player2.moveNext();
        System.out.println(point2);
        player2.display();
        player2.moveAccepted(true);
        player2.display();

        System.out.println("-----------------------");
        point2 = player2.moveNext();
        System.out.println(point2);
        player2.display();
        player2.moveAccepted(true);
        player2.display();

        System.out.println("-----------------------");
        point2 = player2.moveNext();
        System.out.println(point2);
        player2.display();
        player2.moveAccepted(true);
        player2.display();

        System.out.println("-----------------------");
        point2 = player2.moveNext();
        System.out.println(point2);
        player2.display();
        player2.moveAccepted(true);
        player2.display();

        System.out.println("=====================");
        CPlayer player3 = new CPlayer(new CPoint(0,0));
        CPoint point3 = player3.moveNext();
        player3.moveAccepted(false);
        point3 = player3.moveNext();
        player3.moveAccepted(false);
        point3 = player3.moveNext();
        player3.moveAccepted(false);
        point3 = player3.moveNext();
        player3.moveAccepted(true);
        player3.display();

        point3 = player3.moveNext();
        point3.display();
        player3.moveAccepted(false);
        point3 = player3.moveNext();
        point3.display();
        player3.moveAccepted(false);
        point3 = player3.moveNext();
        point3.display();
        player3.moveAccepted(true);
        player3.display();


    }
}
