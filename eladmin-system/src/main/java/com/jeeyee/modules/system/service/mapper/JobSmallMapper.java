package com.jeeyee.modules.system.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.system.domain.Job;
import com.jeeyee.modules.system.service.dto.JobSmallDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-29
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobSmallMapper extends BaseMapper<JobSmallDto, Job> {

}