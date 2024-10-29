package com.dao;

import com.entity.KechengshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengshipinVO;
import com.entity.view.KechengshipinView;


/**
 * 课程视频
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface KechengshipinDao extends BaseMapper<KechengshipinEntity> {
	
	List<KechengshipinVO> selectListVO(@Param("ew") Wrapper<KechengshipinEntity> wrapper);
	
	KechengshipinVO selectVO(@Param("ew") Wrapper<KechengshipinEntity> wrapper);
	
	List<KechengshipinView> selectListView(@Param("ew") Wrapper<KechengshipinEntity> wrapper);

	List<KechengshipinView> selectListView(Pagination page,@Param("ew") Wrapper<KechengshipinEntity> wrapper);
	
	KechengshipinView selectView(@Param("ew") Wrapper<KechengshipinEntity> wrapper);
	
}
