package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanfenleiView;


/**
 * 资源分类
 *
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface ZiyuanfenleiService extends IService<ZiyuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanfenleiVO> selectListVO(Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	ZiyuanfenleiVO selectVO(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	List<ZiyuanfenleiView> selectListView(Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	ZiyuanfenleiView selectView(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanfenleiEntity> wrapper);
   	
}

