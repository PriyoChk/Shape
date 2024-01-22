public class Shape {
    void draw();
    
}
public class Rectangle implements Shape{

    @Override
    public void draw()
    {
        System.out.println("Inside Rectangle::draw()method.");
    }
}

public class Square implements Shape{
    @Override
    public void draw()
    {
        System.out.println("Inside Square::draw()method");
    }
}
public class ShapeFactory{
    public Shape getsShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
            } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
            }
            return null;
    }
}

public class FactoryPatternDemo{
    public static void main(String[] args){
        ShapeFactory sf =new ShapeFactory();
        Shape S1=sf.getsShape("CIRCLE");
        S1.draw();
        Shape S2=sf.getsShape("RECTANGLE");
        S2.draw();
    }
}