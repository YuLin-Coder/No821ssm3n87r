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


import com.dao.DiscusskechengDao;
import com.entity.DiscusskechengEntity;
import com.service.DiscusskechengService;
import com.entity.vo.DiscusskechengVO;
import com.entity.view.DiscusskechengView;

@Service("discusskechengService")
public class DiscusskechengServiceImpl extends ServiceImpl<DiscusskechengDao, DiscusskechengEntity> implements DiscusskechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskechengEntity> page = this.selectPage(
                new Query<DiscusskechengEntity>(params).getPage(),
                new EntityWrapper<DiscusskechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskechengEntity> wrapper) {
		  Page<DiscusskechengView> page =new Query<DiscusskechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskechengVO> selectListVO(Wrapper<DiscusskechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskechengVO selectVO(Wrapper<DiscusskechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskechengView> selectListView(Wrapper<DiscusskechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskechengView selectView(Wrapper<DiscusskechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
