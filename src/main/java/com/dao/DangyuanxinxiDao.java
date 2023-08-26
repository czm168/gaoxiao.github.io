package com.dao;

import com.entity.DangyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanxinxiVO;
import com.entity.view.DangyuanxinxiView;


/**
 * 党员信息
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface DangyuanxinxiDao extends BaseMapper<DangyuanxinxiEntity> {
	
	List<DangyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);
	
	DangyuanxinxiVO selectVO(@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);
	
	List<DangyuanxinxiView> selectListView(@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);

	List<DangyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);
	
	DangyuanxinxiView selectView(@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);
	
}
