package com.imtll.uploadpicture.util;

import java.util.UUID;

/**
 * Create with IDEA
 *
 * @ClassName UUIDUtils
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/8 21:22
 * @Version 1.0
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

}
