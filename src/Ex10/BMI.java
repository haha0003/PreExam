package Ex10;

public class BMI {
    private double height;
    private double weight;
    private double bmi;

    public void calculate(double height, double weight){
        bmi = 0;
        height = Math.pow(height,2);
        bmi = weight / height;
        System.out.println("BMI: " + bmi);
        System.out.println("Under: " + isUnderWeight());
        System.out.println("Normal: " + isNormalWeight());
        System.out.println("Over: " + isOverWeight());
    }

    public boolean isUnderWeight(){
       return bmi < 18.5;
    }

    public boolean isNormalWeight(){
        return bmi >= 18.5 && bmi <= 25;
    }

    public boolean isOverWeight(){
        return bmi > 25;
    }



}
