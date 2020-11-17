package com.sunliwei.practicer.service.impl;

import com.sunliwei.practicer.domain.UserInfo;
import com.sunliwei.practicer.mapper.UserInfoMapper;
import com.sunliwei.practicer.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author fjy
 * @since 2020-11-17
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
