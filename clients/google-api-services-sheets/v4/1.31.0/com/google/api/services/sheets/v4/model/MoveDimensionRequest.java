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
 * Moves one or more rows or columns.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MoveDimensionRequest extends com.google.api.client.json.GenericJson {

  /**
   * The zero-based start index of where to move the source data to, based on the coordinates
   * *before* the source data is removed from the grid. Existing data will be shifted down or right
   * (depending on the dimension) to make room for the moved dimensions. The source dimensions are
   * removed from the grid, so the the data may end up in a different index than specified. For
   * example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to move `"1"` and `"2"` to between `"3"`
   * and `"4"`, the source would be `ROWS [1..3)`,and the destination index would be `"4"` (the
   * zero-based index of row 5). The end result would be `A1..A5` of `0, 3, 1, 2, 4`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer destinationIndex;

  /**
   * The source dimensions to move.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionRange source;

  /**
   * The zero-based start index of where to move the source data to, based on the coordinates
   * *before* the source data is removed from the grid. Existing data will be shifted down or right
   * (depending on the dimension) to make room for the moved dimensions. The source dimensions are
   * removed from the grid, so the the data may end up in a different index than specified. For
   * example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to move `"1"` and `"2"` to between `"3"`
   * and `"4"`, the source would be `ROWS [1..3)`,and the destination index would be `"4"` (the
   * zero-based index of row 5). The end result would be `A1..A5` of `0, 3, 1, 2, 4`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDestinationIndex() {
    return destinationIndex;
  }

  /**
   * The zero-based start index of where to move the source data to, based on the coordinates
   * *before* the source data is removed from the grid. Existing data will be shifted down or right
   * (depending on the dimension) to make room for the moved dimensions. The source dimensions are
   * removed from the grid, so the the data may end up in a different index than specified. For
   * example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to move `"1"` and `"2"` to between `"3"`
   * and `"4"`, the source would be `ROWS [1..3)`,and the destination index would be `"4"` (the
   * zero-based index of row 5). The end result would be `A1..A5` of `0, 3, 1, 2, 4`.
   * @param destinationIndex destinationIndex or {@code null} for none
   */
  public MoveDimensionRequest setDestinationIndex(java.lang.Integer destinationIndex) {
    this.destinationIndex = destinationIndex;
    return this;
  }

  /**
   * The source dimensions to move.
   * @return value or {@code null} for none
   */
  public DimensionRange getSource() {
    return source;
  }

  /**
   * The source dimensions to move.
   * @param source source or {@code null} for none
   */
  public MoveDimensionRequest setSource(DimensionRange source) {
    this.source = source;
    return this;
  }

  @Override
  public MoveDimensionRequest set(String fieldName, Object value) {
    return (MoveDimensionRequest) super.set(fieldName, value);
  }

  @Override
  public MoveDimensionRequest clone() {
    return (MoveDimensionRequest) super.clone();
  }

}
