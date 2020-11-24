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
 * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single call with both search
 * and histogram. Output only. The response of the GetHistogram method.
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
public final class GetHistogramResponse extends com.google.api.client.json.GenericJson {

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata metadata;

  /**
   * The Histogram results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistogramResult> results;

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public GetHistogramResponse setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The Histogram results.
   * @return value or {@code null} for none
   */
  public java.util.List<HistogramResult> getResults() {
    return results;
  }

  /**
   * The Histogram results.
   * @param results results or {@code null} for none
   */
  public GetHistogramResponse setResults(java.util.List<HistogramResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public GetHistogramResponse set(String fieldName, Object value) {
    return (GetHistogramResponse) super.set(fieldName, value);
  }

  @Override
  public GetHistogramResponse clone() {
    return (GetHistogramResponse) super.clone();
  }

}
