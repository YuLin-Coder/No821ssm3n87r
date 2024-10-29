package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuekexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuekexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuekexinxiView;


/**
 * 学科信息
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface XuekexinxiService extends IService<XuekexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuekexinxiVO> selectListVO(Wrapper<XuekexinxiEntity> wrapper);
   	
   	XuekexinxiVO selectVO(@Param("ew") Wrapper<XuekexinxiEntity> wrapper);
   	
   	List<XuekexinxiView> selectListView(Wrapper<XuekexinxiEntity> wrapper);
   	
   	XuekexinxiView selectView(@Param("ew") Wrapper<XuekexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuekexinxiEntity> wrapper);
   	
}

