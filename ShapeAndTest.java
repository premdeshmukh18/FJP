class Shape{

    Shape(){
        System.out.println("Inside Shape class Constructor");
    }
    Shape(int a){
        System.out.println("Inside Overloaded Shape class Constructor");
        int ans = Volume(a);
        System.out.println("Volume is "+ans);
    }

    int Volume(int a){
        return a*a*a;
    }

}

class Test extends Shape{

    Test(){
        super();
    }
    Test(int a){
        super(a);
    }

}

public class ShapeAndTest {
    public static void main(String[] args) {

        Test t1 = new Test();
        Test cube = new Test(5);

        
    }
}
