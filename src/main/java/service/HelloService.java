package service;

import dao.HelloDao;
import domain.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class HelloService {

    @EJB
    private HelloDao helloDao;

    public User getUserByID(int id){
        return helloDao.getUserByID(id);
    }
    public void saveUser(User user){
        helloDao.saveUser(user);
    }

    public List<User> getAllUsers(){
       return  helloDao.getAll();
    }
}
