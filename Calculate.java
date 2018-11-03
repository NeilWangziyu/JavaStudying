public class Calculate {
    final float PI = 3.14159f;
    public float getArea(float r){
        float area = PI*r*r;
        return area;
    }

    public float getArea(float l, float w){
        float area = l * w;
        return area;
    }

    public void draw(int num){
        System.out.println("draw" + num + "pictures");

    }

    public void draw(String shape){
        System.out.println("draw"+shape);
    }

    public static void main(String[] args){
        Calculate calculate = new Calculate();
        float l = 20;
        float w = 30;
        float areaRectangle = calculate.getArea(l, w);
        System.out.println("area "+l+" and "+w+" is "+areaRectangle);
    }
}
