package com.entity.view;

import com.entity.JubaofankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 举报反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
@TableName("jubaofankui")
public class JubaofankuiView  extends JubaofankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubaofankuiView(){
	}
 
 	public JubaofankuiView(JubaofankuiEntity jubaofankuiEntity){
 	try {
			BeanUtils.copyProperties(this, jubaofankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
