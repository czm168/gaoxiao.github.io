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

import com.entity.ZhuanzhengguanliEntity;
import com.entity.view.ZhuanzhengguanliView;

import com.service.ZhuanzhengguanliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 转正管理
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
@RestController
@RequestMapping("/zhuanzhengguanli")
public class ZhuanzhengguanliController {
    @Autowired
    private ZhuanzhengguanliService zhuanzhengguanliService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuanzhengguanliEntity zhuanzhengguanli, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhuanzhengguanli.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanzhengguanliEntity> ew = new EntityWrapper<ZhuanzhengguanliEntity>();
		PageUtils page = zhuanzhengguanliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanzhengguanli), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuanzhengguanliEntity zhuanzhengguanli, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhuanzhengguanli.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanzhengguanliEntity> ew = new EntityWrapper<ZhuanzhengguanliEntity>();
		PageUtils page = zhuanzhengguanliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanzhengguanli), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuanzhengguanliEntity zhuanzhengguanli){
       	EntityWrapper<ZhuanzhengguanliEntity> ew = new EntityWrapper<ZhuanzhengguanliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuanzhengguanli, "zhuanzhengguanli")); 
        return R.ok().put("data", zhuanzhengguanliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuanzhengguanliEntity zhuanzhengguanli){
        EntityWrapper< ZhuanzhengguanliEntity> ew = new EntityWrapper< ZhuanzhengguanliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuanzhengguanli, "zhuanzhengguanli")); 
		ZhuanzhengguanliView zhuanzhengguanliView =  zhuanzhengguanliService.selectView(ew);
		return R.ok("查询转正管理成功").put("data", zhuanzhengguanliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuanzhengguanliEntity zhuanzhengguanli = zhuanzhengguanliService.selectById(id);
        return R.ok().put("data", zhuanzhengguanli);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuanzhengguanliEntity zhuanzhengguanli = zhuanzhengguanliService.selectById(id);
        return R.ok().put("data", zhuanzhengguanli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanzhengguanliEntity zhuanzhengguanli, HttpServletRequest request){
    	zhuanzhengguanli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanzhengguanli);

        zhuanzhengguanliService.insert(zhuanzhengguanli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuanzhengguanliEntity zhuanzhengguanli, HttpServletRequest request){
    	zhuanzhengguanli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanzhengguanli);
    	zhuanzhengguanli.setUserid((Long)request.getSession().getAttribute("userId"));

        zhuanzhengguanliService.insert(zhuanzhengguanli);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuanzhengguanliEntity zhuanzhengguanli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuanzhengguanli);
        zhuanzhengguanliService.updateById(zhuanzhengguanli);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuanzhengguanliService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhuanzhengguanliEntity> wrapper = new EntityWrapper<ZhuanzhengguanliEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuanzhengguanliService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
