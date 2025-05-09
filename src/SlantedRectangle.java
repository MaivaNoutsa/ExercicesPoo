
class SlantedRectangle extends Rectangle {
    double angle;

    public SlantedRectangle(Point p, double w, double h, double a) {
        super(p, w, h);
        angle = a;
    }

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

    
    @Override
    public String toString() {
        return super.toString() + " angle=" + angle;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SlantedRectangle))
            return false;
        SlantedRectangle other = (SlantedRectangle) obj;
        return super.equals(obj) && this.angle == other.angle;
    }
}