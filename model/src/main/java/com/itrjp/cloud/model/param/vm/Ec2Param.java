package com.itrjp.cloud.model.param.vm;


import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author : renjp
 * @date : 2021-07-31 17:32
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ApiModel("亚马逊虚拟机参数")
public class Ec2Param extends VirtualMachineParam {

}
