package com.itrjp.cloud.core.exception;

/**
 * @author : renjp
 * @date : 2021-07-31 18:51
 **/
public class InvalidCloudTypeException extends RuntimeException {
    public InvalidCloudTypeException() {
        super("无效的云类型");
    }
}
