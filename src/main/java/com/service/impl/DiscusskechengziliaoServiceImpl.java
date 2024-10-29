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


import com.dao.DiscusskechengziliaoDao;
import com.entity.DiscusskechengziliaoEntity;
import com.service.DiscusskechengziliaoService;
import com.entity.vo.DiscusskechengziliaoVO;
import com.entity.view.DiscusskechengziliaoView;

@Service("discusskechengziliaoService")
public class DiscusskechengziliaoServiceImpl extends ServiceImpl<DiscusskechengziliaoDao, DiscusskechengziliaoEntity> implements DiscusskechengziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskechengziliaoEntity> page = this.selectPage(
                new Query<DiscusskechengziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscusskechengziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskechengziliaoEntity> wrapper) {
		  Page<DiscusskechengziliaoView> page =new Query<DiscusskechengziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskechengziliaoVO> selectListVO(Wrapper<DiscusskechengziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskechengziliaoVO selectVO(Wrapper<DiscusskechengziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskechengziliaoView> selectListView(Wrapper<DiscusskechengziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskechengziliaoView selectView(Wrapper<DiscusskechengziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
