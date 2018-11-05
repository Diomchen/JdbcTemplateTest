package my.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public String selectUser(int userId){
        String sql = "select username from user where userId = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{userId},String.class);
    }

}
