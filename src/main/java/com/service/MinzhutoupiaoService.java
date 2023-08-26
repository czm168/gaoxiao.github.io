package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinzhutoupiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MinzhutoupiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MinzhutoupiaoView;


/**
 * 民主投票
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface MinzhutoupiaoService extends IService<MinzhutoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinzhutoupiaoVO> selectListVO(Wrapper<MinzhutoupiaoEntity> wrapper);
   	
   	MinzhutoupiaoVO selectVO(@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);
   	
   	List<MinzhutoupiaoView> selectListView(Wrapper<MinzhutoupiaoEntity> wrapper);
   	
   	MinzhutoupiaoView selectView(@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinzhutoupiaoEntity> wrapper);
   	
}

