package Ylab;

public class Task17 {
    private final double re;
    private final double im;

    public Task17 (double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + Double.hashCode(re);
        result = 31*result + Double.hashCode(im);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != getClass()){
            return false;
        }

        Task17 t1 = (Task17) obj;
        return t1.re == re && t1.im == im;
    }
}

