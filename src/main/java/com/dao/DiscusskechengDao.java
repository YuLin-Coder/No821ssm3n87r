package com.dao;

import com.entity.DiscusskechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskechengVO;
import com.entity.view.DiscusskechengView;


/**
 * 课程评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface DiscusskechengDao extends BaseMapper<DiscusskechengEntity> {
	
	List<DiscusskechengVO> selectListVO(@Param("ew") Wrapper<DiscusskechengEntity> wrapper);
	
	DiscusskechengVO selectVO(@Param("ew") Wrapper<DiscusskechengEntity> wrapper);
	
	List<DiscusskechengView> selectListView(@Param("ew") Wrapper<DiscusskechengEntity> wrapper);

	List<DiscusskechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskechengEntity> wrapper);
	
	DiscusskechengView selectView(@Param("ew") Wrapper<DiscusskechengEntity> wrapper);
	
}
