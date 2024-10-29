package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengshipinView;


/**
 * 课程视频
 *
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface KechengshipinService extends IService<KechengshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengshipinVO> selectListVO(Wrapper<KechengshipinEntity> wrapper);
   	
   	KechengshipinVO selectVO(@Param("ew") Wrapper<KechengshipinEntity> wrapper);
   	
   	List<KechengshipinView> selectListView(Wrapper<KechengshipinEntity> wrapper);
   	
   	KechengshipinView selectView(@Param("ew") Wrapper<KechengshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengshipinEntity> wrapper);
   	
}

