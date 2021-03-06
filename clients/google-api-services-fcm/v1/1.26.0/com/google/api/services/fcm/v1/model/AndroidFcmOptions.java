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

package com.google.api.services.fcm.v1.model;

/**
 * Options for features provided by the FCM SDK for Android.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidFcmOptions extends com.google.api.client.json.GenericJson {

  /**
   * Label that the message's analytics data will be associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analyticsLabel;

  /**
   * Label that the message's analytics data will be associated with.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalyticsLabel() {
    return analyticsLabel;
  }

  /**
   * Label that the message's analytics data will be associated with.
   * @param analyticsLabel analyticsLabel or {@code null} for none
   */
  public AndroidFcmOptions setAnalyticsLabel(java.lang.String analyticsLabel) {
    this.analyticsLabel = analyticsLabel;
    return this;
  }

  @Override
  public AndroidFcmOptions set(String fieldName, Object value) {
    return (AndroidFcmOptions) super.set(fieldName, value);
  }

  @Override
  public AndroidFcmOptions clone() {
    return (AndroidFcmOptions) super.clone();
  }

}
