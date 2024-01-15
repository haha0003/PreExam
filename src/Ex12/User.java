package Ex12;

import java.util.Random;

public class User {
    private String fullName;
    private String userId;

    public boolean validateUserId(String userId){
        if (userId.length() == 8){
            return true;
        }else return false;
    }

    public void createUserId(String fullName){
        String[] name = fullName.split(" ");
        if (name.length == 2){
            String firstName = name[0];
            String lastName = name[1];

            String firstLetters = firstName.substring(0,2).toLowerCase();
            String lastLetters = lastName.substring(0,2).toLowerCase();

            Random random = new Random();
            int numb = random.nextInt(8999)+1000;

            userId = firstLetters + lastLetters + numb;

            System.out.println(userId);
        }
    }

}
