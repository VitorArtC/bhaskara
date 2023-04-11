package bhaskara;

public class bhaskaraclass1 {
    private int a;
    private int b;
    private int c;

    public bhaskaraclass1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public double valordelta() {
        return Math.pow(b, 2)-(4*a*c);
    }
    
    public double denominador() {
        return 2*a;
    }
    
    public double numeradorx1() {
        return b+Math.sqrt(valordelta());
    }
    
    public double numeradorx2() {
        return b-Math.sqrt(valordelta());
    }
    
    public double x1() {
        return numeradorx1()/denominador();
    }
    
    public double x2() {
        return numeradorx2()/denominador();
    }
    
    public void print() {
        if(valordelta()==0) {
            System.out.println("X1 = X2 = "+ x1());
        } else if (valordelta()!=0 && valordelta()>0) {
            System.out.println("X1: "+ x1());
            System.out.println("X2: "+ x2());
        } else {
            System.out.println("Raiz não existe!");
        }
    }

    
}
