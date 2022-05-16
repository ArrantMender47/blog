package top.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.blog.entity.User;

/**
 * @Description: 用户持久层接口
 */
@Mapper
@Repository
public interface UserMapper {
	User findByUsername(String username);

	User findById(Long id);
}
