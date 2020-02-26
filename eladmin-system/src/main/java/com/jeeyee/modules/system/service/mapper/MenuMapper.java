package com.jeeyee.modules.system.service.mapper;

import com.jeeyee.base.BaseMapper;
import com.jeeyee.modules.system.domain.Menu;
import com.jeeyee.modules.system.service.dto.MenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends BaseMapper<MenuDto, Menu> {

}
