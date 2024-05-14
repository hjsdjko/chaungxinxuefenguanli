package com.entity.vo;

import com.entity.ChengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 成绩信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chengji")
public class ChengjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jifenjilu_name")
    private String jifenjiluName;


    /**
     * 学科
     */

    @TableField(value = "jifenjilu_types")
    private Integer jifenjiluTypes;


    /**
     * 学期
     */

    @TableField(value = "xueqi_types")
    private Integer xueqiTypes;


    /**
     * 成绩
     */

    @TableField(value = "jifenjilu_number")
    private Integer jifenjiluNumber;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 详情
     */

    @TableField(value = "jifenjilu_content")
    private String jifenjiluContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：标题
	 */
    public String getJifenjiluName() {
        return jifenjiluName;
    }


    /**
	 * 获取：标题
	 */

    public void setJifenjiluName(String jifenjiluName) {
        this.jifenjiluName = jifenjiluName;
    }
    /**
	 * 设置：学科
	 */
    public Integer getJifenjiluTypes() {
        return jifenjiluTypes;
    }


    /**
	 * 获取：学科
	 */

    public void setJifenjiluTypes(Integer jifenjiluTypes) {
        this.jifenjiluTypes = jifenjiluTypes;
    }
    /**
	 * 设置：学期
	 */
    public Integer getXueqiTypes() {
        return xueqiTypes;
    }


    /**
	 * 获取：学期
	 */

    public void setXueqiTypes(Integer xueqiTypes) {
        this.xueqiTypes = xueqiTypes;
    }
    /**
	 * 设置：成绩
	 */
    public Integer getJifenjiluNumber() {
        return jifenjiluNumber;
    }


    /**
	 * 获取：成绩
	 */

    public void setJifenjiluNumber(Integer jifenjiluNumber) {
        this.jifenjiluNumber = jifenjiluNumber;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：详情
	 */
    public String getJifenjiluContent() {
        return jifenjiluContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJifenjiluContent(String jifenjiluContent) {
        this.jifenjiluContent = jifenjiluContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
