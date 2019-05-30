package com.et.pro.home.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface HomeMapper {
    @Select("select * from teacher")
    List<Map<String,Object>> getTeachers();

    @Select("select * from course")
    List<Map<String,Object>> getCourse();
}
