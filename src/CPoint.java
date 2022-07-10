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
    public void display(){
        System.out.println("Point" +this);
    }
   public void display(String comment){
        System.out.println(comment + this);
    }

    @Override
    public String
    toString() {
        return "("+ x +","+y +')';
    }

    // Overriding equals() to compare two CPoint objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of CPoint or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof CPoint)) {
            return false;
        }

        // typecast o to CPoint so that we can compare data members
        CPoint c = (CPoint) o;

        // Compare the data members and return accordingly
        return Integer.compare(x, c.x) == 0
                && Integer.compare(y, c.y) == 0;
    }

}
