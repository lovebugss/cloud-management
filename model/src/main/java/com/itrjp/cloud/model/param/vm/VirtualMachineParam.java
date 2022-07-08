package com.itrjp.cloud.model.param.vm;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.itrjp.cloud.model.base.BaseParam;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 虚拟机参数
 *
 * @author : renjp
 * @date : 2021-07-31 19:15
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@JsonSubTypes({
        @JsonSubTypes.Type(value = Ec2Param.class, name = "aws"),
        @JsonSubTypes.Type(value = EcsParam.class, name = "ali"),
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", include = JsonTypeInfo.As.PROPERTY)
@ApiModel("虚拟机参数")
public abstract class VirtualMachineParam extends BaseParam {

    public String instId;


}
