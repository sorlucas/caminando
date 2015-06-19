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
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-06-19 at 19:26:33 UTC 
 * Modify at your own risk.
 */

package com.example.sergio.myapplication.backend.domain.conference.model;

/**
 * Model definition for Profile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the conference. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Profile extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> conferenceKeysToAttend;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainEmail;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String teeShirtSize;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConferenceKeysToAttend() {
    return conferenceKeysToAttend;
  }

  /**
   * @param conferenceKeysToAttend conferenceKeysToAttend or {@code null} for none
   */
  public Profile setConferenceKeysToAttend(java.util.List<java.lang.String> conferenceKeysToAttend) {
    this.conferenceKeysToAttend = conferenceKeysToAttend;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * @param displayName displayName or {@code null} for none
   */
  public Profile setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainEmail() {
    return mainEmail;
  }

  /**
   * @param mainEmail mainEmail or {@code null} for none
   */
  public Profile setMainEmail(java.lang.String mainEmail) {
    this.mainEmail = mainEmail;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTeeShirtSize() {
    return teeShirtSize;
  }

  /**
   * @param teeShirtSize teeShirtSize or {@code null} for none
   */
  public Profile setTeeShirtSize(java.lang.String teeShirtSize) {
    this.teeShirtSize = teeShirtSize;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * @param userId userId or {@code null} for none
   */
  public Profile setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public Profile set(String fieldName, Object value) {
    return (Profile) super.set(fieldName, value);
  }

  @Override
  public Profile clone() {
    return (Profile) super.clone();
  }

}
