package Ex8;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    DateAgeCalculator(){
    }

    public int getDateAge() {
        return dateAge;
    }
    public int getYourAge() {
        return yourAge;
    }

    public void setDateAge(int dateAge) {
        this.dateAge = dateAge;
    }
    public void setYourAge(int yourAge) {
        this.yourAge = yourAge;
    }

    public void acceptableAge(int yourAge){
        setYourAge(yourAge);
        setDateAge(getYourAge() / 2 + 7);
        System.out.println("Lowest date age: " + getDateAge());
    }

    public int tooYoung(int yourAge){
        acceptableAge(yourAge);
        if (getDateAge() < 18){
            System.out.println("Pedo");
        } else
            System.out.println("Mkayy then...");
            return getDateAge();
    }
}
