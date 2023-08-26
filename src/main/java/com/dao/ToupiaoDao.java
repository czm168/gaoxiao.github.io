package com.dao;

import com.entity.ToupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToupiaoVO;
import com.entity.view.ToupiaoView;


/**
 * 投票
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface ToupiaoDao extends BaseMapper<ToupiaoEntity> {
	
	List<ToupiaoVO> selectListVO(@Param("ew") Wrapper<ToupiaoEntity> wrapper);
	
	ToupiaoVO selectVO(@Param("ew") Wrapper<ToupiaoEntity> wrapper);
	
	List<ToupiaoView> selectListView(@Param("ew") Wrapper<ToupiaoEntity> wrapper);

	List<ToupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaoEntity> wrapper);
	
	ToupiaoView selectView(@Param("ew") Wrapper<ToupiaoEntity> wrapper);
	
}
