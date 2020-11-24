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

package com.google.api.services.sourcerepo.v1.model;

/**
 * Configuration to automatically mirror a repository from another hosting service, for example
 * GitHub or Bitbucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Source Repositories API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MirrorConfig extends com.google.api.client.json.GenericJson {

  /**
   * ID of the SSH deploy key at the other hosting service. Removing this key from the other service
   * would deauthorize Google Cloud Source Repositories from mirroring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deployKeyId;

  /**
   * URL of the main repository at the other hosting service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the
   * other hosting service will stop Google Cloud Source Repositories from receiving notifications,
   * and thereby disabling mirroring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webhookId;

  /**
   * ID of the SSH deploy key at the other hosting service. Removing this key from the other service
   * would deauthorize Google Cloud Source Repositories from mirroring.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeployKeyId() {
    return deployKeyId;
  }

  /**
   * ID of the SSH deploy key at the other hosting service. Removing this key from the other service
   * would deauthorize Google Cloud Source Repositories from mirroring.
   * @param deployKeyId deployKeyId or {@code null} for none
   */
  public MirrorConfig setDeployKeyId(java.lang.String deployKeyId) {
    this.deployKeyId = deployKeyId;
    return this;
  }

  /**
   * URL of the main repository at the other hosting service.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL of the main repository at the other hosting service.
   * @param url url or {@code null} for none
   */
  public MirrorConfig setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the
   * other hosting service will stop Google Cloud Source Repositories from receiving notifications,
   * and thereby disabling mirroring.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebhookId() {
    return webhookId;
  }

  /**
   * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the
   * other hosting service will stop Google Cloud Source Repositories from receiving notifications,
   * and thereby disabling mirroring.
   * @param webhookId webhookId or {@code null} for none
   */
  public MirrorConfig setWebhookId(java.lang.String webhookId) {
    this.webhookId = webhookId;
    return this;
  }

  @Override
  public MirrorConfig set(String fieldName, Object value) {
    return (MirrorConfig) super.set(fieldName, value);
  }

  @Override
  public MirrorConfig clone() {
    return (MirrorConfig) super.clone();
  }

}
