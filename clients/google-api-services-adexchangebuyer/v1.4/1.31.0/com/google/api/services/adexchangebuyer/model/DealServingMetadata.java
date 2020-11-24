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

package com.google.api.services.adexchangebuyer.model;

/**
 * Model definition for DealServingMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DealServingMetadata extends com.google.api.client.json.GenericJson {

  /**
   * True if alcohol ads are allowed for this deal (read-only). This field is only populated when
   * querying for finalized orders using the method GetFinalizedOrderDeals
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean alcoholAdsAllowed;

  /**
   * Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals
   * action)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DealServingMetadataDealPauseStatus dealPauseStatus;

  /**
   * True if alcohol ads are allowed for this deal (read-only). This field is only populated when
   * querying for finalized orders using the method GetFinalizedOrderDeals
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAlcoholAdsAllowed() {
    return alcoholAdsAllowed;
  }

  /**
   * True if alcohol ads are allowed for this deal (read-only). This field is only populated when
   * querying for finalized orders using the method GetFinalizedOrderDeals
   * @param alcoholAdsAllowed alcoholAdsAllowed or {@code null} for none
   */
  public DealServingMetadata setAlcoholAdsAllowed(java.lang.Boolean alcoholAdsAllowed) {
    this.alcoholAdsAllowed = alcoholAdsAllowed;
    return this;
  }

  /**
   * Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals
   * action)
   * @return value or {@code null} for none
   */
  public DealServingMetadataDealPauseStatus getDealPauseStatus() {
    return dealPauseStatus;
  }

  /**
   * Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals
   * action)
   * @param dealPauseStatus dealPauseStatus or {@code null} for none
   */
  public DealServingMetadata setDealPauseStatus(DealServingMetadataDealPauseStatus dealPauseStatus) {
    this.dealPauseStatus = dealPauseStatus;
    return this;
  }

  @Override
  public DealServingMetadata set(String fieldName, Object value) {
    return (DealServingMetadata) super.set(fieldName, value);
  }

  @Override
  public DealServingMetadata clone() {
    return (DealServingMetadata) super.clone();
  }

}
