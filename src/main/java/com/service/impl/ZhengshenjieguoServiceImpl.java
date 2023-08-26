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


import com.dao.ZhengshenjieguoDao;
import com.entity.ZhengshenjieguoEntity;
import com.service.ZhengshenjieguoService;
import com.entity.vo.ZhengshenjieguoVO;
import com.entity.view.ZhengshenjieguoView;

@Service("zhengshenjieguoService")
public class ZhengshenjieguoServiceImpl extends ServiceImpl<ZhengshenjieguoDao, ZhengshenjieguoEntity> implements ZhengshenjieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhengshenjieguoEntity> page = this.selectPage(
                new Query<ZhengshenjieguoEntity>(params).getPage(),
                new EntityWrapper<ZhengshenjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhengshenjieguoEntity> wrapper) {
		  Page<ZhengshenjieguoView> page =new Query<ZhengshenjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhengshenjieguoVO> selectListVO(Wrapper<ZhengshenjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhengshenjieguoVO selectVO(Wrapper<ZhengshenjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhengshenjieguoView> selectListView(Wrapper<ZhengshenjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhengshenjieguoView selectView(Wrapper<ZhengshenjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
