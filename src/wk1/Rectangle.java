package wk1;

public class Rectangle implements Shape {
    private int width;
    protected int height;

    public Rectangle(int width, int height) {
        if(height < 0 || width < 0){
            throw new IllegalArgumentException("Dimensions should be positive " +
                    "("+width+","+height+")");
        }
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
