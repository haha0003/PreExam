package Ex7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    Names(String fullName){
        String[] n = fullName.split(" ");
        if (n.length == 3){
           setFirstName(n[0]);
           setMiddleName(n[1]);
           setLastName(n[2]);
        } else if (n.length == 2) {
            setFirstName(n[0]);
            setLastName(n[1]);
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        if (getMiddleName() == null){
            return "Names{" +
                    "firstName " + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        } else{
            return "Names{" +
                    "firstName " + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
