package learningdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;

@RestController
public class HomeController {
    @RequestMapping("/hello")
    public String hello() {
        return "HELLO WORLD wid mysql";
    }
    @RequestMapping("/testdb")
    public String testdb() {
        String jdbcUrl="jdbc:mysql://mysql-standalone:3306/test";
        String user="root";
        String pass="arpit";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConn= DriverManager.getConnection(jdbcUrl,user,pass);
            return "success";
        }
        catch (Exception e) {
            return "failed";
//            e.printStackTrace();
        }
        finally {
            return "finally";
        }
    }
}
