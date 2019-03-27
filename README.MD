Tushare Pro Java SDK

1. 相关参考: https://tushare.pro
1. HTTP API: https://tushare.pro/document/1?doc_id=130


    ```java

    TuShareClient client = new TuShareClient(token);

    StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
    List<KLine> result = client.call(request);

    ```