package com.chenglian.aischool.logistic.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "school_building")
public class Building {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuidGenerator")
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	private String id;

	private String schoolId;

	private String schoolZoneId;

	private String jzwh;

	private String jzwmc;

	private String syzkm;

	private String fwcq;

	private String xqh;

	private String jzwflm;

	private String jzwjgm;

	private String jzwcs;

	private String jcny;

	private String jzwtzze;

	private String jflym;

	private String zjzmj;

	private String zsymj;

	private String kzsfldm;

	private String kzsfbzm;

	private String jzwdz;

	private String jzwzkm;

	private String jzwtp;

	private String jzwpmt;

	private String xxdwccm;

	private String jzwwzzk;

	private String ghspwh;

	private String zhfznl;

	private Integer ghsynx;

	private String sfyyjbxcs;

	private String sfkyyyjbncs;

	private String cqzh;

	private String jzwytm;

	private Integer jzwzgd;

	private String kzsfldm1;

	private String wfjdbm;

	private String wfjdwh;

	private Date wfjdrq;

	private String gnfsm;

	private String jzwjcxsm;

	private String jzwpmxsm;

	private String jzwlbxsm;

	private String sfygzz;

	private String ql;

	private Date zjaqgzwcrq;

	private Integer zjaqgzhyjsynx;

	private String zxlxm;

	private String zyzxtzbzmcm;

	private String wwjzdjm;

	private Integer jxjfzyf;

	private Integer qzjs;

	private Integer qzsys;

	private Integer qztss;

	private Integer qzwjs;

	private Integer qzyys;

	private Integer qztyhds;

	private Integer qzqtjfyf;

	private Integer shyf;

	private Integer qzxsss;

	private Integer qzst;

	private Integer qzcs;

	private Integer qzglf;

	private Integer qzys;

	private Integer qzjgss;

	private Integer qzqtshyf;

	private Integer xzbgyf;

	private Integer qzjsbgs;

	private Integer qzwsbjs;

	private Integer qzqtxzbgyf;

	private Integer qtyf;

	private String ldwz;

	private String ldlx;

	private String remark;

	protected String remarks; // 备注
	// protected User createBy; // 创建者
	protected String createDate; // 创建日期
	// protected User updateBy; // 更新者
	protected String updateDate; // 更新日期
	protected String delFlag; // 删除标记（0：正常；1：删除；2：审核）

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	// private Zone zone;

	public String getLdwz() {
		return ldwz;
	}

	public void setLdwz(String ldwz) {
		this.ldwz = ldwz;
	}

	public String getLdlx() {
		return ldlx;
	}

	public void setLdlx(String ldlx) {
		this.ldlx = ldlx;
	}

