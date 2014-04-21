// Copyright 2014 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.impala.extdatasource.sample;

import java.util.List;

import com.cloudera.impala.extdatasource.thrift.TCloseParams;
import com.cloudera.impala.extdatasource.thrift.TCloseResult;
import com.cloudera.impala.extdatasource.thrift.TGetNextParams;
import com.cloudera.impala.extdatasource.thrift.TGetNextResult;
import com.cloudera.impala.extdatasource.thrift.TGetStatsParams;
import com.cloudera.impala.extdatasource.thrift.TGetStatsResult;
import com.cloudera.impala.extdatasource.thrift.TOpenParams;
import com.cloudera.impala.extdatasource.thrift.TOpenResult;
import com.cloudera.impala.extdatasource.thrift.TRow;
import com.cloudera.impala.extdatasource.thrift.TRowBatch;
import com.cloudera.impala.extdatasource.v1.ExternalDataSource;
import com.cloudera.impala.thrift.TColumnValue;
import com.cloudera.impala.thrift.TStatus;
import com.cloudera.impala.thrift.TStatusCode;
import com.google.common.collect.Lists;

/**
 * Sample data source that always returns a single column containing the initString.
 */
public class EchoDataSource implements ExternalDataSource {
  private static final TStatus STATUS_OK =
      new TStatus(TStatusCode.OK, Lists.<String>newArrayList());

  private String initString_;

  @Override
  public TGetStatsResult getStats(TGetStatsParams params) {
    List<Integer> acceptedPredicates = Lists.<Integer>newArrayList();
    return new TGetStatsResult(STATUS_OK, acceptedPredicates).setNum_rows_estimate(1);
  }

  @Override
  public TOpenResult open(TOpenParams params) {
    initString_ = params.getInit_string();
    return new TOpenResult(STATUS_OK).setScan_handle("dummy-handle");
  }

  @Override
  public TGetNextResult getNext(TGetNextParams params) {
    boolean eos = true;
    TGetNextResult result = new TGetNextResult(STATUS_OK, eos);
    TRowBatch rowBatch = new TRowBatch();
    TRow row = new TRow();
    row.addToCol_vals(new TColumnValue().setStringVal(initString_));
    rowBatch.addToRows(row);
    result.setRows(rowBatch);
    return result;
  }

  @Override
  public TCloseResult close(TCloseParams params) {
    return new TCloseResult(STATUS_OK);
  }
}