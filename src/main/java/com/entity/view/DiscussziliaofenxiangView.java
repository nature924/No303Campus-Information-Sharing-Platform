package com.entity.view;

import com.entity.DiscussziliaofenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资料分享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
@TableName("discussziliaofenxiang")
public class DiscussziliaofenxiangView  extends DiscussziliaofenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussziliaofenxiangView(){
	}
 
 	public DiscussziliaofenxiangView(DiscussziliaofenxiangEntity discussziliaofenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussziliaofenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