	// public Zone getZone() {
	// return zone;
	// }
	//
	// public void setZone(Zone zone) {
	// this.zone = zone;
	// }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId == null ? null : schoolId.trim();
	}

	public String getSchoolZoneId() {
		return schoolZoneId;
	}

	public void setSchoolZoneId(String schoolZoneId) {
		this.schoolZoneId = schoolZoneId == null ? null : schoolZoneId.trim();
	}

	public String getJzwh() {
		return jzwh;
	}

	public void setJzwh(String jzwh) {
		this.jzwh = jzwh == null ? null : jzwh.trim();
	}

	public String getJzwmc() {
		return jzwmc;
	}

	public void setJzwmc(String jzwmc) {
		this.jzwmc = jzwmc == null ? null : jzwmc.trim();
	}

	public String getSyzkm() {
		return syzkm;
	}

	public void setSyzkm(String syzkm) {
		this.syzkm = syzkm == null ? null : syzkm.trim();
	}

	public String getFwcq() {
		return fwcq;
	}

	public void setFwcq(String fwcq) {
		this.fwcq = fwcq == null ? null : fwcq.trim();
	}

	public String getXqh() {
		return xqh;
	}

	public void setXqh(String xqh) {
		this.xqh = xqh == null ? null : xqh.trim();
	}

	public String getJzwflm() {
		return jzwflm;
	}

	public void setJzwflm(String jzwflm) {
		this.jzwflm = jzwflm == null ? null : jzwflm.trim();
	}

	public String getJzwjgm() {
		return jzwjgm;
	}

	public void setJzwjgm(String jzwjgm) {
		this.jzwjgm = jzwjgm == null ? null : jzwjgm.trim();
	}

	public String getJzwcs() {
		return jzwcs;
	}

	public void setJzwcs(String jzwcs) {
		this.jzwcs = jzwcs == null ? null : jzwcs.trim();
	}

	public String getJcny() {
		return jcny;
	}

	public void setJcny(String jcny) {
		this.jcny = jcny == null ? null : jcny.trim();
	}

	public String getJzwtzze() {
		return jzwtzze;
	}

	public void setJzwtzze(String jzwtzze) {
		this.jzwtzze = jzwtzze == null ? null : jzwtzze.trim();
	}

	public String getJflym() {
		return jflym;
	}

	public void setJflym(String jflym) {
		this.jflym = jflym == null ? null : jflym.trim();
	}

	public String getZjzmj() {
		return zjzmj;
	}

	public void setZjzmj(String zjzmj) {
		this.zjzmj = zjzmj == null ? null : zjzmj.trim();
	}

	public String getZsymj() {
		return zsymj;
	}

	public void setZsymj(String zsymj) {
		this.zsymj = zsymj == null ? null : zsymj.trim();
	}

	public String getKzsfldm() {
		return kzsfldm;
	}

	public void setKzsfldm(String kzsfldm) {
		this.kzsfldm = kzsfldm == null ? null : kzsfldm.trim();
	}

	public String getKzsfbzm() {
		return kzsfbzm;
	}

	public void setKzsfbzm(String kzsfbzm) {
		this.kzsfbzm = kzsfbzm == null ? null : kzsfbzm.trim();
	}

	public String getJzwdz() {
		return jzwdz;
	}

	public void setJzwdz(String jzwdz) {
		this.jzwdz = jzwdz == null ? null : jzwdz.trim();
	}

	public String getJzwzkm() {
		return jzwzkm;
	}

	public void setJzwzkm(String jzwzkm) {
		this.jzwzkm = jzwzkm == null ? null : jzwzkm.trim();
	}

	public String getJzwtp() {
		return jzwtp;
	}

	public void setJzwtp(String jzwtp) {
		this.jzwtp = jzwtp == null ? null : jzwtp.trim();
	}

	public String getJzwpmt() {
		return jzwpmt;
	}

	public void setJzwpmt(String jzwpmt) {
		this.jzwpmt = jzwpmt == null ? null : jzwpmt.trim();
	}

	public String getXxdwccm() {
		return xxdwccm;
	}

	public void setXxdwccm(String xxdwccm) {
		this.xxdwccm = xxdwccm == null ? null : xxdwccm.trim();
	}

	public String getJzwwzzk() {
		return jzwwzzk;
	}

	public void setJzwwzzk(String jzwwzzk) {
		this.jzwwzzk = jzwwzzk == null ? null : jzwwzzk.trim();
	}

	public String getGhspwh() {
		return ghspwh;
	}

	public void setGhspwh(String ghspwh) {
		this.ghspwh = ghspwh == null ? null : ghspwh.trim();
	}

	public String getZhfznl() {
		return zhfznl;
	}

	public void setZhfznl(String zhfznl) {
		this.zhfznl = zhfznl == null ? null : zhfznl.trim();
	}

	public Integer getGhsynx() {
		return ghsynx;
	}

	public void setGhsynx(Integer ghsynx) {
		this.ghsynx = ghsynx;
	}

	public String getSfyyjbxcs() {
		return sfyyjbxcs;
	}

	public void setSfyyjbxcs(String sfyyjbxcs) {
		this.sfyyjbxcs = sfyyjbxcs == null ? null : sfyyjbxcs.trim();
	}

	public String getSfkyyyjbncs() {
		return sfkyyyjbncs;
	}

	public void setSfkyyyjbncs(String sfkyyyjbncs) {
		this.sfkyyyjbncs = sfkyyyjbncs == null ? null : sfkyyyjbncs.trim();
	}

	public String getCqzh() {
		return cqzh;
	}

	public void setCqzh(String cqzh) {
		this.cqzh = cqzh == null ? null : cqzh.trim();
	}

	public String getJzwytm() {
		return jzwytm;
	}

	public void setJzwytm(String jzwytm) {
		this.jzwytm = jzwytm == null ? null : jzwytm.trim();
	}

	public Integer getJzwzgd() {
		return jzwzgd;
	}

	public void setJzwzgd(Integer jzwzgd) {
		this.jzwzgd = jzwzgd;
	}

	public String getKzsfldm1() {
		return kzsfldm1;
	}

	public void setKzsfldm1(String kzsfldm1) {
		this.kzsfldm1 = kzsfldm1 == null ? null : kzsfldm1.trim();
	}

	public String getWfjdbm() {
		return wfjdbm;
	}

	public void setWfjdbm(String wfjdbm) {
		this.wfjdbm = wfjdbm == null ? null : wfjdbm.trim();
	}

	public String getWfjdwh() {
		return wfjdwh;
	}

	public void setWfjdwh(String wfjdwh) {
		this.wfjdwh = wfjdwh == null ? null : wfjdwh.trim();
	}

	public Date getWfjdrq() {
		return wfjdrq;
	}

	public void setWfjdrq(Date wfjdrq) {
		this.wfjdrq = wfjdrq;
	}

	public String getGnfsm() {
		return gnfsm;
	}

	public void setGnfsm(String gnfsm) {
		this.gnfsm = gnfsm == null ? null : gnfsm.trim();
	}

	public String getJzwjcxsm() {
		return jzwjcxsm;
	}

	public void setJzwjcxsm(String jzwjcxsm) {
		this.jzwjcxsm = jzwjcxsm == null ? null : jzwjcxsm.trim();
	}

	public String getJzwpmxsm() {
		return jzwpmxsm;
	}

	public void setJzwpmxsm(String jzwpmxsm) {
		this.jzwpmxsm = jzwpmxsm == null ? null : jzwpmxsm.trim();
	}

	public String getJzwlbxsm() {
		return jzwlbxsm;
	}

	public void setJzwlbxsm(String jzwlbxsm) {
		this.jzwlbxsm = jzwlbxsm == null ? null : jzwlbxsm.trim();
	}

	public String getSfygzz() {
		return sfygzz;
	}

	public void setSfygzz(String sfygzz) {
		this.sfygzz = sfygzz == null ? null : sfygzz.trim();
	}

	public String getQl() {
		return ql;
	}

	public void setQl(String ql) {
		this.ql = ql == null ? null : ql.trim();
	}

	public Date getZjaqgzwcrq() {
		return zjaqgzwcrq;
	}

	public void setZjaqgzwcrq(Date zjaqgzwcrq) {
		this.zjaqgzwcrq = zjaqgzwcrq;
	}

	public Integer getZjaqgzhyjsynx() {
		return zjaqgzhyjsynx;
	}

	public void setZjaqgzhyjsynx(Integer zjaqgzhyjsynx) {
		this.zjaqgzhyjsynx = zjaqgzhyjsynx;
	}

	public String getZxlxm() {
		return zxlxm;
	}

	public void setZxlxm(String zxlxm) {
		this.zxlxm = zxlxm == null ? null : zxlxm.trim();
	}

	public String getZyzxtzbzmcm() {
		return zyzxtzbzmcm;
	}

	public void setZyzxtzbzmcm(String zyzxtzbzmcm) {
		this.zyzxtzbzmcm = zyzxtzbzmcm == null ? null : zyzxtzbzmcm.trim();
	}

	public String getWwjzdjm() {
		return wwjzdjm;
	}

	public void setWwjzdjm(String wwjzdjm) {
		this.wwjzdjm = wwjzdjm == null ? null : wwjzdjm.trim();
	}

	public Integer getJxjfzyf() {
		return jxjfzyf;
	}

	public void setJxjfzyf(Integer jxjfzyf) {
		this.jxjfzyf = jxjfzyf;
	}

	public Integer getQzjs() {
		return qzjs;
	}

	public void setQzjs(Integer qzjs) {
		this.qzjs = qzjs;
	}

	public Integer getQzsys() {
		return qzsys;
	}

	public void setQzsys(Integer qzsys) {
		this.qzsys = qzsys;
	}

	public Integer getQztss() {
		return qztss;
	}

	public void setQztss(Integer qztss) {
		this.qztss = qztss;
	}

	public Integer getQzwjs() {
		return qzwjs;
	}

	public void setQzwjs(Integer qzwjs) {
		this.qzwjs = qzwjs;
	}

	public Integer getQzyys() {
		return qzyys;
	}

	public void setQzyys(Integer qzyys) {
		this.qzyys = qzyys;
	}

	public Integer getQztyhds() {
		return qztyhds;
	}

	public void setQztyhds(Integer qztyhds) {
		this.qztyhds = qztyhds;
	}

	public Integer getQzqtjfyf() {
		return qzqtjfyf;
	}

	public void setQzqtjfyf(Integer qzqtjfyf) {
		this.qzqtjfyf = qzqtjfyf;
	}

	public Integer getShyf() {
		return shyf;
	}

	public void setShyf(Integer shyf) {
		this.shyf = shyf;
	}

	public Integer getQzxsss() {
		return qzxsss;
	}

	public void setQzxsss(Integer qzxsss) {
		this.qzxsss = qzxsss;
	}

	public Integer getQzst() {
		return qzst;
	}

	public void setQzst(Integer qzst) {
		this.qzst = qzst;
	}

	public Integer getQzcs() {
		return qzcs;
	}

	public void setQzcs(Integer qzcs) {
		this.qzcs = qzcs;
	}

	public Integer getQzglf() {
		return qzglf;
	}

	public void setQzglf(Integer qzglf) {
		this.qzglf = qzglf;
	}

	public Integer getQzys() {
		return qzys;
	}

	public void setQzys(Integer qzys) {
		this.qzys = qzys;
	}

	public Integer getQzjgss() {
		return qzjgss;
	}

	public void setQzjgss(Integer qzjgss) {
		this.qzjgss = qzjgss;
	}

	public Integer getQzqtshyf() {
		return qzqtshyf;
	}

	public void setQzqtshyf(Integer qzqtshyf) {
		this.qzqtshyf = qzqtshyf;
	}

	public Integer getXzbgyf() {
		return xzbgyf;
	}

	public void setXzbgyf(Integer xzbgyf) {
		this.xzbgyf = xzbgyf;
	}

	public Integer getQzjsbgs() {
		return qzjsbgs;
	}

	public void setQzjsbgs(Integer qzjsbgs) {
		this.qzjsbgs = qzjsbgs;
	}

	public Integer getQzwsbjs() {
		return qzwsbjs;
	}

	public void setQzwsbjs(Integer qzwsbjs) {
		this.qzwsbjs = qzwsbjs;
	}

	public Integer getQzqtxzbgyf() {
		return qzqtxzbgyf;
	}

	public void setQzqtxzbgyf(Integer qzqtxzbgyf) {
		this.qzqtxzbgyf = qzqtxzbgyf;
	}

	public Integer getQtyf() {
		return qtyf;
	}

	public void setQtyf(Integer qtyf) {
		this.qtyf = qtyf;
	}

	/**
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            要设置的 remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return createDate
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            要设置的 createDate
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return updateDate
	 */
	public String getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            要设置的 updateDate
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return delFlag
	 */
	public String getDelFlag() {
		return delFlag;
	}

	/**
	 * @param delFlag
	 *            要设置的 delFlag
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public Building() {

	}

}