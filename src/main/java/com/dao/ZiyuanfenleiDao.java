package com.dao;

import com.entity.ZiyuanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanfenleiVO;
import com.entity.view.ZiyuanfenleiView;


/**
 * 资源分类
 * 
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface ZiyuanfenleiDao extends BaseMapper<ZiyuanfenleiEntity> {
	
	List<ZiyuanfenleiVO> selectListVO(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
	ZiyuanfenleiVO selectVO(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
	List<ZiyuanfenleiView> selectListView(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);

	List<ZiyuanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
	ZiyuanfenleiView selectView(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
}
