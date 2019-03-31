package com.github.kinoamyfx.tushare4j.fund;

import lombok.Data;

@Data
public class FundCompany {
    /**
     * 基金公司名称
     */
    private String name;
    /**
     * 简称
     */
    private String shortname;
    /**
     * 英文缩写
     */
    private String short_enname;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 注册地址
     */
    private String address;
    /**
     * 电话
     */
    private String phone;
    /**
     * 办公地址
     */
    private String office;
    /**
     * 公司网址
     */
    private String website;
    /**
     * 法人代表
     */
    private String chairman;
    /**
     * 总经理
     */
    private String manager;
    /**
     * 注册资本
     */
    private Float reg_capital;
    /**
     * 成立日期
     */
    private String setup_date;
    /**
     * 公司终止日期
     */
    private String end_date;
    /**
     * 员工总数
     */
    private Float employees;
    /**
     * 主要产品及业务
     */
    private String main_business;
    /**
     * 组织机构代码
     */
    private String org_code;
    /**
     * 统一社会信用代码
     */
    private String credit_code;
}
