package com.imooc.mapper;

/**
 * 手写mapper文件  
 */

import java.util.List;

import com.imooc.pojo.SysUser;

public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}