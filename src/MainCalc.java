public class MainCalc {
    public static void main (String[] args){
        double answer;
        
        Calc calculation = new Calc();
        answer = calculation.addition(10,2);
        System.out.println("the result of the addition is: \n" + answer);
    }
}
