package de.wingo.kkb.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import de.wingo.kkb.dao.LoginUserDAO;
import de.wingo.kkb.entities.LoginUsers;
 
@Component
public class DataInit implements ApplicationRunner {
 
    private LoginUserDAO loginUserDAO;
 
    @Autowired
    public DataInit(LoginUserDAO loginUserDAO) {
        this.loginUserDAO = loginUserDAO;
    }
 
    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = loginUserDAO.count();
 
        if (count == 0) {
            LoginUsers loginUser1 = new LoginUsers();
 
            loginUser1.setUserName("John");
            loginUser1.setPassword("d7982gdd81d8zd");

            LoginUsers loginUser2 = new LoginUsers();
            
            loginUser2.setUserName("Minja");
            loginUser2.setPassword("cokwklexcnc");
 
            loginUserDAO.save(loginUser1);
            loginUserDAO.save(loginUser2);
        }
 
    }
     
}
