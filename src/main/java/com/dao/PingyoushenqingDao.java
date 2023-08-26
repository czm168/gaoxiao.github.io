package com.dao;

import com.entity.PingyoushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingyoushenqingVO;
import com.entity.view.PingyoushenqingView;


/**
 * 评优申请
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface PingyoushenqingDao extends BaseMapper<PingyoushenqingEntity> {
	
	List<PingyoushenqingVO> selectListVO(@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);
	
	PingyoushenqingVO selectVO(@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);
	
	List<PingyoushenqingView> selectListView(@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);

	List<PingyoushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);
	
	PingyoushenqingView selectView(@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);
	
}
