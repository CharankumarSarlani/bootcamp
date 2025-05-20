import com.models.ClosedShape;
import com.models.Rectangle;
import com.models.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClosedShape rectangle = new Rectangle(1,3);
        System.out.printf("Area of the rectangle is %d\n", rectangle.area());

        Square square = new Square(2);
        System.out.printf("Area of the square is %d",square.area());

    }
}