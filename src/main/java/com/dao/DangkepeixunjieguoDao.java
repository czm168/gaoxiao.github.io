package com.dao;

import com.entity.DangkepeixunjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangkepeixunjieguoVO;
import com.entity.view.DangkepeixunjieguoView;


/**
 * 党课培训结果
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface DangkepeixunjieguoDao extends BaseMapper<DangkepeixunjieguoEntity> {
	
	List<DangkepeixunjieguoVO> selectListVO(@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);
	
	DangkepeixunjieguoVO selectVO(@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);
	
	List<DangkepeixunjieguoView> selectListView(@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);

	List<DangkepeixunjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);
	
	DangkepeixunjieguoView selectView(@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);
	
}
