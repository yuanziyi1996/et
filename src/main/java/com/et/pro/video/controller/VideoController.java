package com.et.pro.video.controller;

import com.et.pro.document.entity.Document;
import com.et.pro.util.PublicResult;
import com.et.pro.util.Result2;
import com.et.pro.video.entity.Video;
import com.et.pro.video.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

@RestController
public class VideoController {

    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping(value = "/uploadVideo",method = RequestMethod.POST)
    public Object uploadDocument(@RequestParam MultipartFile file,@RequestParam String subject) throws IOException {
        String fileName = file.getOriginalFilename();
        String filePath = "E:/picture/courseVideo/";
        File pack = new File(filePath);
        if (!pack.exists()) {
            pack.mkdirs();
        }
        File dest = new File(filePath + fileName);
        file.transferTo(dest);
        String location = "picture/courseVideo/" + fileName;
        Video video = new Video(fileName,subject, LocalDateTime.now(),location);
        int result = videoMapper.insertVideo(video);
        if(result==1){
            return PublicResult.SUCCESS("insertSuccess",1);
        }else{
            return PublicResult.SUCCESS("insertFailed",0);
        }

    }

    @RequestMapping(value = "/document/getVideoById",method = RequestMethod.POST)
    public Result2 getDocumentById(@RequestParam int id){
        Result2 result2 = new Result2();
        if(id<0){
            result2.put("errorMessage","getVideoFailed");
            return result2;
        }
        Video video = videoMapper.getVideoById(id);
        result2.put("document",video);
        return result2;
    }
}
