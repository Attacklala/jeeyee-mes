package com.jeeyee.modules.monitor.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.monitor.domain.Server;
import com.jeeyee.modules.monitor.service.dto.ServerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zhang houying
* @date 2019-11-03
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServerMapper extends BaseMapper<ServerDTO, Server> {

}
