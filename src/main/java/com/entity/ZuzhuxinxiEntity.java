package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 租住信息
 *
 * @author 
 * @email
 */
@TableName("zuzhuxinxi")
public class ZuzhuxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuzhuxinxiEntity() {

	}

	public ZuzhuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 用户名称
     */
    @TableField(value = "zuzhuxinxi_name")

    private String zuzhuxinxiName;


    /**
     * 用户联系方式
     */
    @TableField(value = "zuzhuxinxi_phone")

    private String zuzhuxinxiPhone;


    /**
     * 房屋地址
     */
    @TableField(value = "zuzhuxinxi_danyuan")

    private String zuzhuxinxiDanyuan;


    /**
     * 租金/月
     */
    @TableField(value = "zuzhuxinxi_jine")

    private Double zuzhuxinxiJine;


    /**
     * 押金
     */
    @TableField(value = "zuzhuxinxi_yajin")

    private Double zuzhuxinxiYajin;


    /**
     * 入住时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zuzhuxinxi_time")

    private Date zuzhuxinxiTime;


    /**
     * 备注
     */
    @TableField(value = "zuzhuxinxi_content")

    private String zuzhuxinxiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：用户名称
	 */
    public String getZuzhuxinxiName() {
        return zuzhuxinxiName;
    }
    /**
	 * 获取：用户名称
	 */

    public void setZuzhuxinxiName(String zuzhuxinxiName) {
        this.zuzhuxinxiName = zuzhuxinxiName;
    }
    /**
	 * 设置：用户联系方式
	 */
    public String getZuzhuxinxiPhone() {
        return zuzhuxinxiPhone;
    }
    /**
	 * 获取：用户联系方式
	 */

    public void setZuzhuxinxiPhone(String zuzhuxinxiPhone) {
        this.zuzhuxinxiPhone = zuzhuxinxiPhone;
    }
    /**
	 * 设置：房屋地址
	 */
    public String getZuzhuxinxiDanyuan() {
        return zuzhuxinxiDanyuan;
    }
    /**
	 * 获取：房屋地址
	 */

    public void setZuzhuxinxiDanyuan(String zuzhuxinxiDanyuan) {
        this.zuzhuxinxiDanyuan = zuzhuxinxiDanyuan;
    }
    /**
	 * 设置：租金/月
	 */
    public Double getZuzhuxinxiJine() {
        return zuzhuxinxiJine;
    }
    /**
	 * 获取：租金/月
	 */

    public void setZuzhuxinxiJine(Double zuzhuxinxiJine) {
        this.zuzhuxinxiJine = zuzhuxinxiJine;
    }
    /**
	 * 设置：押金
	 */
    public Double getZuzhuxinxiYajin() {
        return zuzhuxinxiYajin;
    }
    /**
	 * 获取：押金
	 */

    public void setZuzhuxinxiYajin(Double zuzhuxinxiYajin) {
        this.zuzhuxinxiYajin = zuzhuxinxiYajin;
    }
    /**
	 * 设置：入住时间
	 */
    public Date getZuzhuxinxiTime() {
        return zuzhuxinxiTime;
    }
    /**
	 * 获取：入住时间
	 */

    public void setZuzhuxinxiTime(Date zuzhuxinxiTime) {
        this.zuzhuxinxiTime = zuzhuxinxiTime;
    }
    /**
	 * 设置：备注
	 */
    public String getZuzhuxinxiContent() {
        return zuzhuxinxiContent;
    }
    /**
	 * 获取：备注
	 */

    public void setZuzhuxinxiContent(String zuzhuxinxiContent) {
        this.zuzhuxinxiContent = zuzhuxinxiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zuzhuxinxi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", zuzhuxinxiName=" + zuzhuxinxiName +
            ", zuzhuxinxiPhone=" + zuzhuxinxiPhone +
            ", zuzhuxinxiDanyuan=" + zuzhuxinxiDanyuan +
            ", zuzhuxinxiJine=" + zuzhuxinxiJine +
            ", zuzhuxinxiYajin=" + zuzhuxinxiYajin +
            ", zuzhuxinxiTime=" + zuzhuxinxiTime +
            ", zuzhuxinxiContent=" + zuzhuxinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
