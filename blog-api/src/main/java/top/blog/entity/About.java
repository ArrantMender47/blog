package top.blog.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 关于我
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class About {
	private Long id;
	private String nameEn;
	private String nameZh;
	private String value;
}
