package com.entity.view;

import com.entity.DiscusskechengshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
@TableName("discusskechengshipin")
public class DiscusskechengshipinView  extends DiscusskechengshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskechengshipinView(){
	}
 
 	public DiscusskechengshipinView(DiscusskechengshipinEntity discusskechengshipinEntity){
 	try {
			BeanUtils.copyProperties(this, discusskechengshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
