package com.example.demo.fileUpLoad;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * Created by ZhangWei on 2018/4/22 16:45.
 */
@Controller
@RequestMapping("/fileUpLoad")
public class FileUpLoadController {

    public  String file() {
        return "/fileUpLoad/file";
    }

    @ResponseBody
    @RequestMapping("/upLoad")
    public String upLoad(@RequestParam MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(
                        new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("上传失败，" + e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
                return"上传失败,"+e.getMessage();
            }
            return "上传成功";
        }
        return "上传失败，无文件";
    }
}
