package com.atguigugmall.user.service;

import com.atguigugmall.user.bean.UmsMember;
import com.atguigugmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService{
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String member);
}
