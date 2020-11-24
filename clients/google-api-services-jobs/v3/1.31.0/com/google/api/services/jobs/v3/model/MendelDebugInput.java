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

package com.google.api.services.jobs.v3.model;

/**
 * Message representing input to a Mendel server for debug forcing. See go/mendel-debug-forcing for
 * more details. Next ID: 2
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MendelDebugInput extends com.google.api.client.json.GenericJson {

  /**
   * When a request spans multiple servers, a MendelDebugInput may travel with the request and take
   * effect in all the servers. This field is a map of namespaces to NamespacedMendelDebugInput
   * protos. In a single server, up to two NamespacedMendelDebugInput protos are applied: 1.
   * NamespacedMendelDebugInput with the global namespace (key == ""). 2. NamespacedMendelDebugInput
   * with the server's namespace. When both NamespacedMendelDebugInput protos are present, they are
   * merged. See go/mendel-debug-forcing for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, NamespacedDebugInput> namespacedDebugInput;

  /**
   * When a request spans multiple servers, a MendelDebugInput may travel with the request and take
   * effect in all the servers. This field is a map of namespaces to NamespacedMendelDebugInput
   * protos. In a single server, up to two NamespacedMendelDebugInput protos are applied: 1.
   * NamespacedMendelDebugInput with the global namespace (key == ""). 2. NamespacedMendelDebugInput
   * with the server's namespace. When both NamespacedMendelDebugInput protos are present, they are
   * merged. See go/mendel-debug-forcing for more details.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, NamespacedDebugInput> getNamespacedDebugInput() {
    return namespacedDebugInput;
  }

  /**
   * When a request spans multiple servers, a MendelDebugInput may travel with the request and take
   * effect in all the servers. This field is a map of namespaces to NamespacedMendelDebugInput
   * protos. In a single server, up to two NamespacedMendelDebugInput protos are applied: 1.
   * NamespacedMendelDebugInput with the global namespace (key == ""). 2. NamespacedMendelDebugInput
   * with the server's namespace. When both NamespacedMendelDebugInput protos are present, they are
   * merged. See go/mendel-debug-forcing for more details.
   * @param namespacedDebugInput namespacedDebugInput or {@code null} for none
   */
  public MendelDebugInput setNamespacedDebugInput(java.util.Map<String, NamespacedDebugInput> namespacedDebugInput) {
    this.namespacedDebugInput = namespacedDebugInput;
    return this;
  }

  @Override
  public MendelDebugInput set(String fieldName, Object value) {
    return (MendelDebugInput) super.set(fieldName, value);
  }

  @Override
  public MendelDebugInput clone() {
    return (MendelDebugInput) super.clone();
  }

}
