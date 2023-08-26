package com.dao;

import com.entity.DangyuantanhuajiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuantanhuajiluVO;
import com.entity.view.DangyuantanhuajiluView;


/**
 * 党员谈话记录
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface DangyuantanhuajiluDao extends BaseMapper<DangyuantanhuajiluEntity> {
	
	List<DangyuantanhuajiluVO> selectListVO(@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);
	
	DangyuantanhuajiluVO selectVO(@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);
	
	List<DangyuantanhuajiluView> selectListView(@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);

	List<DangyuantanhuajiluView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);
	
	DangyuantanhuajiluView selectView(@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);
	
}
