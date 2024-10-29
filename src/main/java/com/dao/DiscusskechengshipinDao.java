package com.dao;

import com.entity.DiscusskechengshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskechengshipinVO;
import com.entity.view.DiscusskechengshipinView;


/**
 * 课程视频评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface DiscusskechengshipinDao extends BaseMapper<DiscusskechengshipinEntity> {
	
	List<DiscusskechengshipinVO> selectListVO(@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);
	
	DiscusskechengshipinVO selectVO(@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);
	
	List<DiscusskechengshipinView> selectListView(@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);

	List<DiscusskechengshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);
	
	DiscusskechengshipinView selectView(@Param("ew") Wrapper<DiscusskechengshipinEntity> wrapper);
	
}
