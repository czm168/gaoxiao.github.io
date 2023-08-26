package com.dao;

import com.entity.ZhuanzhengguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanzhengguanliVO;
import com.entity.view.ZhuanzhengguanliView;


/**
 * 转正管理
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface ZhuanzhengguanliDao extends BaseMapper<ZhuanzhengguanliEntity> {
	
	List<ZhuanzhengguanliVO> selectListVO(@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);
	
	ZhuanzhengguanliVO selectVO(@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);
	
	List<ZhuanzhengguanliView> selectListView(@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);

	List<ZhuanzhengguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);
	
	ZhuanzhengguanliView selectView(@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);
	
}
