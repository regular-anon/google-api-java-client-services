/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.jobs.v3.model;

/**
 * Represents count of jobs within one bucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BucketizedCount extends com.google.api.client.json.GenericJson {

  /**
   * Number of jobs whose numeric field value fall into `range`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer count;

  /**
   * Bucket range on which histogram was performed for the numeric field, that is, the count
   * represents number of jobs in this range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketRange range;

  /**
   * Number of jobs whose numeric field value fall into `range`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * Number of jobs whose numeric field value fall into `range`.
   * @param count count or {@code null} for none
   */
  public BucketizedCount setCount(java.lang.Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Bucket range on which histogram was performed for the numeric field, that is, the count
   * represents number of jobs in this range.
   * @return value or {@code null} for none
   */
  public BucketRange getRange() {
    return range;
  }

  /**
   * Bucket range on which histogram was performed for the numeric field, that is, the count
   * represents number of jobs in this range.
   * @param range range or {@code null} for none
   */
  public BucketizedCount setRange(BucketRange range) {
    this.range = range;
    return this;
  }

  @Override
  public BucketizedCount set(String fieldName, Object value) {
    return (BucketizedCount) super.set(fieldName, value);
  }

  @Override
  public BucketizedCount clone() {
    return (BucketizedCount) super.clone();
  }

}
