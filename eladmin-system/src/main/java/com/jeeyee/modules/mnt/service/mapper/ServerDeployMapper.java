package com.jeeyee.modules.mnt.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.mnt.domain.ServerDeploy;
import com.jeeyee.modules.mnt.service.dto.ServerDeployDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServerDeployMapper extends BaseMapper<ServerDeployDto, ServerDeploy> {

}
