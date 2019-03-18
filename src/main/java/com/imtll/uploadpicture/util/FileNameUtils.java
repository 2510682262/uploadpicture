package com.imtll.uploadpicture.util;

/**
 * Create with IDEA
 *
 * @ClassName FileNameUtils
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/8 21:18
 * @Version 1.0
 */
public class FileNameUtils {
    /**
     * 获取文件名后缀
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public static String getFileName(String fileOriginName){
        return com.imtll.uploadpicture.util.UUIDUtils.getUUID() + com.imtll.uploadpicture.util.FileNameUtils.getSuffix(fileOriginName);
    }



}
