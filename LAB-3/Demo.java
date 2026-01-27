abstract class Figures{
    double a;
    double v;
    abstract void calcArea();
    abstract void calcVol(); 
    abstract void DispArea();
    abstract void DispVol(); 
}

class Cones extends Figures{
        double r;
        double h;
        double l;
        public void calcArea(){
            a=Math.PI*r*l;
        }
        public void calcVol(){
            v=(Math.PI*r*r*h)/3;
        }
        public void DispArea(){
            System.out.println("value of a is->"+a);
        } 
        public void DispVol(){
            System.out.println("value of v is->"+v);
        }
}

class Sphere extends Figures{
        double r;
        double h;
        double l;
        public void calcArea(){
            a=Math.PI*r*r*4;
        }
        public void calcVol(){
            v=(4*Math.PI*r*r*r)/3;
        }
        public void DispArea(){
            System.out.println("value of a is->"+a);
        } 
        public void DispVol(){
            System.out.println("value of v is->"+v);
        }
}

class Cylinder extends Figures{
        double r;
        double h;
        double l;
        public void calcArea(){
            a=Math.PI*2*r*h;
        }
        public void calcVol(){
            v=(Math.PI*r*r*h)/3;
        }
        public void DispArea(){
            System.out.println("value of a is->"+a);
        } 
        public void DispVol(){
            System.out.println("value of v is->"+v);
        }
}


public class Demo{
    public static void main(String[] args) {
        Cones c2=new Cones();
        Sphere c3=new Sphere();
        Cylinder c4=new Cylinder();
        c2.r=2.0;
        c2.h=3.0;
        c2.l=4.0;

        c2.calcArea();
        c2.calcVol();
        c2.DispArea();
        c2.DispVol();

        c3.r=3.0;
        c3.h=4.0;
        c3.l=5.0;

        c3.calcArea();
        c3.calcVol();
        c3.DispArea();
        c3.DispVol();

        c4.r=4.0;
        c4.h=5.0;
        c4.l=6.0;

        c4.calcArea();
        c4.calcVol();
        c4.DispArea();
        c4.DispVol();

    }
}