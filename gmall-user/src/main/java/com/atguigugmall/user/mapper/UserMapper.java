package com.atguigugmall.user.mapper;

import com.atguigugmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
