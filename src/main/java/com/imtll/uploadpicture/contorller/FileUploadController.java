package com.imtll.uploadpicture.contorller;


import com.imtll.uploadpicture.util.FileUtils;
import com.imtll.uploadpicture.util.JsonBean;
import com.sun.xml.internal.ws.transport.http.ResourceLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


/**
 * Create with IDEA
 *
 * @ClassName FileUploadController
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/8 21:29
 * @Version 1.0
 */
@RestController
public class FileUploadController {

    @Value("${web.upload-path}")
    private String path;

    @PostMapping("/fileUpload.do")
    public JsonBean upload(@RequestParam("fileName") MultipartFile file){

        JsonBean bean = new JsonBean ();
        // 要上传的目标文件存放路径
        String localPath = "d:/Photos/";
        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
            // 上传成功，给出页面提示

            bean.setCode (1);
            bean.setInfo("上传成功");

        }else {
            bean.setCode(0);
            bean.setInfo("上传失败");

        }

        return bean;
    }





}
