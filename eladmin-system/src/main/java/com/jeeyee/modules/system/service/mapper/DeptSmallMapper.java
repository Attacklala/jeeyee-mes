package com.jeeyee.modules.system.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.system.domain.Dept;
import com.jeeyee.modules.system.service.dto.DeptSmallDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends BaseMapper<DeptSmallDto, Dept> {

}