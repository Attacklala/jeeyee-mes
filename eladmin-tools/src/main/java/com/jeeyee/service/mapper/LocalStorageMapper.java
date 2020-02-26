package com.jeeyee.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.service.dto.LocalStorageDto;
import com.jeeyee.domain.LocalStorage;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-09-05
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocalStorageMapper extends BaseMapper<LocalStorageDto, LocalStorage> {

}