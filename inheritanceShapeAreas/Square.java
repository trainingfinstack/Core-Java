package inheritanceShapeAreas;

public class Square implements Shapes
{
    private int side;
    public Square(int side)
    {
        this.side=side;
    }
    public void findShapeArea() 
    {
        System.out.println("Area of Square :"+side*side);
    }
    
}
