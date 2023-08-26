package com.entity.view;

import com.entity.DangyuantanhuajiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员谈话记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
@TableName("dangyuantanhuajilu")
public class DangyuantanhuajiluView  extends DangyuantanhuajiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuantanhuajiluView(){
	}
 
 	public DangyuantanhuajiluView(DangyuantanhuajiluEntity dangyuantanhuajiluEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuantanhuajiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
