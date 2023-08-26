package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingyoushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingyoushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingyoushenqingView;


/**
 * 评优申请
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface PingyoushenqingService extends IService<PingyoushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingyoushenqingVO> selectListVO(Wrapper<PingyoushenqingEntity> wrapper);
   	
   	PingyoushenqingVO selectVO(@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);
   	
   	List<PingyoushenqingView> selectListView(Wrapper<PingyoushenqingEntity> wrapper);
   	
   	PingyoushenqingView selectView(@Param("ew") Wrapper<PingyoushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingyoushenqingEntity> wrapper);
   	
}

