package com.zdy.dubbo.dto.sysrole;

import java.io.Serializable;

import com.zdy.dubbo.model.sysrole.SysRole;


public class ModifySysRoleReq  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String available;
	private Long custId;
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	
	public String getAvailable() {
		return this.available;
	}

	public ModifySysRoleReq(){
		
	}
	
	public ModifySysRoleReq(SysRole sysRole){
		if(sysRole != null){
			this.setId(sysRole.getId());
			this.setName(sysRole.getName());
			this.setAvailable(sysRole.getAvailable());
			this.setCustId(sysRole.getCustId());
		}
	}
	public SysRole toSysRole(){
		SysRole  sysRole = new SysRole();
		sysRole.setId(this.id);
		sysRole.setName(this.name);
		sysRole.setAvailable(this.available);
		sysRole.setCustId(this.custId);
		return sysRole;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
}
