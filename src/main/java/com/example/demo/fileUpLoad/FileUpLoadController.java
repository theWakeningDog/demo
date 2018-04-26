package com.example.demo.fileUpLoad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangWei on 2018/4/22 16:45.
 */
@Controller
@RequestMapping("/fileUpLoad")
public class FileUpLoadController {

    @RequestMapping("/file")
    public  String file() {
        return "/fileUpLoad/file.html";
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

    @RequestMapping("/moreFile")
    public String moreFile() {
        return "/fileUpLoad/moreFile";
    }

    @RequestMapping(value = "/more", method = RequestMethod.POST)
    @ResponseBody
    public String UpLoadMoreFile(HttpServletRequest request) {
        List<MultipartFile> fileList = ((MultipartHttpServletRequest)request).getFiles("file");
        MultipartFile multipartFile = null;
        BufferedOutputStream out = null;
        for (int i = 0; i < fileList.size(); ++i) {
            multipartFile = fileList.get(i);
            if (!multipartFile.isEmpty()) {
                try {
                    byte[] bytes = multipartFile.getBytes();
                    out = new BufferedOutputStream(new FileOutputStream(new File(multipartFile.getOriginalFilename())));
                    out.write(bytes);
                    out.close();
                } catch (IOException e) {
                    out = null;
                    return"You failed to upload " + i + " => " + e.getMessage();
                }
            } else {
                return"You failed to upload " + i + " because the file was empty.";
            }
        }
        return "上传成功";
    }
}
