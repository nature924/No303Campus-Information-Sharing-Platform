package com.dao;

import com.entity.DiscussziliaofenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussziliaofenxiangVO;
import com.entity.view.DiscussziliaofenxiangView;


/**
 * 资料分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface DiscussziliaofenxiangDao extends BaseMapper<DiscussziliaofenxiangEntity> {
	
	List<DiscussziliaofenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);
	
	DiscussziliaofenxiangVO selectVO(@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);
	
	List<DiscussziliaofenxiangView> selectListView(@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);

	List<DiscussziliaofenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);
	
	DiscussziliaofenxiangView selectView(@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);
	
}
