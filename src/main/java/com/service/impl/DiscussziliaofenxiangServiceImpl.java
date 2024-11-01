package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussziliaofenxiangDao;
import com.entity.DiscussziliaofenxiangEntity;
import com.service.DiscussziliaofenxiangService;
import com.entity.vo.DiscussziliaofenxiangVO;
import com.entity.view.DiscussziliaofenxiangView;

@Service("discussziliaofenxiangService")
public class DiscussziliaofenxiangServiceImpl extends ServiceImpl<DiscussziliaofenxiangDao, DiscussziliaofenxiangEntity> implements DiscussziliaofenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussziliaofenxiangEntity> page = this.selectPage(
                new Query<DiscussziliaofenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussziliaofenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussziliaofenxiangEntity> wrapper) {
		  Page<DiscussziliaofenxiangView> page =new Query<DiscussziliaofenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussziliaofenxiangVO> selectListVO(Wrapper<DiscussziliaofenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussziliaofenxiangVO selectVO(Wrapper<DiscussziliaofenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussziliaofenxiangView> selectListView(Wrapper<DiscussziliaofenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussziliaofenxiangView selectView(Wrapper<DiscussziliaofenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
