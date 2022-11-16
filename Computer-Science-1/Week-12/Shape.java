/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Yfirklasi fyrir Rectangle og Triangle
 *
 *
 *****************************************************************************/

public class Shape {
    //  tilviksbreytur
    private double height;
    private double width;

    // setterar og getterar
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    // prófa klasann
    public static void main(String[] args) {
        Shape s = new Shape ();
        s.setHeight (3.0);
        s.setWidth(4.0);
        System.out.println (s);
    }
}
