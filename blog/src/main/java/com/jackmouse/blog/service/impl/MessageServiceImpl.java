package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.Message;
import com.jackmouse.blog.mapper.MessageMapper;
import com.jackmouse.blog.service.MessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
