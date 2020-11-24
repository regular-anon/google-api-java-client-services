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
 * Trims the whitespace (such as spaces, tabs, or new lines) in every cell in the specified range.
 * This request removes all whitespace from the start and end of each cell's text, and reduces any
 * subsequence of remaining whitespace characters to a single space. If the resulting trimmed text
 * starts with a '+' or '=' character, the text remains as a string value and isn't interpreted as a
 * formula.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrimWhitespaceRequest extends com.google.api.client.json.GenericJson {

  /**
   * The range whose cells to trim.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * The range whose cells to trim.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range whose cells to trim.
   * @param range range or {@code null} for none
   */
  public TrimWhitespaceRequest setRange(GridRange range) {
    this.range = range;
    return this;
  }

  @Override
  public TrimWhitespaceRequest set(String fieldName, Object value) {
    return (TrimWhitespaceRequest) super.set(fieldName, value);
  }

  @Override
  public TrimWhitespaceRequest clone() {
    return (TrimWhitespaceRequest) super.clone();
  }

}
