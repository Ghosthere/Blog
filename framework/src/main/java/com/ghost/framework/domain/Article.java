package com.ghost.framework.domain;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 文章表
* @TableName sg_article
*/

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sg_article")
public class Article implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    @TableId
    private Long id;
    /**
    * 标题
    */
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("标题")
    @Length(max= 256,message="编码长度不能超过256")
    private String title;
    /**
    * 文章内容
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("文章内容")
    @Length(max= -1,message="编码长度不能超过-1")
    private String content;
    /**
    * 文章摘要
    */
    @Size(max= 1024,message="编码长度不能超过1024")
    @ApiModelProperty("文章摘要")
    @Length(max= 1024,message="编码长度不能超过1,024")
    private String summary;
    /**
    * 所属分类id
    */
    @ApiModelProperty("所属分类id")
    private Long categoryId;
    /**
    * 缩略图
    */
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("缩略图")
    @Length(max= 256,message="编码长度不能超过256")
    private String thumbnail;
    /**
    * 是否置顶（0否，1是）
    */
    @ApiModelProperty("是否置顶（0否，1是）")
    private String isTop;
    /**
    * 状态（0已发布，1草稿）
    */
    @ApiModelProperty("状态（0已发布，1草稿）")
    private String status;
    /**
    * 访问量
    */
    @ApiModelProperty("访问量")
    private Long viewCount;
    /**
    * 是否允许评论 1是，0否
    */
    @ApiModelProperty("是否允许评论 1是，0否")
    private String isComment;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long createBy;
    /**
    * 
    */
    @ApiModelProperty("")
    private Date createTime;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long updateBy;
    /**
    * 
    */
    @ApiModelProperty("")
    private Date updateTime;
    /**
    * 删除标志（0代表未删除，1代表已删除）
    */
    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;



}
