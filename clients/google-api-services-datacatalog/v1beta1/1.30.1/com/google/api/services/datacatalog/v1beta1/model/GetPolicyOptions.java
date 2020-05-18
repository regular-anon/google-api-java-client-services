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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Encapsulates settings provided to GetIamPolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetPolicyOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The policy format version to be returned.
   *
   * Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.
   *
   * Requests for policies with any conditional bindings must specify version 3. Policies without
   * any conditional bindings may specify any valid value or leave the field unset.
   *
   * To learn which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer requestedPolicyVersion;

  /**
   * Optional. The policy format version to be returned.
   *
   * Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.
   *
   * Requests for policies with any conditional bindings must specify version 3. Policies without
   * any conditional bindings may specify any valid value or leave the field unset.
   *
   * To learn which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRequestedPolicyVersion() {
    return requestedPolicyVersion;
  }

  /**
   * Optional. The policy format version to be returned.
   *
   * Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.
   *
   * Requests for policies with any conditional bindings must specify version 3. Policies without
   * any conditional bindings may specify any valid value or leave the field unset.
   *
   * To learn which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @param requestedPolicyVersion requestedPolicyVersion or {@code null} for none
   */
  public GetPolicyOptions setRequestedPolicyVersion(java.lang.Integer requestedPolicyVersion) {
    this.requestedPolicyVersion = requestedPolicyVersion;
    return this;
  }

  @Override
  public GetPolicyOptions set(String fieldName, Object value) {
    return (GetPolicyOptions) super.set(fieldName, value);
  }

  @Override
  public GetPolicyOptions clone() {
    return (GetPolicyOptions) super.clone();
  }

}
