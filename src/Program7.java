interface Shape {
    float PI = 3.14F;
    float area();
    float perimeter();
}

class Program7 {
    public static void main(String[] args){
        Circle c = new Circle(5);
        System.out.println("Area of Circle: "+c.area());
        System.out.println("Perimeter of Circle: "+c.perimeter());

        Rectangle r = new Rectangle(10,20);
        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Perimeter of Rectangle: "+r.perimeter());

        Square s = new Square(10);
        System.out.println("Area of Square: "+s.area());
        System.out.println("Perimeter of Square: "+s.perimeter());

    }
}

class Circle implements Shape {
    int r;
    Circle(int rad){
        r = rad;
    }


    public float area() {
        return PI*r*r;
    }

    public float perimeter() {
        return 2*PI*r;
    }
}


class Rectangle implements Shape {
    int l, w;
    Rectangle(int len, int wid){
        l = len;
        w = wid;
    }
    public float area() {
        return l*w;
    }

    public float perimeter() {
        return (l+w)*2;
    }
}


class Square implements Shape {
    int s;
    Square(int side){
        s = side;
    }

    public float area() {
        return s*s;
    }

    public float perimeter() {
        return 4*s;
    }
}

