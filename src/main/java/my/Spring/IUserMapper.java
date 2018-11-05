package my.Spring;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface IUserMapper {
    String selectUsername(int UserId);
}
