package top.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.blog.entity.Friend;

import java.util.List;

/**
 * @Description: 友链持久层接口
 */
@Mapper
@Repository
public interface FriendMapper {
	List<Friend> getFriendList();

	List<top.blog.model.vo.Friend> getFriendVOList();

	int updateFriendPublishedById(Long id, Boolean published);

	int saveFriend(Friend friend);

	int updateFriend(top.blog.model.dto.Friend friend);

	int deleteFriend(Long id);

	int updateViewsByNickname(String nickname);
}
