package com.ghost.domain.entity;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 文章表
* @author ghost
 * @TableName sg_article
*/

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sg_article")
@Schema(description = "文章表")
public class Article implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @Schema(description = "")
    @TableId
    private Long id;
    /**
    * 标题
    */
    @Size(max= 256,message="编码长度不能超过256")
    @Schema(description = "标题")
    @Length(max= 256,message="编码长度不能超过256")
    private String title;
    /**
    * 文章内容
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @Schema(description = "文章内容")
    @Length(max= -1,message="编码长度不能超过-1")
    private String content;
    /**
    * 文章摘要
    */
    @Size(max= 1024,message="编码长度不能超过1024")
    @Schema(description = "文章摘要")
    @Length(max= 1024,message="编码长度不能超过1,024")
    private String summary;
    /**
    * 所属分类id
    */
    @Schema(description = "所属分类id")
    private Long categoryId;
    /**
    * 缩略图
    */
    @Size(max= 256,message="编码长度不能超过256")
    @Schema(description = "缩略图")
    @Length(max= 256,message="编码长度不能超过256")
    private String thumbnail;
    /**
    * 是否置顶（0否，1是）
    */
    @Schema(description = "是否置顶（0否，1是）")
    private String isTop;
    /**
    * 状态（0已发布，1草稿）
    */
    @Schema(description = "状态（0已发布，1草稿）")
    private String status;
    /**
    * 访问量
    */
    @Schema(description = "访问量")
    private Long viewCount;
    /**
    * 是否允许评论 1是，0否
    */
    @Schema(description = "是否允许评论 1是，0否")
    private String isComment;
    /**
    * 
    */
    @Schema(description = "")
    private Long createBy;
    /**
    * 
    */
    @Schema(description = "")
    private Date createTime;
    /**
    * 
    */
    @Schema(description = "")
    private Long updateBy;
    /**
    * 
    */
    @Schema(description = "")
    private Date updateTime;
    /**
    * 删除标志（0代表未删除，1代表已删除）
    */
    @Schema(description = "删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;



}
