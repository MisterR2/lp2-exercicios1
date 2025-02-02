public class Ball {
    private float x;
    private float y;
    private float radius;
    private float xDelta;
    private float yDelta;

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public Ball(float x, float y, float radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    @Override
    public String toString() {
        return "Ball [(" + this.getX() + ", " + this.getY() + ")" + ", Velocidade: (" + this.getXDelta() + ", " + this.getYDelta() + ")";
    }

    public void move(){
        x = this.getX();
        y = this.getY();
        this.setX(x += this.getXDelta());
        this.setY(y += this.getYDelta());
    }

    public void reflectHorizontal(){
        this.setXDelta(-xDelta);
    }

    public void reflectVertical(){
        this.setYDelta(-yDelta);
    }
}
