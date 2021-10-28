import java.util.ArrayList;

public class SignUp {

    public int userID = 10000000;
    public ArrayList<int> users = new ArrayList<int>();
    
    users.add(userID);

    int createUserID(int newUserID) {        
        newUserID = users.get(users.size() - 1);
        newUserID++;
        users.add(newUserID);
    }
}