package com.friend.py.dao;

import com.friend.py.model.TopicAnswer;
import com.friend.py.model.TopicAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicAnswerMapper {
    int countByExample(TopicAnswerExample example);

    int deleteByExample(TopicAnswerExample example);

    int deleteByPrimaryKey(String ansno);

    int insert(TopicAnswer record);

    int insertSelective(TopicAnswer record);

    List<TopicAnswer> selectByExample(TopicAnswerExample example);

    TopicAnswer selectByPrimaryKey(String ansno);

    int updateByExampleSelective(@Param("record") TopicAnswer record, @Param("example") TopicAnswerExample example);

    int updateByExample(@Param("record") TopicAnswer record, @Param("example") TopicAnswerExample example);

    int updateByPrimaryKeySelective(TopicAnswer record);

    int updateByPrimaryKey(TopicAnswer record);
}