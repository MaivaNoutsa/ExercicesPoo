
class SlantedRectangle extends Rectangle {
    double angle;

    public SlantedRectangle(Point p, double w, double h, double a) {
        super(p, w, h);
        angle = a;
    }
//Partie NAMMI
    public SlantedRectangle(Point p, double w, double h) {
        super(p, w, h);
    }

    public void rotate(double da) {
        angle += da;
    }

    @Override
    public boolean contains(Point pt) {
        return super.contains(pt); 
    }
    /* Partie Yannick Penn */
    
    @Override
    public String toString() {
        return super.toString() + " angle=" + angle; //Conversion de la valeur en string
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SlantedRectangle))
            return false;
        SlantedRectangle other = (SlantedRectangle) obj;
        return super.equals(obj) && this.angle == other.angle;
    }
}