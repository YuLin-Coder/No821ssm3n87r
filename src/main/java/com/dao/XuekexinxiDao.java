package com.dao;

import com.entity.XuekexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuekexinxiVO;
import com.entity.view.XuekexinxiView;


/**
 * 学科信息
 * 
 * @author 
 * @email 
 * @date 2021-04-17 15:01:27
 */
public interface XuekexinxiDao extends BaseMapper<XuekexinxiEntity> {
	
	List<XuekexinxiVO> selectListVO(@Param("ew") Wrapper<XuekexinxiEntity> wrapper);
	
	XuekexinxiVO selectVO(@Param("ew") Wrapper<XuekexinxiEntity> wrapper);
	
	List<XuekexinxiView> selectListView(@Param("ew") Wrapper<XuekexinxiEntity> wrapper);

	List<XuekexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuekexinxiEntity> wrapper);
	
	XuekexinxiView selectView(@Param("ew") Wrapper<XuekexinxiEntity> wrapper);
	
}
