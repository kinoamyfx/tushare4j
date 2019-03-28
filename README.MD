TuShare4J-PRO     -     A TuShare Java Client

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/47149da913294140a3e364c861ef823d)](https://app.codacy.com/app/KinoamyFx/tushare4j-pro?utm_source=github.com&utm_medium=referral&utm_content=KinoamyFx/tushare4j-pro&utm_campaign=Badge_Grade_Dashboard)
[![codecov](https://codecov.io/gh/KinoamyFx/tushare4j-pro/branch/master/graph/badge.svg)](https://codecov.io/gh/KinoamyFx/tushare4j-pro)
[![Build Status](https://www.travis-ci.org/KinoamyFx/tushare4j-pro.svg?branch=master)](https://www.travis-ci.org/KinoamyFx/tushare4j-pro)

# 相关项目
- TuShare Http Api: https://tushare.pro/document/1?doc_id=130

### 依赖引入
```xml
```

### 使用方法

#### 直接同步调用
```java
    //使用token初始化client
    TuShareClient client = new TuShareClient(token);
    
    //构造请求体
    StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
    
    //执行请求,得到返回结果
    //默认返回全字段
    List<KLine> result = client.call(request);
    
```

#### 字段选择和字段过滤
```java
    //使用token初始化client
    TuShareClient client = new TuShareClient(token);
    
    //构造请求体
    StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
    
    
    //使用Includer选择希望返回的字段
    FieldIncluder[]  includers = FieldFilter.include("ts_code", "open");
    List<KLine> result = client.call(request,includers);
    
    //使用Excluder排除掉不希望返回的字段
    FieldExcluder[] excluders = FieldFilter.exclude("trade_date", "pre_close");
    List<KLine> result = client.call(request,excluders);
       
```


#### 异步调用
```java
    
    TuShareClient client = new TuShareClient(token);
    
    StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
    
    //使用异步请求
    CompletionStage<List<KLine>> stage = client.asyncCall(request);
    
    //使用Java8 原生处理
    stage.whenComplete((kLines, throwable) -> {
        //do something
    });
    
    //也可以接入RxJava
    Flowable.fromFuture(stage.toCompletableFuture())
                    .flatMap(Flowable::fromIterable)
                    .forEach(kLine -> {
                        //do something
                    });
```

### 计划特性

- 增加K线复权计算
- 增加K线指标计算
- 增加接口自动限流
- 增加单次请求数量过大后自动拆分成多次请求

- 提供Spring集成支持
- 提供本地缓存