package com.ymm.microservices.usercenter.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ymm.microservices.usercenter.dto.SysPermissionDTO;
import com.ymm.microservices.usercenter.entity.SysPermission;

/**
 * (SysPermission)表服务接口
 *
 * @author makejava
 * @since 2020-08-05 16:13:40
 */
public interface SysPermissionService extends IService<SysPermission> {

    IPage<SysPermissionDTO> pagePermissionDTO(IPage<SysPermission> page, Wrapper<SysPermission> wrapper);

    SysPermissionDTO getPermissionDTO(Wrapper<SysPermission> wrapper);
}
