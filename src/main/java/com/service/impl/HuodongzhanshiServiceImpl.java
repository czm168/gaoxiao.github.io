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


import com.dao.HuodongzhanshiDao;
import com.entity.HuodongzhanshiEntity;
import com.service.HuodongzhanshiService;
import com.entity.vo.HuodongzhanshiVO;
import com.entity.view.HuodongzhanshiView;

@Service("huodongzhanshiService")
public class HuodongzhanshiServiceImpl extends ServiceImpl<HuodongzhanshiDao, HuodongzhanshiEntity> implements HuodongzhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongzhanshiEntity> page = this.selectPage(
                new Query<HuodongzhanshiEntity>(params).getPage(),
                new EntityWrapper<HuodongzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongzhanshiEntity> wrapper) {
		  Page<HuodongzhanshiView> page =new Query<HuodongzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongzhanshiVO> selectListVO(Wrapper<HuodongzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongzhanshiVO selectVO(Wrapper<HuodongzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongzhanshiView> selectListView(Wrapper<HuodongzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongzhanshiView selectView(Wrapper<HuodongzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
