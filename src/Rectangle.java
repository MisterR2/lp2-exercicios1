public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Método para obter o comprimento
    public float getLength() {
        return length;
    }

    // Método para definir o comprimento
    public void setLength(float length) {
        this.length = length;
    }

    // Método para obter a largura
    public float getWidth() {
        return width;
    }

    // Método para definir a largura
    public void setWidth(float width) {
        this.width = width;
    }

    // Método para calcular a área
    public double getArea() {
        return length * width;
    }

    // Método para calcular o perímetro
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    public static void test(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // default constructor
        System.out.println(r2);

        // Test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
