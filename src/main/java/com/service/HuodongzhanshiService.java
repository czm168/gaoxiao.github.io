package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongzhanshiView;


/**
 * 活动展示
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface HuodongzhanshiService extends IService<HuodongzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongzhanshiVO> selectListVO(Wrapper<HuodongzhanshiEntity> wrapper);
   	
   	HuodongzhanshiVO selectVO(@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);
   	
   	List<HuodongzhanshiView> selectListView(Wrapper<HuodongzhanshiEntity> wrapper);
   	
   	HuodongzhanshiView selectView(@Param("ew") Wrapper<HuodongzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongzhanshiEntity> wrapper);
   	
}

