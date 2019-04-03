package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FilmRecordRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        FilmRecordRequest request = new FilmRecordRequest();
        request.ann_date(null);
        request.start_date(TsDate.parse("20180101"));
        request.end_date(TsDate.parse("20190401"));

        Assert.assertNull(request.ann_date());
        Assert.assertEquals(TsDate.parse("20180101"), request.start_date());
        Assert.assertEquals(TsDate.parse("20190401"), request.end_date());

        CodeUtils.assertDataMethod(request);

        List<FilmRecord> call = TuShareClientTest.client.call(request);
        CodeUtils.assertFields(call, Collections.singletonList("rec_result"));
    }
}