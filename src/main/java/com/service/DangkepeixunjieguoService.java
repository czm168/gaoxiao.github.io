package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangkepeixunjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangkepeixunjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangkepeixunjieguoView;


/**
 * 党课培训结果
 *
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public interface DangkepeixunjieguoService extends IService<DangkepeixunjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangkepeixunjieguoVO> selectListVO(Wrapper<DangkepeixunjieguoEntity> wrapper);
   	
   	DangkepeixunjieguoVO selectVO(@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);
   	
   	List<DangkepeixunjieguoView> selectListView(Wrapper<DangkepeixunjieguoEntity> wrapper);
   	
   	DangkepeixunjieguoView selectView(@Param("ew") Wrapper<DangkepeixunjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangkepeixunjieguoEntity> wrapper);
   	
}

