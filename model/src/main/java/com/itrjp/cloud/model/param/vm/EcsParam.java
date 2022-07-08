package com.itrjp.cloud.model.param.vm;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author : renjp
 * @date : 2021-07-31 18:10
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ApiModel("阿里云虚拟机参数")
public class EcsParam extends VirtualMachineParam {
}
