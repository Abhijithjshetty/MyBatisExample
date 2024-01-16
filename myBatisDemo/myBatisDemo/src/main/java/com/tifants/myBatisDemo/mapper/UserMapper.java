package com.tifants.myBatisDemo.mapper;

import com.tifants.myBatisDemo.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user1")
    List<Users> findAll();

    @Insert("insert into user1(id,name,role) values(#{id},#{name},#{role})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Users user1);

    @Update("update user1 set role=#{role} where name=#{name}")
    void update(Users user1);

    @Delete("delete from user1 where name=#{name}")
    void delete(Users user1);
}
