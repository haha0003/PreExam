package Ex15;

import java.util.Arrays;

public class UserWNumb {
    private int userNumb;

    UserWNumb(){
    }

    UserWNumb(int userNumb){
        this.userNumb = userNumb;
    }

    public int getUserNumb() {
        return userNumb;
    }

    public void createUser(){
        UserWNumb[] users = new UserWNumb[5];
        for (int i = 0; i < users.length; i++){
            userNumb = i + 1;
            users[i] = new UserWNumb(userNumb);
        }

        for (int i = 0; i < users.length; i++){
            System.out.println(users[i].getUserNumb());
        }

        System.out.println("After sorting: ");
        UserWNumbComparator numbComparator = new UserWNumbComparator();
        Arrays.sort(users, numbComparator);
        for (int i = 0; i < users.length; i++){
            System.out.println(users[i].getUserNumb());
        }

    }



    public static void main(String[] args) {
        UserWNumb u = new UserWNumb();

        u.createUser();
    }


}
