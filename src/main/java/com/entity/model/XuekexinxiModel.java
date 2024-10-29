package com.entity.model;

import com.entity.XuekexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学科信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public class XuekexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学科名称
	 */
	
	private String xuekemingcheng;
		
	/**
	 * 创建时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangjianshijian;
				
	
	/**
	 * 设置：学科名称
	 */
	 
	public void setXuekemingcheng(String xuekemingcheng) {
		this.xuekemingcheng = xuekemingcheng;
	}
	
	/**
	 * 获取：学科名称
	 */
	public String getXuekemingcheng() {
		return xuekemingcheng;
	}
				
	
	/**
	 * 设置：创建时间
	 */
	 
	public void setChuangjianshijian(Date chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	
	/**
	 * 获取：创建时间
	 */
	public Date getChuangjianshijian() {
		return chuangjianshijian;
	}
			
}
