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


import com.dao.DangyuantanhuajiluDao;
import com.entity.DangyuantanhuajiluEntity;
import com.service.DangyuantanhuajiluService;
import com.entity.vo.DangyuantanhuajiluVO;
import com.entity.view.DangyuantanhuajiluView;

@Service("dangyuantanhuajiluService")
public class DangyuantanhuajiluServiceImpl extends ServiceImpl<DangyuantanhuajiluDao, DangyuantanhuajiluEntity> implements DangyuantanhuajiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuantanhuajiluEntity> page = this.selectPage(
                new Query<DangyuantanhuajiluEntity>(params).getPage(),
                new EntityWrapper<DangyuantanhuajiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuantanhuajiluEntity> wrapper) {
		  Page<DangyuantanhuajiluView> page =new Query<DangyuantanhuajiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuantanhuajiluVO> selectListVO(Wrapper<DangyuantanhuajiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuantanhuajiluVO selectVO(Wrapper<DangyuantanhuajiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuantanhuajiluView> selectListView(Wrapper<DangyuantanhuajiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuantanhuajiluView selectView(Wrapper<DangyuantanhuajiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
