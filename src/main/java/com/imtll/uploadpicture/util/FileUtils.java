package com.imtll.uploadpicture.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Create with IDEA
 *
 * @ClassName FileUtils
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/8 21:22
 * @Version 1.0
 *
 * file 文件
 * path 文件存放路径
 * fileName 原文件
 *
 */
public class FileUtils {

    public static boolean upload(MultipartFile file, String path, String fileName){


        // 生成新的文件名
        String realPath = path + "/" + com.imtll.uploadpicture.util.FileNameUtils.getFileName(fileName);

        //使用原文件名
        //String realPath = path + "/" + fileName;

        File dest = new File(realPath);

        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }

        try {
            //保存文件
            file.transferTo(dest);
            return true;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }

    }

}
