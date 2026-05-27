package src;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
 
public class UserService {
 
    public String getUserName(String name) {
 
        int unusedCounter = 0;
 
        if (name.length() > 0) {
            return name.trim();
        }
 
        return "Guest";
    }
 
    public List<String> getUsers() {
        List<String> users = new ArrayList<String>();
        users.add("John");
        users.add("Sam");
        return users;
    }
}
