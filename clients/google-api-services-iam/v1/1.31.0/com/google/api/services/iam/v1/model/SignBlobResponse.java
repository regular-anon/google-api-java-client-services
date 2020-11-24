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

package com.google.api.services.iam.v1.model;

/**
 * Deprecated. [Migrate to Service Account Credentials
 * API](https://cloud.google.com/iam/help/credentials/migrate-api). The service account sign blob
 * response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SignBlobResponse extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The id of the key used to sign
   * the blob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyId;

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed blob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signature;

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The id of the key used to sign
   * the blob.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyId() {
    return keyId;
  }

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The id of the key used to sign
   * the blob.
   * @param keyId keyId or {@code null} for none
   */
  public SignBlobResponse setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed blob.
   * @see #decodeSignature()
   * @return value or {@code null} for none
   */
  public java.lang.String getSignature() {
    return signature;
  }

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed blob.
   * @see #getSignature()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSignature() {
    return com.google.api.client.util.Base64.decodeBase64(signature);
  }

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed blob.
   * @see #encodeSignature()
   * @param signature signature or {@code null} for none
   */
  public SignBlobResponse setSignature(java.lang.String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed blob.
   * @see #setSignature()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SignBlobResponse encodeSignature(byte[] signature) {
    this.signature = com.google.api.client.util.Base64.encodeBase64URLSafeString(signature);
    return this;
  }

  @Override
  public SignBlobResponse set(String fieldName, Object value) {
    return (SignBlobResponse) super.set(fieldName, value);
  }

  @Override
  public SignBlobResponse clone() {
    return (SignBlobResponse) super.clone();
  }

}
