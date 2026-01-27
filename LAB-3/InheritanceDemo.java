    class Figure{
        double a;
        double v;
        public void dispArea(){
            System.out.println("value of a is->"+a);
        } 
        public void dispVolume(){
            System.out.println("value of v is->"+v);
        }
    }

    class Cone extends Figure{
        double r;
        double h;
        double l;
        public void calcArea(){
            a=Math.PI*r*l;
        }
        public void calcVolume(){
            v=(Math.PI*r*r*h)/3;
        }
    }

    public class InheritanceDemo{
        public static void main(String[] args) {
            Cone c1=new Cone();
            c1.r=2.0;
            c1.h=3.0;
            c1.l=4.0;
            c1.calcArea();
            c1.dispArea();
            c1.calcVolume();
            c1.dispVolume();
        }   
    }

