package com.byxx.gtz.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Id;

/**
 * @Author  JS
 * @Date 2023-08-11 
 */

@Entity
@Table(name = "CRH_JX_TEST1")
public class CrhJxTest1DTO implements Serializable {

	private static final long serialVersionUID = 6950115484867406413L;
	// id
	private String id;
	// ук╨е
	private String userName;

  	@Id
	@Column(name = "ID")
	public String getId() {
	  return id;
	}

	public void setId(String id) {
	  this.id = id;
	}

  	@Column(name = "USER_NAME")
	public String getUserName() {
	  return userName;
	}

	public void setUserName(String userName) {
	  this.userName = userName;
	}

}
