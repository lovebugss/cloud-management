package com.itrjp.cloud.service.amazon.ec2;

import com.itrjp.cloud.core.service.VirtualMachineService;
import com.itrjp.cloud.model.base.Certificate;
import com.itrjp.cloud.model.base.amazon.AmazonCertificate;
import com.itrjp.cloud.model.param.vm.Ec2Param;
import com.itrjp.cloud.model.param.vm.VirtualMachineParam;
import com.itrjp.cloud.model.vo.vm.VirtualMachineVO;
import com.itrjp.cloud.service.amazon.AmazonCloud;
import com.itrjp.cloud.service.amazon.client.AmazonCloudClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.core.SdkClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.StartInstancesRequest;
import software.amazon.awssdk.services.ec2.model.StartInstancesResponse;

/**
 * @author : renjp
 * @date : 2021-07-31 17:43
 **/
@Service
@Slf4j
public class AmazonEc2ServiceImpl extends AmazonCloud implements VirtualMachineService, AmazonCloudClient {

    @Override
    public VirtualMachineVO start(VirtualMachineParam param) {
        Ec2Param ec2Param = (Ec2Param) param;
        Certificate certificate = param.getCertificate();
        Ec2Client client = (Ec2Client) createClient(certificate);
        StartInstancesRequest startInstancesRequest = StartInstancesRequest.builder()
                .instanceIds(ec2Param.getInstId())
                .build();
        StartInstancesResponse startInstancesResponse = client.startInstances(startInstancesRequest);
        return null;

    }

    /**
     * 创建客户端
     *
     * @param certificate
     * @return
     */
    @Override
    public SdkClient createClient(Certificate certificate) {
        AmazonCertificate amazonCertificate = (AmazonCertificate) certificate;
        String region = amazonCertificate.getRegion();
        AwsBasicCredentials awsBasicCredentials = AwsBasicCredentials.create(amazonCertificate.getAccessKeyId(), amazonCertificate.getAccessKeySecret());
        return Ec2Client.builder()
                .region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(awsBasicCredentials))
                .build();
    }
}
