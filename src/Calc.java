public class Calc {
    /**
     * @author: Hejociara do Vale
     * @date: 2021
     * @since: 1.0
     */
     double result;

    public double addition(double X, double Y){
        result = X + Y;
        return result;
    }
    public double subtraction(double X, double Y){
        result = X - Y;
        return result;
    }
    public double multiplication(double X, double Y){
        result = X * Y;
        return result;
    }
    public double division(double X, double Y){
        if(Y!=0)
            result = X/Y;
        else
            result = 0;
        return result;
    }
}
