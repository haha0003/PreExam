package Ex15;

import java.util.Comparator;

public class UserWNumbComparator implements Comparator <UserWNumb> {

    @Override
    public int compare(UserWNumb o1, UserWNumb o2) {
        return Integer.compare(o2.getUserNumb(), o1.getUserNumb());
    }
}
