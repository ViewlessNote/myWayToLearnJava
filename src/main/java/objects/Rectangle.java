package objects;

public class Rectangle {

    private double lenght;
    private double width;
    private int sides = 4;

    public double calculatePerimeter(){
        return (2 * lenght) + (2 * width);
    }
    public double calculateArea(){
        return lenght * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
