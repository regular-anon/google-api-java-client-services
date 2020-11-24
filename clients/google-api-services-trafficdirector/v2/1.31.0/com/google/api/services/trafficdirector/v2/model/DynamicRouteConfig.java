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
 * Model definition for DynamicRouteConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DynamicRouteConfig extends com.google.api.client.json.GenericJson {

  /**
   * The timestamp when the Route was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdated;

  /**
   * The route config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> routeConfig;

  /**
   * This is the per-resource version information. This version is currently taken from the
   * :ref:`version_info ` field at the time that the route configuration was loaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionInfo;

  /**
   * The timestamp when the Route was last updated.
   * @return value or {@code null} for none
   */
  public String getLastUpdated() {
    return lastUpdated;
  }

  /**
   * The timestamp when the Route was last updated.
   * @param lastUpdated lastUpdated or {@code null} for none
   */
  public DynamicRouteConfig setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The route config.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getRouteConfig() {
    return routeConfig;
  }

  /**
   * The route config.
   * @param routeConfig routeConfig or {@code null} for none
   */
  public DynamicRouteConfig setRouteConfig(java.util.Map<String, java.lang.Object> routeConfig) {
    this.routeConfig = routeConfig;
    return this;
  }

  /**
   * This is the per-resource version information. This version is currently taken from the
   * :ref:`version_info ` field at the time that the route configuration was loaded.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionInfo() {
    return versionInfo;
  }

  /**
   * This is the per-resource version information. This version is currently taken from the
   * :ref:`version_info ` field at the time that the route configuration was loaded.
   * @param versionInfo versionInfo or {@code null} for none
   */
  public DynamicRouteConfig setVersionInfo(java.lang.String versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  @Override
  public DynamicRouteConfig set(String fieldName, Object value) {
    return (DynamicRouteConfig) super.set(fieldName, value);
  }

  @Override
  public DynamicRouteConfig clone() {
    return (DynamicRouteConfig) super.clone();
  }

}
