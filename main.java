class Square
{
    protected int length;

    Square(int l)
    {
        this.length = l;
    }

    void area()
    {
        System.out.println("Area: " + (length * length));
    }
}

class Rectangle extends Square
{
    protected int breadth;

    Rectangle(int l, int b)
    {
        super(l);
        this.breadth = b;
    }

    void rectarea()
    {
        System.out.println("Rectangle Area is: " + (length * breadth));
    }
}

class Box extends Rectangle
{
    protected int height;

    Box(int l, int b, int h)
    {
        super(l, b);
        this.height = h;
    }

    void volume()
    {
        System.out.println("Volume is: " + (length * breadth * height));
    }
}

class Main
{
    public static void main(String args[])
    {
        Box b1 = new Box(5, 10, 15);
        b1.area();
        b1.rectarea();
        b1.volume();
    }
}
