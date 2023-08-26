package com.entity.view;

import com.entity.ZhuanzhengguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 转正管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
@TableName("zhuanzhengguanli")
public class ZhuanzhengguanliView  extends ZhuanzhengguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanzhengguanliView(){
	}
 
 	public ZhuanzhengguanliView(ZhuanzhengguanliEntity zhuanzhengguanliEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanzhengguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
