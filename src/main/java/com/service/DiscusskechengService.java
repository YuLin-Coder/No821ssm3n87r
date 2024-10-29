package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskechengView;


/**
 * 课程评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface DiscusskechengService extends IService<DiscusskechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskechengVO> selectListVO(Wrapper<DiscusskechengEntity> wrapper);
   	
   	DiscusskechengVO selectVO(@Param("ew") Wrapper<DiscusskechengEntity> wrapper);
   	
   	List<DiscusskechengView> selectListView(Wrapper<DiscusskechengEntity> wrapper);
   	
   	DiscusskechengView selectView(@Param("ew") Wrapper<DiscusskechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskechengEntity> wrapper);
   	
}

