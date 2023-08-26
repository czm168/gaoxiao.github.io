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


import com.dao.ZhuanzhengguanliDao;
import com.entity.ZhuanzhengguanliEntity;
import com.service.ZhuanzhengguanliService;
import com.entity.vo.ZhuanzhengguanliVO;
import com.entity.view.ZhuanzhengguanliView;

@Service("zhuanzhengguanliService")
public class ZhuanzhengguanliServiceImpl extends ServiceImpl<ZhuanzhengguanliDao, ZhuanzhengguanliEntity> implements ZhuanzhengguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanzhengguanliEntity> page = this.selectPage(
                new Query<ZhuanzhengguanliEntity>(params).getPage(),
                new EntityWrapper<ZhuanzhengguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanzhengguanliEntity> wrapper) {
		  Page<ZhuanzhengguanliView> page =new Query<ZhuanzhengguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanzhengguanliVO> selectListVO(Wrapper<ZhuanzhengguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanzhengguanliVO selectVO(Wrapper<ZhuanzhengguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanzhengguanliView> selectListView(Wrapper<ZhuanzhengguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanzhengguanliView selectView(Wrapper<ZhuanzhengguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
