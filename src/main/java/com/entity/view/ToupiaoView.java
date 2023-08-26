package com.entity.view;

import com.entity.ToupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
@TableName("toupiao")
public class ToupiaoView  extends ToupiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ToupiaoView(){
	}
 
 	public ToupiaoView(ToupiaoEntity toupiaoEntity){
 	try {
			BeanUtils.copyProperties(this, toupiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
