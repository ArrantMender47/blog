package top.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.blog.entity.Tag;
import top.blog.model.vo.TagBlogCount;

import java.util.List;

/**
 * @Description: 博客标签持久层接口
 */
@Mapper
@Repository
public interface TagMapper {
	List<Tag> getTagList();

	List<Tag> getTagListNotId();

	List<Tag> getTagListByBlogId(Long blogId);

	int saveTag(Tag tag);

	Tag getTagById(Long id);

	Tag getTagByName(String name);

	int deleteTagById(Long id);

	int updateTag(Tag tag);

	List<TagBlogCount> getTagBlogCount();
}
