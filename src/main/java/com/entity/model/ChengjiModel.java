package com.entity.model;

import com.entity.ChengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 成绩信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChengjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jifenjiluName;


    /**
     * 学科
     */
    private Integer jifenjiluTypes;


    /**
     * 学期
     */
    private Integer xueqiTypes;


    /**
     * 成绩
     */
    private Integer jifenjiluNumber;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 详情
     */
    private String jifenjiluContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：标题
	 */
    public String getJifenjiluName() {
        return jifenjiluName;
    }


    /**
	 * 设置：标题
	 */
    public void setJifenjiluName(String jifenjiluName) {
        this.jifenjiluName = jifenjiluName;
    }
    /**
	 * 获取：学科
	 */
    public Integer getJifenjiluTypes() {
        return jifenjiluTypes;
    }


    /**
	 * 设置：学科
	 */
    public void setJifenjiluTypes(Integer jifenjiluTypes) {
        this.jifenjiluTypes = jifenjiluTypes;
    }
    /**
	 * 获取：学期
	 */
    public Integer getXueqiTypes() {
        return xueqiTypes;
    }


    /**
	 * 设置：学期
	 */
    public void setXueqiTypes(Integer xueqiTypes) {
        this.xueqiTypes = xueqiTypes;
    }
    /**
	 * 获取：成绩
	 */
    public Integer getJifenjiluNumber() {
        return jifenjiluNumber;
    }


    /**
	 * 设置：成绩
	 */
    public void setJifenjiluNumber(Integer jifenjiluNumber) {
        this.jifenjiluNumber = jifenjiluNumber;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：详情
	 */
    public String getJifenjiluContent() {
        return jifenjiluContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJifenjiluContent(String jifenjiluContent) {
        this.jifenjiluContent = jifenjiluContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
