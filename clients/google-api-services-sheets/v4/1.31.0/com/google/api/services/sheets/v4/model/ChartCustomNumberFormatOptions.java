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

package com.google.api.services.sheets.v4.model;

/**
 * Custom number formatting options for chart attributes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChartCustomNumberFormatOptions extends com.google.api.client.json.GenericJson {

  /**
   * Custom prefix to be prepended to the chart attribute. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prefix;

  /**
   * Custom suffix to be appended to the chart attribute. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suffix;

  /**
   * Custom prefix to be prepended to the chart attribute. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrefix() {
    return prefix;
  }

  /**
   * Custom prefix to be prepended to the chart attribute. This field is optional.
   * @param prefix prefix or {@code null} for none
   */
  public ChartCustomNumberFormatOptions setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Custom suffix to be appended to the chart attribute. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuffix() {
    return suffix;
  }

  /**
   * Custom suffix to be appended to the chart attribute. This field is optional.
   * @param suffix suffix or {@code null} for none
   */
  public ChartCustomNumberFormatOptions setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
    return this;
  }

  @Override
  public ChartCustomNumberFormatOptions set(String fieldName, Object value) {
    return (ChartCustomNumberFormatOptions) super.set(fieldName, value);
  }

  @Override
  public ChartCustomNumberFormatOptions clone() {
    return (ChartCustomNumberFormatOptions) super.clone();
  }

}
