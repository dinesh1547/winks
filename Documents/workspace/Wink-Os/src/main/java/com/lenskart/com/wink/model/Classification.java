package com.lenskart.com.wink.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="classification")
public class Classification {

	
		private Integer id;
		private String classificationName;
		private String website;
		private String unicom_syn_status;
		
		@Id
		@Column(name = "id", nullable = false, unique = true)
		public Integer getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		@Column(name = "value", nullable = false,unique = true)
		public String getClassificationName() {
			return classificationName;
		}
		public void setClassificationName(String classificationName) {
			this.classificationName = classificationName;
		}
		
		@Column(name = "website")
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		
		@Column(name = "unicom_syn_status")
		public String getUnicom_syn_status() {
			return unicom_syn_status;
		}
		public void setUnicom_syn_status(String unicom_syn_status) {
			this.unicom_syn_status = unicom_syn_status;
		}
	
	
}
