package com.entity.view;

import com.entity.PingyoushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 评优申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
@TableName("pingyoushenqing")
public class PingyoushenqingView  extends PingyoushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingyoushenqingView(){
	}
 
 	public PingyoushenqingView(PingyoushenqingEntity pingyoushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, pingyoushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
