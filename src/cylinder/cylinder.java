package cylinder;

public class cylinder {
    int height;
    int radius;

    public cylinder(){

    }

    public cylinder (int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getVolume() {
        return (int) (Math.PI * (this.radius * this.radius)) * this.height;
    }

}