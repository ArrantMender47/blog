package top.blog.util.comment.channel;

import top.blog.util.common.SpringContextUtils;

/**
 * 评论提醒方式
 */
public class ChannelFactory {
	/**
	 * 创建评论提醒方式
	 *
	 * @param channelName 方式名称
	 * @return
	 */
	public static CommentNotifyChannel getChannel(String channelName) {
		return SpringContextUtils.getBean("mailChannel", CommentNotifyChannel.class);
	}
}
