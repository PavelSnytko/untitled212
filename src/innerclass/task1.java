package innerclass;

public class task1 {


    public class EnumRunner {
        public  void main(String[] args) {
            int i = 4;
            Shape[] values = Shape.values();
            for (int j = 0; j < values.length; j++) {
                values[j].setShape(3, j--);
            }
            for (Shape f : values) {
                f.setShape(3, i--);
                System.out.println(f.name() + "-> " + f.getParameters() + " площадь= " + f.getSquare());
            }
        }
    }
}
enum Shape {
    RECTANGLE,
    SQUARE,
    TRIANGLE {// анонимный класс
        // версия для TRIANGLE
        public double getSquare() {
            return a * b / 2;
        }
    };

    public double a, b;
    public void setShape(double a, double b) {
        if ((a <= 0 || b <= 0) || a != b && this == SQUARE)
            throw new IllegalArgumentException();
        else
            this.a = a;
        this.b = b;
    }
    // версия для RECTANGLE и SQUARE
    public double getSquare() {
        return a * b;
    }


    public String getParameters() {
        return "a=" + a + ", b=" + b;
    }
}
