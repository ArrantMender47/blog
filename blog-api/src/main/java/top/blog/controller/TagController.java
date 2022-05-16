package top.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.blog.annotation.VisitLogger;
import top.blog.enums.VisitBehavior;
import top.blog.model.vo.BlogInfo;
import top.blog.model.vo.PageResult;
import top.blog.model.vo.Result;
import top.blog.service.BlogService;

/**
 * @Description: 标签
 */
@RestController
public class TagController {
	@Autowired
	BlogService blogService;

	/**
	 * 根据标签name分页查询公开博客列表
	 *
	 * @param tagName 标签name
	 * @param pageNum 页码
	 * @return
	 */
	@VisitLogger(VisitBehavior.TAG)
	@GetMapping("/tag")
	public Result tag(@RequestParam String tagName,
	                  @RequestParam(defaultValue = "1") Integer pageNum) {
		PageResult<BlogInfo> pageResult = blogService.getBlogInfoListByTagNameAndIsPublished(tagName, pageNum);
		return Result.ok("请求成功", pageResult);
	}
}
