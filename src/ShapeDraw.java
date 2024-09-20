
abstract class Shappe{
    abstract void draw();
}

class Circlle extends Shappe{
    public void draw(){
        System.out.println("Draw a circle");
    }
}

class Rectanglle extends Shappe{
    public void draw(){
        System.out.println("Draw a Rectangle");
    }
}

public class ShapeDraw {
    public static void main(String[] args){
        Shappe shape1 = new Circlle();
        shape1.draw();

        Shappe shape2 = new Rectanglle();
        shape2.draw();
    }
}
