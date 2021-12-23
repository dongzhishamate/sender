package com.zhu.sender.service.serviceImpl;

import com.zhu.sender.entity.EmailConfig;
import com.zhu.sender.mapper.EmailConfigMapper;
import com.zhu.sender.service.EmailConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhufangyuan
 * @since 2021-12-22
 */
@Service
public class EmailConfigServiceImpl extends ServiceImpl<EmailConfigMapper, EmailConfig> implements EmailConfigService {

}
