package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengshenjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhengshenjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengshenjieguoView;


/**
 * 政审结果
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface ZhengshenjieguoService extends IService<ZhengshenjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhengshenjieguoVO> selectListVO(Wrapper<ZhengshenjieguoEntity> wrapper);
   	
   	ZhengshenjieguoVO selectVO(@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);
   	
   	List<ZhengshenjieguoView> selectListView(Wrapper<ZhengshenjieguoEntity> wrapper);
   	
   	ZhengshenjieguoView selectView(@Param("ew") Wrapper<ZhengshenjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhengshenjieguoEntity> wrapper);
   	
}

