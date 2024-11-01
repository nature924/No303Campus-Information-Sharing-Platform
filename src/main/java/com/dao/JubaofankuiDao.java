package com.dao;

import com.entity.JubaofankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubaofankuiVO;
import com.entity.view.JubaofankuiView;


/**
 * 举报反馈
 * 
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface JubaofankuiDao extends BaseMapper<JubaofankuiEntity> {
	
	List<JubaofankuiVO> selectListVO(@Param("ew") Wrapper<JubaofankuiEntity> wrapper);
	
	JubaofankuiVO selectVO(@Param("ew") Wrapper<JubaofankuiEntity> wrapper);
	
	List<JubaofankuiView> selectListView(@Param("ew") Wrapper<JubaofankuiEntity> wrapper);

	List<JubaofankuiView> selectListView(Pagination page,@Param("ew") Wrapper<JubaofankuiEntity> wrapper);
	
	JubaofankuiView selectView(@Param("ew") Wrapper<JubaofankuiEntity> wrapper);
	
}
