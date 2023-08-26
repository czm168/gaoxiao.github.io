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


import com.dao.PingyoushenqingDao;
import com.entity.PingyoushenqingEntity;
import com.service.PingyoushenqingService;
import com.entity.vo.PingyoushenqingVO;
import com.entity.view.PingyoushenqingView;

@Service("pingyoushenqingService")
public class PingyoushenqingServiceImpl extends ServiceImpl<PingyoushenqingDao, PingyoushenqingEntity> implements PingyoushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingyoushenqingEntity> page = this.selectPage(
                new Query<PingyoushenqingEntity>(params).getPage(),
                new EntityWrapper<PingyoushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingyoushenqingEntity> wrapper) {
		  Page<PingyoushenqingView> page =new Query<PingyoushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingyoushenqingVO> selectListVO(Wrapper<PingyoushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingyoushenqingVO selectVO(Wrapper<PingyoushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingyoushenqingView> selectListView(Wrapper<PingyoushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingyoushenqingView selectView(Wrapper<PingyoushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
