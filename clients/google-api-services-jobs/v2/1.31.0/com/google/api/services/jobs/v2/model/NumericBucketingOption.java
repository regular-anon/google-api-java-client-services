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

package com.google.api.services.jobs.v2.model;

/**
 * Input only. Use this field to specify bucketing option for the histogram search response.
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
public final class NumericBucketingOption extends com.google.api.client.json.GenericJson {

  /**
   * Required. Two adjacent values form a histogram bucket. Values should be in ascending order. For
   * example, if [5, 10, 15] are provided, four buckets are created: (-inf, 5), 5, 10), [10, 15),
   * [15, inf). At most 20 [buckets_bound is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> bucketBounds;

  /**
   * Optional. If set to true, the histogram result includes minimum/maximum value of the numeric
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requiresMinMax;

  /**
   * Required. Two adjacent values form a histogram bucket. Values should be in ascending order. For
   * example, if [5, 10, 15] are provided, four buckets are created: (-inf, 5), 5, 10), [10, 15),
   * [15, inf). At most 20 [buckets_bound is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getBucketBounds() {
    return bucketBounds;
  }

  /**
   * Required. Two adjacent values form a histogram bucket. Values should be in ascending order. For
   * example, if [5, 10, 15] are provided, four buckets are created: (-inf, 5), 5, 10), [10, 15),
   * [15, inf). At most 20 [buckets_bound is supported.
   * @param bucketBounds bucketBounds or {@code null} for none
   */
  public NumericBucketingOption setBucketBounds(java.util.List<java.lang.Double> bucketBounds) {
    this.bucketBounds = bucketBounds;
    return this;
  }

  /**
   * Optional. If set to true, the histogram result includes minimum/maximum value of the numeric
   * field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequiresMinMax() {
    return requiresMinMax;
  }

  /**
   * Optional. If set to true, the histogram result includes minimum/maximum value of the numeric
   * field.
   * @param requiresMinMax requiresMinMax or {@code null} for none
   */
  public NumericBucketingOption setRequiresMinMax(java.lang.Boolean requiresMinMax) {
    this.requiresMinMax = requiresMinMax;
    return this;
  }

  @Override
  public NumericBucketingOption set(String fieldName, Object value) {
    return (NumericBucketingOption) super.set(fieldName, value);
  }

  @Override
  public NumericBucketingOption clone() {
    return (NumericBucketingOption) super.clone();
  }

}
