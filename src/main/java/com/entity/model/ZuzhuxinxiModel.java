package com.entity.model;

import com.entity.ZuzhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 租住信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuzhuxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 用户名称
     */
    private String zuzhuxinxiName;


    /**
     * 用户联系方式
     */
    private String zuzhuxinxiPhone;


    /**
     * 房屋地址
     */
    private String zuzhuxinxiDanyuan;


    /**
     * 租金/月
     */
    private Double zuzhuxinxiJine;


    /**
     * 押金
     */
    private Double zuzhuxinxiYajin;


    /**
     * 入住时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zuzhuxinxiTime;


    /**
     * 备注
     */
    private String zuzhuxinxiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：用户名称
	 */
    public String getZuzhuxinxiName() {
        return zuzhuxinxiName;
    }


    /**
	 * 设置：用户名称
	 */
    public void setZuzhuxinxiName(String zuzhuxinxiName) {
        this.zuzhuxinxiName = zuzhuxinxiName;
    }
    /**
	 * 获取：用户联系方式
	 */
    public String getZuzhuxinxiPhone() {
        return zuzhuxinxiPhone;
    }


    /**
	 * 设置：用户联系方式
	 */
    public void setZuzhuxinxiPhone(String zuzhuxinxiPhone) {
        this.zuzhuxinxiPhone = zuzhuxinxiPhone;
    }
    /**
	 * 获取：房屋地址
	 */
    public String getZuzhuxinxiDanyuan() {
        return zuzhuxinxiDanyuan;
    }


    /**
	 * 设置：房屋地址
	 */
    public void setZuzhuxinxiDanyuan(String zuzhuxinxiDanyuan) {
        this.zuzhuxinxiDanyuan = zuzhuxinxiDanyuan;
    }
    /**
	 * 获取：租金/月
	 */
    public Double getZuzhuxinxiJine() {
        return zuzhuxinxiJine;
    }


    /**
	 * 设置：租金/月
	 */
    public void setZuzhuxinxiJine(Double zuzhuxinxiJine) {
        this.zuzhuxinxiJine = zuzhuxinxiJine;
    }
    /**
	 * 获取：押金
	 */
    public Double getZuzhuxinxiYajin() {
        return zuzhuxinxiYajin;
    }


    /**
	 * 设置：押金
	 */
    public void setZuzhuxinxiYajin(Double zuzhuxinxiYajin) {
        this.zuzhuxinxiYajin = zuzhuxinxiYajin;
    }
    /**
	 * 获取：入住时间
	 */
    public Date getZuzhuxinxiTime() {
        return zuzhuxinxiTime;
    }


    /**
	 * 设置：入住时间
	 */
    public void setZuzhuxinxiTime(Date zuzhuxinxiTime) {
        this.zuzhuxinxiTime = zuzhuxinxiTime;
    }
    /**
	 * 获取：备注
	 */
    public String getZuzhuxinxiContent() {
        return zuzhuxinxiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setZuzhuxinxiContent(String zuzhuxinxiContent) {
        this.zuzhuxinxiContent = zuzhuxinxiContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
