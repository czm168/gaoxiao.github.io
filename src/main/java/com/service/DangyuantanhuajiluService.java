package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuantanhuajiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuantanhuajiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuantanhuajiluView;


/**
 * 党员谈话记录
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface DangyuantanhuajiluService extends IService<DangyuantanhuajiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuantanhuajiluVO> selectListVO(Wrapper<DangyuantanhuajiluEntity> wrapper);
   	
   	DangyuantanhuajiluVO selectVO(@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);
   	
   	List<DangyuantanhuajiluView> selectListView(Wrapper<DangyuantanhuajiluEntity> wrapper);
   	
   	DangyuantanhuajiluView selectView(@Param("ew") Wrapper<DangyuantanhuajiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuantanhuajiluEntity> wrapper);
   	
}

