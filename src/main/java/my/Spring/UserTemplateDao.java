package my.Spring;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserTemplateDao {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public String getUsername(int UserId){
        return sqlSessionTemplate.selectOne("my.Spring.IUserMapper.selectUsername",UserId);
//        IUserMapper iUserMapper = sqlSessionTemplate.getMapper(IUserMapper.class);
//        return iUserMapper.selectUsername(UserId);
    }

}
