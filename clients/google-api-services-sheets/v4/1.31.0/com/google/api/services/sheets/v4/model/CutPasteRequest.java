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
 * Moves data from the source to the destination.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CutPasteRequest extends com.google.api.client.json.GenericJson {

  /**
   * The top-left coordinate where the data should be pasted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridCoordinate destination;

  /**
   * What kind of data to paste. All the source data will be cut, regardless of what is pasted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pasteType;

  /**
   * The source data to cut.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange source;

  /**
   * The top-left coordinate where the data should be pasted.
   * @return value or {@code null} for none
   */
  public GridCoordinate getDestination() {
    return destination;
  }

  /**
   * The top-left coordinate where the data should be pasted.
   * @param destination destination or {@code null} for none
   */
  public CutPasteRequest setDestination(GridCoordinate destination) {
    this.destination = destination;
    return this;
  }

  /**
   * What kind of data to paste. All the source data will be cut, regardless of what is pasted.
   * @return value or {@code null} for none
   */
  public java.lang.String getPasteType() {
    return pasteType;
  }

  /**
   * What kind of data to paste. All the source data will be cut, regardless of what is pasted.
   * @param pasteType pasteType or {@code null} for none
   */
  public CutPasteRequest setPasteType(java.lang.String pasteType) {
    this.pasteType = pasteType;
    return this;
  }

  /**
   * The source data to cut.
   * @return value or {@code null} for none
   */
  public GridRange getSource() {
    return source;
  }

  /**
   * The source data to cut.
   * @param source source or {@code null} for none
   */
  public CutPasteRequest setSource(GridRange source) {
    this.source = source;
    return this;
  }

  @Override
  public CutPasteRequest set(String fieldName, Object value) {
    return (CutPasteRequest) super.set(fieldName, value);
  }

  @Override
  public CutPasteRequest clone() {
    return (CutPasteRequest) super.clone();
  }

}
