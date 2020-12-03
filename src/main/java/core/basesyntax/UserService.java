package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    
    public int getUserScore(String[] records, String email) {
        for (String userInfo : records) {
            if (userInfo.split(":")[0].equals(email)) {
                return Integer.parseInt(userInfo.split(":")[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
