package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZiliaofenxiangEntity;
import com.entity.view.ZiliaofenxiangView;

import com.service.ZiliaofenxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 资料分享
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-10 16:23:17
 */
@RestController
@RequestMapping("/ziliaofenxiang")
public class ZiliaofenxiangController {
    @Autowired
    private ZiliaofenxiangService ziliaofenxiangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZiliaofenxiangEntity ziliaofenxiang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			ziliaofenxiang.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZiliaofenxiangEntity> ew = new EntityWrapper<ZiliaofenxiangEntity>();
		PageUtils page = ziliaofenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziliaofenxiang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZiliaofenxiangEntity ziliaofenxiang, HttpServletRequest request){
        EntityWrapper<ZiliaofenxiangEntity> ew = new EntityWrapper<ZiliaofenxiangEntity>();
		PageUtils page = ziliaofenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziliaofenxiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZiliaofenxiangEntity ziliaofenxiang){
       	EntityWrapper<ZiliaofenxiangEntity> ew = new EntityWrapper<ZiliaofenxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ziliaofenxiang, "ziliaofenxiang")); 
        return R.ok().put("data", ziliaofenxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZiliaofenxiangEntity ziliaofenxiang){
        EntityWrapper< ZiliaofenxiangEntity> ew = new EntityWrapper< ZiliaofenxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ziliaofenxiang, "ziliaofenxiang")); 
		ZiliaofenxiangView ziliaofenxiangView =  ziliaofenxiangService.selectView(ew);
		return R.ok("查询资料分享成功").put("data", ziliaofenxiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZiliaofenxiangEntity ziliaofenxiang = ziliaofenxiangService.selectById(id);
        return R.ok().put("data", ziliaofenxiang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZiliaofenxiangEntity ziliaofenxiang = ziliaofenxiangService.selectById(id);
        return R.ok().put("data", ziliaofenxiang);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ZiliaofenxiangEntity ziliaofenxiang = ziliaofenxiangService.selectById(id);
        if(type.equals("1")) {
        	ziliaofenxiang.setThumbsupnum(ziliaofenxiang.getThumbsupnum()+1);
        } else {
        	ziliaofenxiang.setCrazilynum(ziliaofenxiang.getCrazilynum()+1);
        }
        ziliaofenxiangService.updateById(ziliaofenxiang);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZiliaofenxiangEntity ziliaofenxiang, HttpServletRequest request){
    	ziliaofenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ziliaofenxiang);
        ziliaofenxiangService.insert(ziliaofenxiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZiliaofenxiangEntity ziliaofenxiang, HttpServletRequest request){
    	ziliaofenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ziliaofenxiang);
        ziliaofenxiangService.insert(ziliaofenxiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZiliaofenxiangEntity ziliaofenxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ziliaofenxiang);
        ziliaofenxiangService.updateById(ziliaofenxiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ziliaofenxiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZiliaofenxiangEntity> wrapper = new EntityWrapper<ZiliaofenxiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = ziliaofenxiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
