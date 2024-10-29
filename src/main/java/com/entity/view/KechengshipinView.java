package com.entity.view;

import com.entity.KechengshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
@TableName("kechengshipin")
public class KechengshipinView  extends KechengshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengshipinView(){
	}
 
 	public KechengshipinView(KechengshipinEntity kechengshipinEntity){
 	try {
			BeanUtils.copyProperties(this, kechengshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
