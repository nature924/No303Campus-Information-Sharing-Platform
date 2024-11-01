package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaofenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiliaofenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaofenxiangView;


/**
 * 资料分享
 *
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface ZiliaofenxiangService extends IService<ZiliaofenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiliaofenxiangVO> selectListVO(Wrapper<ZiliaofenxiangEntity> wrapper);
   	
   	ZiliaofenxiangVO selectVO(@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);
   	
   	List<ZiliaofenxiangView> selectListView(Wrapper<ZiliaofenxiangEntity> wrapper);
   	
   	ZiliaofenxiangView selectView(@Param("ew") Wrapper<ZiliaofenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiliaofenxiangEntity> wrapper);
   	
}

