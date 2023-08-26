package com.dao;

import com.entity.ZhengshenjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhengshenjieguoVO;
import com.entity.view.ZhengshenjieguoView;


/**
 * 政审结果
 * 
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface ZhengshenjieguoDao extends BaseMapper<ZhengshenjieguoEntity> {
	
	List<ZhengshenjieguoVO> selectListVO(@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);
	
	ZhengshenjieguoVO selectVO(@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);
	
	List<ZhengshenjieguoView> selectListView(@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);

	List<ZhengshenjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);
	
	ZhengshenjieguoView selectView(@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);
	
}
