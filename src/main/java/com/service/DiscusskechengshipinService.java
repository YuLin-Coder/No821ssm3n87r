package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskechengshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskechengshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskechengshipinView;


/**
 * 课程视频评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface DiscusskechengshipinService extends IService<DiscusskechengshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskechengshipinVO> selectListVO(Wrapper<DiscusskechengshipinEntity> wrapper);
   	
   	DiscusskechengshipinVO selectVO(@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);
   	
   	List<DiscusskechengshipinView> selectListView(Wrapper<DiscusskechengshipinEntity> wrapper);
   	
   	DiscusskechengshipinView selectView(@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskechengshipinEntity> wrapper);
   	
}

