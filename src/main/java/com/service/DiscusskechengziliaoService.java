package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskechengziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskechengziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskechengziliaoView;


/**
 * 课程资料评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface DiscusskechengziliaoService extends IService<DiscusskechengziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskechengziliaoVO> selectListVO(Wrapper<DiscusskechengziliaoEntity> wrapper);
   	
   	DiscusskechengziliaoVO selectVO(@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);
   	
   	List<DiscusskechengziliaoView> selectListView(Wrapper<DiscusskechengziliaoEntity> wrapper);
   	
   	DiscusskechengziliaoView selectView(@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskechengziliaoEntity> wrapper);
   	
}

