
tushare4j-pro  -  A TuShare Java Client

- 相关参考: https://tushare.pro
- HTTP API: https://tushare.pro/document/1?doc_id=130

### 依赖引入
```xml
```

### 基本用法
```java

    //使用token初始化client
    TuShareClient client = new TuShareClient(token);

    //构造请求体
    StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");

    //执行请求,得到返回结果
    List<KLine> result = client.call(request);

```
