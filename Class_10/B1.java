
package inheritance;


public class B1  extends A1 {
    int p;
    int q;

    public B1() {
    }

    public B1(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public B1(int x, String y) {
        super(x, y);
    }
    
}
