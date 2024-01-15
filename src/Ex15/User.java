package Ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class User {
    private String user;

    User(){
    }

    User(String user){
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void createUsersReal(){
        User[] users = new User[5];
        for (int i = 0; i < users.length; i++){
            user = "User" + (i + 1);
            users[i] = new User (user);
        }

        users[0] = new User("Poul");

        System.out.println("Before sorting: ");
        for (int i = 0; i < users.length; i++){
            System.out.println("Name: " + users[i].getUser());
        }

        users[3] = new User("Steve");

        System.out.println("After sorting: ");
        UserNameComparator nameComparator = new UserNameComparator();
        Arrays.sort(users, new UserNameComparator());
        for (int i = 0; i < users.length; i++){
            System.out.println("Name: " + users[i].getUser());
        }

        System.out.println("Remove 3rd user from list");
        users[2] = null;


        for (int i = 0; i < users.length; i++){
            if (users[i] != null){
                System.out.println("Name: " + users[i].getUser());
            }
        }

    }
}
