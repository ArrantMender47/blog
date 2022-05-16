package top.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.blog.entity.CityVisitor;
import top.blog.mapper.CityVisitorMapper;
import top.blog.service.CityVisitorService;

/**
 * @Description: 城市访客数量统计业务层实现
 */
@Service
public class CityVisitorServiceImpl implements CityVisitorService {
	@Autowired
	CityVisitorMapper cityVisitorMapper;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void saveCityVisitor(CityVisitor cityVisitor) {
		cityVisitorMapper.saveCityVisitor(cityVisitor);
	}
}
