package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubaofankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubaofankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubaofankuiView;


/**
 * 举报反馈
 *
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface JubaofankuiService extends IService<JubaofankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubaofankuiVO> selectListVO(Wrapper<JubaofankuiEntity> wrapper);
   	
   	JubaofankuiVO selectVO(@Param("ew") Wrapper<JubaofankuiEntity> wrapper);
   	
   	List<JubaofankuiView> selectListView(Wrapper<JubaofankuiEntity> wrapper);
   	
   	JubaofankuiView selectView(@Param("ew") Wrapper<JubaofankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubaofankuiEntity> wrapper);
   	
}

