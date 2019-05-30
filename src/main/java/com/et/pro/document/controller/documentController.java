package com.et.pro.document.controller;

import com.et.pro.document.entity.Document;
import com.et.pro.document.mapper.CourseDocMapper;
import com.et.pro.resource.entity.Resource;
import com.et.pro.util.PublicResult;
import com.et.pro.util.PublicUtils;
import com.et.pro.util.Result2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

@RestController
public class documentController {

    @Autowired
    private CourseDocMapper courseDocMapper;

    @RequestMapping(value = "/uploadDocument",method = RequestMethod.POST)
    public Object uploadDocument(@RequestParam MultipartFile file,@RequestParam String subject) throws IOException {
        String fileName = file.getOriginalFilename();
        String filePath = "E:/picture/courseDocument/";
        File pack = new File(filePath);
        if (!pack.exists()) {
            pack.mkdirs();
        }
        File dest = new File(filePath + fileName);
        file.transferTo(dest);
        String location = "picture/courseDocument/" + fileName;
        Document document = new Document(fileName,subject,LocalDateTime.now(),location);
        int result = courseDocMapper.insetDocument(document);
        if(result==1){
            return PublicResult.SUCCESS("insertSuccess",1);
        }else{
            return PublicResult.SUCCESS("insertFailed",0);
        }

    }

    @RequestMapping(value = "/document/getDocumentById",method = RequestMethod.POST)
    public Result2 getDocumentById(@RequestParam int id){
        Result2 result2 = new Result2();
        if(id<0){
            result2.put("errorMessage","getDocumentFailed");
            return result2;
        }
        Document document = courseDocMapper.getDocumentById(id);
        result2.put("document",document);
        return result2;
    }
}
