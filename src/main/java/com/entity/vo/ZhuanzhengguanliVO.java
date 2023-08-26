package com.entity.vo;

import com.entity.ZhuanzhengguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 转正管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 17:05:57
 */
public class ZhuanzhengguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份类型
	 */
	
	private String shenfenleixing;
		
	/**
	 * 转正材料
	 */
	
	private String zhuanzhengcailiao;
		
	/**
	 * 申请原因
	 */
	
	private String shenqingyuanyin;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 党组织意见
	 */
	
	private String dangzuzhiyijian;
		
	/**
	 * 党内外群众意见
	 */
	
	private String dangneiwaiqunzhongyijian;
		
	/**
	 * 支委会审查结果
	 */
	
	private String zhiweihuishenchajieguo;
		
	/**
	 * 党委审批结果
	 */
	
	private String dangweishenpijieguo;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身份类型
	 */
	 
	public void setShenfenleixing(String shenfenleixing) {
		this.shenfenleixing = shenfenleixing;
	}
	
	/**
	 * 获取：身份类型
	 */
	public String getShenfenleixing() {
		return shenfenleixing;
	}
				
	
	/**
	 * 设置：转正材料
	 */
	 
	public void setZhuanzhengcailiao(String zhuanzhengcailiao) {
		this.zhuanzhengcailiao = zhuanzhengcailiao;
	}
	
	/**
	 * 获取：转正材料
	 */
	public String getZhuanzhengcailiao() {
		return zhuanzhengcailiao;
	}
				
	
	/**
	 * 设置：申请原因
	 */
	 
	public void setShenqingyuanyin(String shenqingyuanyin) {
		this.shenqingyuanyin = shenqingyuanyin;
	}
	
	/**
	 * 获取：申请原因
	 */
	public String getShenqingyuanyin() {
		return shenqingyuanyin;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：党组织意见
	 */
	 
	public void setDangzuzhiyijian(String dangzuzhiyijian) {
		this.dangzuzhiyijian = dangzuzhiyijian;
	}
	
	/**
	 * 获取：党组织意见
	 */
	public String getDangzuzhiyijian() {
		return dangzuzhiyijian;
	}
				
	
	/**
	 * 设置：党内外群众意见
	 */
	 
	public void setDangneiwaiqunzhongyijian(String dangneiwaiqunzhongyijian) {
		this.dangneiwaiqunzhongyijian = dangneiwaiqunzhongyijian;
	}
	
	/**
	 * 获取：党内外群众意见
	 */
	public String getDangneiwaiqunzhongyijian() {
		return dangneiwaiqunzhongyijian;
	}
				
	
	/**
	 * 设置：支委会审查结果
	 */
	 
	public void setZhiweihuishenchajieguo(String zhiweihuishenchajieguo) {
		this.zhiweihuishenchajieguo = zhiweihuishenchajieguo;
	}
	
	/**
	 * 获取：支委会审查结果
	 */
	public String getZhiweihuishenchajieguo() {
		return zhiweihuishenchajieguo;
	}
				
	
	/**
	 * 设置：党委审批结果
	 */
	 
	public void setDangweishenpijieguo(String dangweishenpijieguo) {
		this.dangweishenpijieguo = dangweishenpijieguo;
	}
	
	/**
	 * 获取：党委审批结果
	 */
	public String getDangweishenpijieguo() {
		return dangweishenpijieguo;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
