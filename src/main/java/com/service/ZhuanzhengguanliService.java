package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanzhengguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanzhengguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanzhengguanliView;


/**
 * 转正管理
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface ZhuanzhengguanliService extends IService<ZhuanzhengguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanzhengguanliVO> selectListVO(Wrapper<ZhuanzhengguanliEntity> wrapper);
   	
   	ZhuanzhengguanliVO selectVO(@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);
   	
   	List<ZhuanzhengguanliView> selectListView(Wrapper<ZhuanzhengguanliEntity> wrapper);
   	
   	ZhuanzhengguanliView selectView(@Param("ew") Wrapper<ZhuanzhengguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanzhengguanliEntity> wrapper);
   	
}

