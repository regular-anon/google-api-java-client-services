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
 * Model definition for GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope.
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
public final class GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope extends com.google.api.client.json.GenericJson {

  /**
   * If `true`, include Google Cloud Platform (GCP) public datasets in the search results. Info on
   * GCP public datasets is available at https://cloud.google.com/public-datasets/. By default, GCP
   * public datasets are excluded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeGcpPublicDatasets;

  /**
   * Data Catalog tries to automatically choose the right corpus of data to search through. You can
   * ensure an organization is included by adding it to `include_org_ids`. You can ensure a
   * project's org is included with `include_project_ids`. You must specify at least one
   * organization using `include_org_ids` or `include_project_ids` in all search requests.
   *
   * List of organization IDs to search within. To find your organization ID, follow instructions in
   * https://cloud.google.com/resource-manager/docs/creating-managing-organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeOrgIds;

  /**
   * List of project IDs to search within. To learn more about the distinction between project
   * names/IDs/numbers, go to https://cloud.google.com/docs/overview/#projects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeProjectIds;

  /**
   * If `true`, include Google Cloud Platform (GCP) public datasets in the search results. Info on
   * GCP public datasets is available at https://cloud.google.com/public-datasets/. By default, GCP
   * public datasets are excluded.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeGcpPublicDatasets() {
    return includeGcpPublicDatasets;
  }

  /**
   * If `true`, include Google Cloud Platform (GCP) public datasets in the search results. Info on
   * GCP public datasets is available at https://cloud.google.com/public-datasets/. By default, GCP
   * public datasets are excluded.
   * @param includeGcpPublicDatasets includeGcpPublicDatasets or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope setIncludeGcpPublicDatasets(java.lang.Boolean includeGcpPublicDatasets) {
    this.includeGcpPublicDatasets = includeGcpPublicDatasets;
    return this;
  }

  /**
   * Data Catalog tries to automatically choose the right corpus of data to search through. You can
   * ensure an organization is included by adding it to `include_org_ids`. You can ensure a
   * project's org is included with `include_project_ids`. You must specify at least one
   * organization using `include_org_ids` or `include_project_ids` in all search requests.
   *
   * List of organization IDs to search within. To find your organization ID, follow instructions in
   * https://cloud.google.com/resource-manager/docs/creating-managing-organization.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeOrgIds() {
    return includeOrgIds;
  }

  /**
   * Data Catalog tries to automatically choose the right corpus of data to search through. You can
   * ensure an organization is included by adding it to `include_org_ids`. You can ensure a
   * project's org is included with `include_project_ids`. You must specify at least one
   * organization using `include_org_ids` or `include_project_ids` in all search requests.
   *
   * List of organization IDs to search within. To find your organization ID, follow instructions in
   * https://cloud.google.com/resource-manager/docs/creating-managing-organization.
   * @param includeOrgIds includeOrgIds or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope setIncludeOrgIds(java.util.List<java.lang.String> includeOrgIds) {
    this.includeOrgIds = includeOrgIds;
    return this;
  }

  /**
   * List of project IDs to search within. To learn more about the distinction between project
   * names/IDs/numbers, go to https://cloud.google.com/docs/overview/#projects.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeProjectIds() {
    return includeProjectIds;
  }

  /**
   * List of project IDs to search within. To learn more about the distinction between project
   * names/IDs/numbers, go to https://cloud.google.com/docs/overview/#projects.
   * @param includeProjectIds includeProjectIds or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope setIncludeProjectIds(java.util.List<java.lang.String> includeProjectIds) {
    this.includeProjectIds = includeProjectIds;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope clone() {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope) super.clone();
  }

}