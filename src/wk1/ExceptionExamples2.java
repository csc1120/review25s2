package wk1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExamples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;
        int numShapes = 6;
        try {
            List<Shape> shapes = generateList(scanner, numShapes);
            System.out.println(shapes);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid number of shapes");
            System.out.println(e.getMessage());
        }
    }

    public static List<Shape> generateList(Scanner scanner, int numShapes){
        if(numShapes <= 0){
            throw new IllegalArgumentException("Invalid number "+numShapes);
        }
        List<Shape> ret = new ArrayList<>();
        for(int i = 0; i<numShapes; i++) {
            System.out.println("Enter the width and height on a single line separated by a space");
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            try {
                ret.add(createShape(values));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not enough values entered");
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error, entered non numeric value.");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid values for width or height");
                System.out.println(e.getMessage());
            }
        }
        return ret;
    }
    public static Shape createShape(String[] values)
            throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        Shape shape;
        if(values[0].equals("1")){
            shape = createRectangle(values);
        } else if(values[0].equals("2")){
            shape = createSquare(values);
        } else {
            System.out.println("Invalid type "+values[0]);
            throw new IllegalArgumentException("Invalid type "+values[0]);
        }
        return shape;
    }
    public static Rectangle createRectangle(String[] values){
        int width = Integer.parseInt(values[1]);
        int height = Integer.parseInt(values[2]);
        return new Rectangle(width, height);
    }
    public static Square createSquare(String[] values){
        int side = Integer.parseInt(values[1]);
        return new Square(side);
    }
}
