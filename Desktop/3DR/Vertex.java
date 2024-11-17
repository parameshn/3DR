import java.awt.Color;

public class Vertex {

    double x;
    double y;
    double z;

    Vertex(double x,double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
}

class Triangle {
    Vertex v1;
    Vertex v2;
    Vertex v3;
    Color color;

    Triangle(Vertex v1, Vertex v2, Vertex v3, Color color) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.color = color;
    }
}

