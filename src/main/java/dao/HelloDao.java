package dao;

import domain.User;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
@Stateless
public class HelloDao {

    private List<User> storage;

    public HelloDao() {
        this.storage = new ArrayList<>();
        initStorage();
    }

    public User getUserByID(int userID){
       return  storage.get(userID);
    }

    public void saveUser(User user){
        storage.add(user);
    }

    public List<User> getAll(){
        return storage;
    }

    public void initStorage(){
        storage.add(new User(1,"uiop"));
        storage.add(new User(2,"asdf"));
        storage.add(new User(3,"qwer"));
        storage.add(new User(4,"zxcv"));
        storage.add(new User(5,"vbnm"));
    }
}
