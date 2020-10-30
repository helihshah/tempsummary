package com.boc.climatesummary.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "temp_summary")
public class TempSummary
{
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name = "stationName")
	private String stationName;
	@Column(name = "province")
	private String province;
	@Column(name = "date")
	private Date date;
	private String dateStr;
	@Column(name = "mean_temp")
	private Double mean_temp;
	@Column(name = "highest_monthly_maxi_temp")
	private Double highest_monthly_maxi_temp;
	@Column(name = "lowest_monthly_min_temp")
	private Double lowest_monthly_min_temp;
	
	public TempSummary()
	{
	}

	public TempSummary(Integer id)
	{
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getMean_temp() {
		return mean_temp;
	}

	public void setMean_temp(Double mean_temp) {
		this.mean_temp = mean_temp;
	}

	public Double getHighest_monthly_maxi_temp() {
		return highest_monthly_maxi_temp;
	}

	public void setHighest_monthly_maxi_temp(Double highest_monthly_maxi_temp) {
		this.highest_monthly_maxi_temp = highest_monthly_maxi_temp;
	}

	public Double getLowest_monthly_min_temp() {
		return lowest_monthly_min_temp;
	}

	public void setLowest_monthly_min_temp(Double lowest_monthly_min_temp) {
		this.lowest_monthly_min_temp = lowest_monthly_min_temp;
	}

	
}