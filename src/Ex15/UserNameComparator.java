package Ex15;

import java.util.Comparator;

public class UserNameComparator implements Comparator <User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getUser().compareTo(o2.getUser());
    }
}
