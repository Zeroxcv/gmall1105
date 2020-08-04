package com.atguigugmall.user.service.impl;

import com.atguigugmall.user.bean.UmsMember;
import com.atguigugmall.user.bean.UmsMemberReceiveAddress;
import com.atguigugmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigugmall.user.mapper.UserMapper;
import com.atguigugmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


//    @Autowired
//    UserMapper userMapper;
//
//    @Override
//    public List<UmsMember> getAllUser() {
//        List<UmsMember> userMebersList = userMapper.selectAllUser();
//        return userMebersList;
//    }
    @Autowired
    UserMapper userMapper;



    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override




    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList  = userMapper.selectAll();//userMapper.selectAllUser();




        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String member) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(member);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }


}
