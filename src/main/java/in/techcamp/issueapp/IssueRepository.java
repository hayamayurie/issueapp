package in.techcamp.issueapp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IssueRepository {
    @Insert("insert into issues(title,content,period,importance) value(#{title},#{content},#{period},#{importance})")
    void insert(String title,String content,String period,char importance);
}
