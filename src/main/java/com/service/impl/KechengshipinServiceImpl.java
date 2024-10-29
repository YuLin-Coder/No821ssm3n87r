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


import com.dao.KechengshipinDao;
import com.entity.KechengshipinEntity;
import com.service.KechengshipinService;
import com.entity.vo.KechengshipinVO;
import com.entity.view.KechengshipinView;

@Service("kechengshipinService")
public class KechengshipinServiceImpl extends ServiceImpl<KechengshipinDao, KechengshipinEntity> implements KechengshipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengshipinEntity> page = this.selectPage(
                new Query<KechengshipinEntity>(params).getPage(),
                new EntityWrapper<KechengshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengshipinEntity> wrapper) {
		  Page<KechengshipinView> page =new Query<KechengshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengshipinVO> selectListVO(Wrapper<KechengshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengshipinVO selectVO(Wrapper<KechengshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengshipinView> selectListView(Wrapper<KechengshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengshipinView selectView(Wrapper<KechengshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
