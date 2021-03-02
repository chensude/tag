package org.etocrm.tagManager.model.DO;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.etocrm.dynamicDataSource.util.BasePojo;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@JsonInclude(value = Include.NON_NULL)
@TableName("sys_tag_property")
public class SysTagProperty extends BasePojo implements Serializable {

    private static final long serialVersionUID = -1388557479080900017L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "标签ID")
    private Long tagId;

    @ApiModelProperty(value = "属性名称")
    private String propertyName;

    @ApiModelProperty(value = "属性描述")
    private String propertyMemo;

    @ApiModelProperty(value = "规则运算id")
    private Integer ruleRelationshipId;

    @ApiModelProperty(value = "规则信息")
    private List<SysTagPropertyRuleDO> rule;

}