// Abstract class representing a Shape
abstract class Shape {
    private String shape;

    // Non-abstract method
    public Shape(String shape) {
        this.shape = shape;
        System.out.println("Shape: " + this.shape);
    }

    // Abstract methods
    public abstract void calculateShape();
    public abstract void calculatePerimeter();
}