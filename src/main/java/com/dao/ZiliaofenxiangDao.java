package com.dao;

import com.entity.ZiliaofenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiliaofenxiangVO;
import com.entity.view.ZiliaofenxiangView;


/**
 * 资料分享
 * 
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface ZiliaofenxiangDao extends BaseMapper<ZiliaofenxiangEntity> {
	
	List<ZiliaofenxiangVO> selectListVO(@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);
	
	ZiliaofenxiangVO selectVO(@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);
	
	List<ZiliaofenxiangView> selectListView(@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);

	List<ZiliaofenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);
	
	ZiliaofenxiangView selectView(@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);
	
}
