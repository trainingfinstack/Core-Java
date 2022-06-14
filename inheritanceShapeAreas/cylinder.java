package inheritanceShapeAreas;

public class cylinder implements Shapes
{
    private int radius,height;
    public cylinder(int radius,int height)
    {
        this.radius=radius;
        this.height=height;
    }
    public void findShapeArea() 
    {
        System.out.println("Volume of Cylinder :"+Math.PI*radius*radius*height);
    }
    
}
