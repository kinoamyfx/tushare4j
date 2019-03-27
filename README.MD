# TuShare4J-PRO

## tushare pro 的 java 客户端


```java

TuShareClient client = new TuShareClient(token);

StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
List<KLine> result = client.call(request);

```