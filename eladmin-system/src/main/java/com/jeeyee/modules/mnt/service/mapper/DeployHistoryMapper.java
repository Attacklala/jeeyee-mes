package com.jeeyee.modules.mnt.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.mnt.domain.DeployHistory;
import com.jeeyee.modules.mnt.service.dto.DeployHistoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeployHistoryMapper extends BaseMapper<DeployHistoryDto, DeployHistory> {

}
