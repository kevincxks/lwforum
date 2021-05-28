package com.project.forum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.forum.model.AdminUser;

import java.util.List;
import java.util.Map;

/**
 * Created by tomoya.
 * Copyright (c) 2018, All Rights Reserved.
 * https://yiiu.co
 */
public interface AdminUserMapper extends BaseMapper<AdminUser> {

    List<Map<String, Object>> selectAll();
}
