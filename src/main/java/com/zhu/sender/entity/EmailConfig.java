package com.zhu.sender.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author zhufangyuan
 * @since 2021-12-22
 */
@Getter
@Setter
@TableName("t_emailConfig")
@ApiModel(value = "EmailConfig对象", description = "")
public class EmailConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("发件人地址")
    @TableId("senderAddress")
    private String senderAddress;

    @ApiModelProperty("发件人账户名")
    @TableField("senderAccount")
    private String senderAccount;

    @ApiModelProperty("发件人账户密码")
    @TableField("senderPassword")
    private String senderPassword;

    @ApiModelProperty("设置用户的认证方式")
    @TableField("smtpAuth")
    private String smtpAuth;

    @ApiModelProperty("设置传输协议")
    @TableField("transportProtocol")
    private String transportProtocol;

    @ApiModelProperty("设置发件人的SMTP服务器地址")
    @TableField("smtpHost")
    private String smtpHost;


}
