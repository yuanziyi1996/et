package com.et.pro.document.mapper;

import com.et.pro.document.entity.Document;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface CourseDocMapper {

    @Insert({"insert into course_document(name,subject,create_time,location) " +
            "values(#{name},#{subject},#{createTime},#{location})"})
    int insetDocument(Document document);

    @Select({"select * from course_document where id = #{id}"})
    Document getDocumentById(int id);
}
