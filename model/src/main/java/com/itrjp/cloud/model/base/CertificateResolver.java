package com.itrjp.cloud.model.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.itrjp.cloud.model.base.ali.AliCertificate;
import com.itrjp.cloud.model.base.amazon.AmazonCertificate;

import java.io.IOException;

/**
 * @author : renjp
 * @date : 2021-07-31 22:35
 **/
public class CertificateResolver implements TypeIdResolver {
    private JavaType superType;

    @Override
    public void init(JavaType javaType) {
        System.out.println(55555);
        System.out.println(javaType);
        superType = javaType;
    }

    @Override
    public String idFromValue(Object obj) {
        System.out.println(666666);
        System.out.println(obj);

        return idFromValueAndType(obj, obj.getClass());

    }

    @Override
    public String idFromValueAndType(Object o, Class<?> aClass) {
        System.out.println(77777);
        System.out.println(o);
        System.out.println(aClass);
        return null;
    }

    @Override
    public String idFromBaseType() {
        System.out.println(88888);
        return null;
    }

    @Override
    public JavaType typeFromId(DatabindContext context, String id) throws IOException {
        System.out.println("aaaa");
        Class<?> subType = null;
        switch (id) {
            case "ali":
                subType = AliCertificate.class;
                break;
            case "aws":
                subType = AmazonCertificate.class;
                break;
        }
        return context.constructSpecializedType(superType, subType);
    }

    @Override
    public String getDescForKnownTypeIds() {
        System.out.println(2222222);
        return null;
    }

    @Override
    public JsonTypeInfo.Id getMechanism() {
        System.out.println(333333);

        return JsonTypeInfo.Id.NAME;
    }
}
