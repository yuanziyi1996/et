package com.et.pro.video.mapper;

import com.et.pro.video.entity.Video;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface VideoMapper {

    @Insert({"insert into course_video(name,subject,create_time,location) " +
            "values(#{name},#{subject},#{createTime},#{location})"})
    int insertVideo(Video video);

    @Select({"select * from course_video where id = #{id}"})
    Video getVideoById(int id);
}
