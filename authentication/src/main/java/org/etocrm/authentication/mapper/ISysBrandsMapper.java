package org.etocrm.authentication.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.etocrm.authentication.entity.DO.SysBrandsDO;

/**
 * <p>
 * 系统品牌信息表  Mapper 接口
 * </p>
 *
 * @author lingshuang.pang
 * @Date 2020-09-01
 */
@Mapper
public interface ISysBrandsMapper extends BaseMapper<SysBrandsDO> {

}