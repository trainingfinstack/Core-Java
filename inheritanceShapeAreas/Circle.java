package inheritanceShapeAreas;

public class Circle  implements Shapes
{
    private int radius;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    public void findShapeArea()
    {
        System.out.println("Area od circle :"+Math.PI*radius*radius);
        
    }
    
}
