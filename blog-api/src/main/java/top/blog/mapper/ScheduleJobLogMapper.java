package top.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.blog.entity.ScheduleJobLog;

import java.util.List;

/**
 * @Description: 定时任务日志持久层接口
 */
@Mapper
@Repository
public interface ScheduleJobLogMapper {
	List<ScheduleJobLog> getJobLogListByDate(String startDate, String endDate);

	int saveJobLog(ScheduleJobLog jobLog);

	int deleteJobLogByLogId(Long logId);
}
