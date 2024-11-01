package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussziliaofenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussziliaofenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussziliaofenxiangView;


/**
 * 资料分享评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
public interface DiscussziliaofenxiangService extends IService<DiscussziliaofenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussziliaofenxiangVO> selectListVO(Wrapper<DiscussziliaofenxiangEntity> wrapper);
   	
   	DiscussziliaofenxiangVO selectVO(@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);
   	
   	List<DiscussziliaofenxiangView> selectListView(Wrapper<DiscussziliaofenxiangEntity> wrapper);
   	
   	DiscussziliaofenxiangView selectView(@Param("ew") Wrapper<DiscussziliaofenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussziliaofenxiangEntity> wrapper);
   	
}

