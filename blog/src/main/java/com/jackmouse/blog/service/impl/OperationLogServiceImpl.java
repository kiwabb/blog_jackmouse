package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.OperationLog;
import com.jackmouse.blog.mapper.OperationLogMapper;
import com.jackmouse.blog.service.OperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jackmouse
 * @since 2021-07-06
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements OperationLogService {

}
