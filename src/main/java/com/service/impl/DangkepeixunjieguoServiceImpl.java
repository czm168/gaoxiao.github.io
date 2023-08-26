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


import com.dao.DangkepeixunjieguoDao;
import com.entity.DangkepeixunjieguoEntity;
import com.service.DangkepeixunjieguoService;
import com.entity.vo.DangkepeixunjieguoVO;
import com.entity.view.DangkepeixunjieguoView;

@Service("dangkepeixunjieguoService")
public class DangkepeixunjieguoServiceImpl extends ServiceImpl<DangkepeixunjieguoDao, DangkepeixunjieguoEntity> implements DangkepeixunjieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangkepeixunjieguoEntity> page = this.selectPage(
                new Query<DangkepeixunjieguoEntity>(params).getPage(),
                new EntityWrapper<DangkepeixunjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangkepeixunjieguoEntity> wrapper) {
		  Page<DangkepeixunjieguoView> page =new Query<DangkepeixunjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangkepeixunjieguoVO> selectListVO(Wrapper<DangkepeixunjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangkepeixunjieguoVO selectVO(Wrapper<DangkepeixunjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangkepeixunjieguoView> selectListView(Wrapper<DangkepeixunjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangkepeixunjieguoView selectView(Wrapper<DangkepeixunjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
