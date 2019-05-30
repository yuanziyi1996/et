package com.et.pro.home.service;

import com.et.pro.home.mapper.HomeMapper;
import com.et.pro.util.Result;
import com.et.pro.util.Result2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    @Autowired  HomeMapper homeMapper;

    public Result2 getHomeInfo() {
        Result2 result = new Result2();
        result.put("tacherInfo", homeMapper.getTeachers());
        result.put("courseInfo", homeMapper.getCourse());
        return result;
    }
}
