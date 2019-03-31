package com.github.kinoamyfx.tushare4j.rate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ShiborQuote {
    /**
     * 日期
     */
    private String date;
    /**
     * 报价银行
     */
    private String bank;
    /**
     * 隔夜_Bid
     */
    private Float on_b;
    /**
     * 隔夜_Ask
     */
    private Float on_a;
    /**
     * 1周_Bid
     */

    @JsonProperty("1w_b")
    private Float _1w_b;
    /**
     * 1周_Ask
     */
    @JsonProperty("1w_a")
    private Float _1w_a;
    /**
     * 2周_Bid
     */
    @JsonProperty("2w_b")
    private Float _2w_b;
    /**
     * 2周_Ask
     */
    @JsonProperty("2w_a")
    private Float _2w_a;
    /**
     * 1月_Bid
     */
    @JsonProperty("1m_b")
    private Float _1m_b;
    /**
     * 1月_Ask
     */
    @JsonProperty("1m_a")
    private Float _1m_a;
    /**
     * 3月_Bid
     */
    @JsonProperty("3m_b")
    private Float _3m_b;
    /**
     * 3月_Ask
     */
    @JsonProperty("3m_a")
    private Float _3m_a;
    /**
     * 6月_Bid
     */
    @JsonProperty("6m_b")
    private Float _6m_b;
    /**
     * 6月_Ask
     */
    @JsonProperty("6m_a")
    private Float _6m_a;
    /**
     * 9月_Bid
     */
    @JsonProperty("9m_b")
    private Float _9m_b;
    /**
     * 9月_Ask
     */
    @JsonProperty("9m_a")
    private Float _9m_a;
    /**
     * 1年_Bid
     */
    @JsonProperty("1y_b")
    private Float _1y_b;
    /**
     * 1年_Ask
     */
    @JsonProperty("1y_a")
    private Float _1y_a;
}
