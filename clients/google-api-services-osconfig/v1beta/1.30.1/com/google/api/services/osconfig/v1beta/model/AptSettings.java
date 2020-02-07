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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Apt patching is completed by executing `apt-get update && apt-get upgrade`. Additional options
 * can be set to control how this is executed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AptSettings extends com.google.api.client.json.GenericJson {

  /**
   * List of packages to exclude from update. These packages will be excluded
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludes;

  /**
   * An exclusive list of packages to be updated. These are the only packages that will be updated.
   * If these packages are not installed, they will be ignored. This field cannot be specified with
   * any other patch configuration fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exclusivePackages;

  /**
   * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * List of packages to exclude from update. These packages will be excluded
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludes() {
    return excludes;
  }

  /**
   * List of packages to exclude from update. These packages will be excluded
   * @param excludes excludes or {@code null} for none
   */
  public AptSettings setExcludes(java.util.List<java.lang.String> excludes) {
    this.excludes = excludes;
    return this;
  }

  /**
   * An exclusive list of packages to be updated. These are the only packages that will be updated.
   * If these packages are not installed, they will be ignored. This field cannot be specified with
   * any other patch configuration fields.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExclusivePackages() {
    return exclusivePackages;
  }

  /**
   * An exclusive list of packages to be updated. These are the only packages that will be updated.
   * If these packages are not installed, they will be ignored. This field cannot be specified with
   * any other patch configuration fields.
   * @param exclusivePackages exclusivePackages or {@code null} for none
   */
  public AptSettings setExclusivePackages(java.util.List<java.lang.String> exclusivePackages) {
    this.exclusivePackages = exclusivePackages;
    return this;
  }

  /**
   * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
   * @param type type or {@code null} for none
   */
  public AptSettings setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AptSettings set(String fieldName, Object value) {
    return (AptSettings) super.set(fieldName, value);
  }

  @Override
  public AptSettings clone() {
    return (AptSettings) super.clone();
  }

}