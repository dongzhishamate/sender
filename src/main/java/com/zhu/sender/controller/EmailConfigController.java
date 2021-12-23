package com.zhu.sender.controller;


import com.zhu.sender.common.Result;
import com.zhu.sender.entity.EmailConfig;
import com.zhu.sender.service.EmailConfigService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhufangyuan
 * @since 2021-12-22
 */
@RestController
@RequestMapping("/generator/email-config")
public class EmailConfigController {

  @Resource
  private EmailConfigService emailConfigService;

  @PostMapping("/save")
  public Result<?> save(@RequestBody EmailConfig emailConfig) {
    emailConfigService.save(emailConfig);
    return Result.success();
  }

  @RequestMapping("/showEmailConfig")
  public Result<?> showEmailConfig() {
    List<EmailConfig> list = emailConfigService.list();
    return Result.success(list);
  }

}
