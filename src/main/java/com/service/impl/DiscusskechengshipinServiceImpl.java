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


import com.dao.DiscusskechengshipinDao;
import com.entity.DiscusskechengshipinEntity;
import com.service.DiscusskechengshipinService;
import com.entity.vo.DiscusskechengshipinVO;
import com.entity.view.DiscusskechengshipinView;

@Service("discusskechengshipinService")
public class DiscusskechengshipinServiceImpl extends ServiceImpl<DiscusskechengshipinDao, DiscusskechengshipinEntity> implements DiscusskechengshipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskechengshipinEntity> page = this.selectPage(
                new Query<DiscusskechengshipinEntity>(params).getPage(),
                new EntityWrapper<DiscusskechengshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskechengshipinEntity> wrapper) {
		  Page<DiscusskechengshipinView> page =new Query<DiscusskechengshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskechengshipinVO> selectListVO(Wrapper<DiscusskechengshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskechengshipinVO selectVO(Wrapper<DiscusskechengshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskechengshipinView> selectListView(Wrapper<DiscusskechengshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskechengshipinView selectView(Wrapper<DiscusskechengshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
