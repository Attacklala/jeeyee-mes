package com.jeeyee.modules.mnt.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.mnt.domain.Database;
import com.jeeyee.modules.mnt.service.dto.DatabaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DatabaseMapper extends BaseMapper<DatabaseDto, Database> {

}
