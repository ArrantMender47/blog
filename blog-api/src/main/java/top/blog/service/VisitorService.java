package top.blog.service;

import org.springframework.scheduling.annotation.Async;
import top.blog.entity.Visitor;
import top.blog.model.dto.VisitLogUuidTime;

import java.util.List;

public interface VisitorService {
	List<Visitor> getVisitorListByDate(String startDate, String endDate);

	List<String> getNewVisitorIpSourceByYesterday();

	boolean hasUUID(String uuid);

	@Async
	void saveVisitor(Visitor visitor);

	void updatePVAndLastTimeByUUID(VisitLogUuidTime dto);

	void deleteVisitor(Long id, String uuid);
}
