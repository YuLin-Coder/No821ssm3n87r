package com.entity.view;

import com.entity.XuekexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学科信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
@TableName("xuekexinxi")
public class XuekexinxiView  extends XuekexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuekexinxiView(){
	}
 
 	public XuekexinxiView(XuekexinxiEntity xuekexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xuekexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
