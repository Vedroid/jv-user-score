package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    
    public int getUserScore(String[] records, String email) {
        for (String userInfo : records) {
            String[] userRecord = userInfo.split(":");
            if (userRecord[0].equals(email)) {
                return Integer.parseInt(userRecord[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
