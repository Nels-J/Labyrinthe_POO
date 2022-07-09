public class CPoint {
    // ----------------- ATTRIBUTE(s) ---------------- //
    public int x;
    public int y;

    // ---------------- CONSTRUCTOR(s) --------------- //
    public CPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // ---------------- CONSTRUCTOR(s) --------------- //


    // ------------ GETTER(s) & SETTER(s) ------------ //


    // ------------------ METHOD(s) ------------------ //

    @Override
    public String
    toString() {
        return "("+ x +","+y +')';
    }
}
