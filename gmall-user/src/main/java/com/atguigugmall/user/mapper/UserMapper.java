package com.atguigugmall.user.mapper;

import com.atguigugmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper   extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
