package com.friend.py.dao;

import com.friend.py.model.Lesson;
import com.friend.py.model.LessonExample;
import com.friend.py.model.LessonKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonMapper {
    int countByExample(LessonExample example);

    int deleteByExample(LessonExample example);

    int deleteByPrimaryKey(LessonKey key);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    List<Lesson> selectByExample(LessonExample example);

    Lesson selectByPrimaryKey(LessonKey key);

    int updateByExampleSelective(@Param("record") Lesson record, @Param("example") LessonExample example);

    int updateByExample(@Param("record") Lesson record, @Param("example") LessonExample example);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);
}