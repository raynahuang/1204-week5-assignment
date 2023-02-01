package circle;

public class circle {
    int radius;
    int diameter;


    public circle() {

    }

    public circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public int getArea() {
        return (int) Math.PI * (this.radius * this.radius) ;
    }

    public int getParameter() {
        return (int) (Math.PI * this.diameter);
    }
}