package com.dao;

import com.entity.HuodongzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongzhanshiVO;
import com.entity.view.HuodongzhanshiView;


/**
 * 活动展示
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface HuodongzhanshiDao extends BaseMapper<HuodongzhanshiEntity> {
	
	List<HuodongzhanshiVO> selectListVO(@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);
	
	HuodongzhanshiVO selectVO(@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);
	
	List<HuodongzhanshiView> selectListView(@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);

	List<HuodongzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);
	
	HuodongzhanshiView selectView(@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);
	
}
