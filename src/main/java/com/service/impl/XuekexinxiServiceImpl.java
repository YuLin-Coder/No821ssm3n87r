package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuekexinxiDao;
import com.entity.XuekexinxiEntity;
import com.service.XuekexinxiService;
import com.entity.vo.XuekexinxiVO;
import com.entity.view.XuekexinxiView;

@Service("xuekexinxiService")
public class XuekexinxiServiceImpl extends ServiceImpl<XuekexinxiDao, XuekexinxiEntity> implements XuekexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuekexinxiEntity> page = this.selectPage(
                new Query<XuekexinxiEntity>(params).getPage(),
                new EntityWrapper<XuekexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuekexinxiEntity> wrapper) {
		  Page<XuekexinxiView> page =new Query<XuekexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuekexinxiVO> selectListVO(Wrapper<XuekexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuekexinxiVO selectVO(Wrapper<XuekexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuekexinxiView> selectListView(Wrapper<XuekexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuekexinxiView selectView(Wrapper<XuekexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
