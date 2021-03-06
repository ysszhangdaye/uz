package com.zdy.dubbo.model.links;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.zdy.dubbo.common.util.Page;


public class Links extends Page implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
    /**
     * 主键       db_column: id 
     */	
	private Long id;
    /**
     * 连接名称       db_column: link_name 
     */	
	private String linkName;
    /**
     * 连接地址       db_column: link_addr 
     */	
	private String linkAddr;
    /**
     * 是否显示 0是1否       db_column: display 
     */	
	private Integer display;
    /**
     * 连接类型 0友情链接 1合作网站       db_column: link_type 
     */	
	private Integer linkType;
    /**
     * 连接说明       db_column: link_comment 
     */	
	private String linkComment;
    /**
     * 创建人       db_column: create_user 
     */	
	private Long createUser;
    /**
     * 创建时间       db_column: create_time 
     */	
	private Date createTime;
    /**
     * 修改时间       db_column: oper_time 
     */	
	private Date operTime;
    /**
     * 修改人       db_column: oper_user 
     */	
	private Long operUser;
    /**
     * rsrvStr1       db_column: RSRV_STR1 
     */	
	private String rsrvStr1;
    /**
     * rsrvStr2       db_column: RSRV_STR2 
     */	
	private String rsrvStr2;
    /**
     * rsrvStr4       db_column: RSRV_STR4 
     */	
	private String rsrvStr4;
    /**
     * rsrvStr3       db_column: RSRV_STR3 
     */	
	private String rsrvStr3;
    /**
     * rsrvStr5       db_column: RSRV_STR5 
     */	
	private String rsrvStr5;
    /**
     * rsrvStr6       db_column: RSRV_STR6 
     */	
	private String rsrvStr6;
    /**
     * rsrvStr7       db_column: RSRV_STR7 
     */	
	private String rsrvStr7;
    /**
     * rsrvStr8       db_column: RSRV_STR8 
     */	
	private String rsrvStr8;
    /**
     * rsrvStr9       db_column: RSRV_STR9 
     */	
	private String rsrvStr9;
    /**
     * rsrvStr0       db_column: RSRV_STR0 
     */	
	private String rsrvStr0;
    /**
     * attachId       db_column: ATTACH_ID 
     */	
	private String attachId;
	
	private Long[] ids;
	
	public Links(){
	}

	public Links(Long id){
		this.id = id;
	}


	public Links(Links links){
		if(null != links){
				this.setId(links.getId());
				this.setLinkName(links.getLinkName());
				this.setLinkAddr(links.getLinkAddr());
				this.setDisplay(links.getDisplay());
				this.setLinkType(links.getLinkType());
				this.setLinkComment(links.getLinkComment());
				this.setCreateUser(links.getCreateUser());
				this.setCreateTime(links.getCreateTime());
				this.setOperTime(links.getOperTime());
				this.setOperUser(links.getOperUser());
				this.setRsrvStr1(links.getRsrvStr1());
				this.setRsrvStr2(links.getRsrvStr2());
				this.setRsrvStr4(links.getRsrvStr4());
				this.setRsrvStr3(links.getRsrvStr3());
				this.setRsrvStr5(links.getRsrvStr5());
				this.setRsrvStr6(links.getRsrvStr6());
				this.setRsrvStr7(links.getRsrvStr7());
				this.setRsrvStr8(links.getRsrvStr8());
				this.setRsrvStr9(links.getRsrvStr9());
				this.setRsrvStr0(links.getRsrvStr0());
				this.setAttachId(links.getAttachId());
		}
	}
	
	public Map<String,Object> toMap(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id",this.id);
		map.put("linkName",this.linkName);
		map.put("linkAddr",this.linkAddr);
		map.put("display",this.display);
		map.put("linkType",this.linkType);
		map.put("linkComment",this.linkComment);
		map.put("createUser",this.createUser);
		map.put("createTime",this.createTime);
		map.put("operTime",this.operTime);
		map.put("operUser",this.operUser);
		map.put("rsrvStr1",this.rsrvStr1);
		map.put("rsrvStr2",this.rsrvStr2);
		map.put("rsrvStr4",this.rsrvStr4);
		map.put("rsrvStr3",this.rsrvStr3);
		map.put("rsrvStr5",this.rsrvStr5);
		map.put("rsrvStr6",this.rsrvStr6);
		map.put("rsrvStr7",this.rsrvStr7);
		map.put("rsrvStr8",this.rsrvStr8);
		map.put("rsrvStr9",this.rsrvStr9);
		map.put("rsrvStr0",this.rsrvStr0);
		map.put("attachId",this.attachId);
		return map;
	}

		
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
		
	public void setLinkName(String value) {
		this.linkName = value;
	}
	
	public String getLinkName() {
		return this.linkName;
	}
		
	public void setLinkAddr(String value) {
		this.linkAddr = value;
	}
	
	public String getLinkAddr() {
		return this.linkAddr;
	}
		
	public void setDisplay(Integer value) {
		this.display = value;
	}
	
	public Integer getDisplay() {
		return this.display;
	}
		
	public void setLinkType(Integer value) {
		this.linkType = value;
	}
	
	public Integer getLinkType() {
		return this.linkType;
	}
		
	public void setLinkComment(String value) {
		this.linkComment = value;
	}
	
	public String getLinkComment() {
		return this.linkComment;
	}
		
	public void setCreateUser(Long value) {
		this.createUser = value;
	}
	
	public Long getCreateUser() {
		return this.createUser;
	}
		
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
		
	public void setOperTime(Date value) {
		this.operTime = value;
	}
	
	public Date getOperTime() {
		return this.operTime;
	}
		
	public void setOperUser(Long value) {
		this.operUser = value;
	}
	
	public Long getOperUser() {
		return this.operUser;
	}
		
	public void setRsrvStr1(String value) {
		this.rsrvStr1 = value;
	}
	
	public String getRsrvStr1() {
		return this.rsrvStr1;
	}
		
	public void setRsrvStr2(String value) {
		this.rsrvStr2 = value;
	}
	
	public String getRsrvStr2() {
		return this.rsrvStr2;
	}
		
	public void setRsrvStr4(String value) {
		this.rsrvStr4 = value;
	}
	
	public String getRsrvStr4() {
		return this.rsrvStr4;
	}
		
	public void setRsrvStr3(String value) {
		this.rsrvStr3 = value;
	}
	
	public String getRsrvStr3() {
		return this.rsrvStr3;
	}
		
	public void setRsrvStr5(String value) {
		this.rsrvStr5 = value;
	}
	
	public String getRsrvStr5() {
		return this.rsrvStr5;
	}
		
	public void setRsrvStr6(String value) {
		this.rsrvStr6 = value;
	}
	
	public String getRsrvStr6() {
		return this.rsrvStr6;
	}
		
	public void setRsrvStr7(String value) {
		this.rsrvStr7 = value;
	}
	
	public String getRsrvStr7() {
		return this.rsrvStr7;
	}
		
	public void setRsrvStr8(String value) {
		this.rsrvStr8 = value;
	}
	
	public String getRsrvStr8() {
		return this.rsrvStr8;
	}
		
	public void setRsrvStr9(String value) {
		this.rsrvStr9 = value;
	}
	
	public String getRsrvStr9() {
		return this.rsrvStr9;
	}
		
	public void setRsrvStr0(String value) {
		this.rsrvStr0 = value;
	}
	
	public String getRsrvStr0() {
		return this.rsrvStr0;
	}
		
	public void setAttachId(String value) {
		this.attachId = value;
	}
	
	public String getAttachId() {
		return this.attachId;
	}
	public void setIds(Long[] ids){
		this.ids = ids;
	}
	
	public Long[] getIds(){
		return this.ids;
	}
}

