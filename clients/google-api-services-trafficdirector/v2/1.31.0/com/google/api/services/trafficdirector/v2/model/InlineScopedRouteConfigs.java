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

package com.google.api.services.trafficdirector.v2.model;

/**
 * Model definition for InlineScopedRouteConfigs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InlineScopedRouteConfigs extends com.google.api.client.json.GenericJson {

  /**
   * The timestamp when the scoped route config set was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdated;

  /**
   * The name assigned to the scoped route configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The scoped route configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.Map<String, java.lang.Object>> scopedRouteConfigs;

  /**
   * The timestamp when the scoped route config set was last updated.
   * @return value or {@code null} for none
   */
  public String getLastUpdated() {
    return lastUpdated;
  }

  /**
   * The timestamp when the scoped route config set was last updated.
   * @param lastUpdated lastUpdated or {@code null} for none
   */
  public InlineScopedRouteConfigs setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The name assigned to the scoped route configurations.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name assigned to the scoped route configurations.
   * @param name name or {@code null} for none
   */
  public InlineScopedRouteConfigs setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The scoped route configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.Map<String, java.lang.Object>> getScopedRouteConfigs() {
    return scopedRouteConfigs;
  }

  /**
   * The scoped route configurations.
   * @param scopedRouteConfigs scopedRouteConfigs or {@code null} for none
   */
  public InlineScopedRouteConfigs setScopedRouteConfigs(java.util.List<java.util.Map<String, java.lang.Object>> scopedRouteConfigs) {
    this.scopedRouteConfigs = scopedRouteConfigs;
    return this;
  }

  @Override
  public InlineScopedRouteConfigs set(String fieldName, Object value) {
    return (InlineScopedRouteConfigs) super.set(fieldName, value);
  }

  @Override
  public InlineScopedRouteConfigs clone() {
    return (InlineScopedRouteConfigs) super.clone();
  }

}
