package com.tang.panda.controllers;

import com.tang.panda.common.FastDFSClient;
import com.tang.panda.common.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/tools")
public class UploadFilecontroller {
    @RequestMapping("/uploadimg")
    @ResponseBody
    public Message uploadfile(@RequestParam("file") MultipartFile file){
        Message message = new Message();
        try {
            FastDFSClient dfs = new FastDFSClient();
            //文件名
            String filename = file.getOriginalFilename();
            //文件的后缀名(不包含.)
            String extname = filename.substring(filename.lastIndexOf(".")+1);
            String filepath = dfs.uploadFile(file.getBytes(),extname);
            message.setCode(0);
            message.setMsg(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
}
