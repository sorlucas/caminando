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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-06-30 18:20:40 UTC)
 * on 2015-07-16 at 19:28:16 UTC 
 * Modify at your own risk.
 */

package com.example.sergio.myapplication.backend.domain.conference.model;

/**
 * Model definition for ConferenceQueryForm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the conference. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConferenceQueryForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Filter> filters;

  static {
    // hack to force ProGuard to consider Filter used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(Filter.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Filter> getFilters() {
    return filters;
  }

  /**
   * @param filters filters or {@code null} for none
   */
  public ConferenceQueryForm setFilters(java.util.List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  @Override
  public ConferenceQueryForm set(String fieldName, Object value) {
    return (ConferenceQueryForm) super.set(fieldName, value);
  }

  @Override
  public ConferenceQueryForm clone() {
    return (ConferenceQueryForm) super.clone();
  }

}
