package com.ucfzcg.dubboDemo.action;

import com.alibaba.dubbo.common.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by nvlih on 2016/2/4 0004.
 */
@Controller
@RequestMapping("/upload")
public class FileUploadController {

    @RequestMapping(value =("/fith"), method = RequestMethod.POST)
    public void upload(@RequestParam("picture")  MultipartFile picture){
        this.uploadPic(picture);
    }


    public JSONObject uploadPic (MultipartFile myfile) {
        JSONObject jsonObject = new JSONObject();
        System.out.println(myfile.getSize());
        return jsonObject;
    }
}
