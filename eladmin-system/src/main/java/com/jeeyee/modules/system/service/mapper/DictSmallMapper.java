package com.jeeyee.modules.system.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.system.domain.Dict;
import com.jeeyee.modules.system.service.dto.DictSmallDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictSmallMapper extends BaseMapper<DictSmallDto, Dict> {

}