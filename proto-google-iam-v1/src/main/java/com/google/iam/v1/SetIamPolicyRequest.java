/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/iam_policy.proto

package com.google.iam.v1;

/**
 *
 *
 * <pre>
 * Request message for `SetIamPolicy` method.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.SetIamPolicyRequest}
 */
public final class SetIamPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.SetIamPolicyRequest)
    SetIamPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetIamPolicyRequest.newBuilder() to construct.
  private SetIamPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetIamPolicyRequest() {
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetIamPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SetIamPolicyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resource_ = s;
              break;
            }
          case 18:
            {
              com.google.iam.v1.Policy.Builder subBuilder = null;
              if (policy_ != null) {
                subBuilder = policy_.toBuilder();
              }
              policy_ = input.readMessage(com.google.iam.v1.Policy.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(policy_);
                policy_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.v1.IamPolicyProto
        .internal_static_google_iam_v1_SetIamPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v1.IamPolicyProto
        .internal_static_google_iam_v1_SetIamPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v1.SetIamPolicyRequest.class,
            com.google.iam.v1.SetIamPolicyRequest.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resource_;
  /**
   *
   *
   * <pre>
   * REQUIRED: The resource for which the policy is being specified.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The resource.
   */
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * REQUIRED: The resource for which the policy is being specified.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for resource.
   */
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_FIELD_NUMBER = 2;
  private com.google.iam.v1.Policy policy_;
  /**
   *
   *
   * <pre>
   * REQUIRED: The complete policy to be applied to the `resource`. The size of
   * the policy is limited to a few 10s of KB. An empty policy is a
   * valid policy but certain Cloud Platform services (such as Projects)
   * might reject them.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the policy field is set.
   */
  public boolean hasPolicy() {
    return policy_ != null;
  }
  /**
   *
   *
   * <pre>
   * REQUIRED: The complete policy to be applied to the `resource`. The size of
   * the policy is limited to a few 10s of KB. An empty policy is a
   * valid policy but certain Cloud Platform services (such as Projects)
   * might reject them.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The policy.
   */
  public com.google.iam.v1.Policy getPolicy() {
    return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
  }
  /**
   *
   *
   * <pre>
   * REQUIRED: The complete policy to be applied to the `resource`. The size of
   * the policy is limited to a few 10s of KB. An empty policy is a
   * valid policy but certain Cloud Platform services (such as Projects)
   * might reject them.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder() {
    return getPolicy();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    if (policy_ != null) {
      output.writeMessage(2, getPolicy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    if (policy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPolicy());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.iam.v1.SetIamPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.iam.v1.SetIamPolicyRequest other = (com.google.iam.v1.SetIamPolicyRequest) obj;

    if (!getResource().equals(other.getResource())) return false;
    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v1.SetIamPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.iam.v1.SetIamPolicyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for `SetIamPolicy` method.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.SetIamPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.SetIamPolicyRequest)
      com.google.iam.v1.SetIamPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.v1.IamPolicyProto
          .internal_static_google_iam_v1_SetIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v1.IamPolicyProto
          .internal_static_google_iam_v1_SetIamPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v1.SetIamPolicyRequest.class,
              com.google.iam.v1.SetIamPolicyRequest.Builder.class);
    }

    // Construct using com.google.iam.v1.SetIamPolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      resource_ = "";

      if (policyBuilder_ == null) {
        policy_ = null;
      } else {
        policy_ = null;
        policyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.v1.IamPolicyProto
          .internal_static_google_iam_v1_SetIamPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v1.SetIamPolicyRequest getDefaultInstanceForType() {
      return com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v1.SetIamPolicyRequest build() {
      com.google.iam.v1.SetIamPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v1.SetIamPolicyRequest buildPartial() {
      com.google.iam.v1.SetIamPolicyRequest result =
          new com.google.iam.v1.SetIamPolicyRequest(this);
      result.resource_ = resource_;
      if (policyBuilder_ == null) {
        result.policy_ = policy_;
      } else {
        result.policy_ = policyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.v1.SetIamPolicyRequest) {
        return mergeFrom((com.google.iam.v1.SetIamPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v1.SetIamPolicyRequest other) {
      if (other == com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.iam.v1.SetIamPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.v1.SetIamPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being specified.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being specified.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being specified.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being specified.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {

      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The resource for which the policy is being specified.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>
     * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resource_ = value;
      onChanged();
      return this;
    }

    private com.google.iam.v1.Policy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy,
            com.google.iam.v1.Policy.Builder,
            com.google.iam.v1.PolicyOrBuilder>
        policyBuilder_;
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return policyBuilder_ != null || policy_ != null;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The policy.
     */
    public com.google.iam.v1.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.iam.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
        onChanged();
      } else {
        policyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.iam.v1.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
        onChanged();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePolicy(com.google.iam.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (policy_ != null) {
          policy_ = com.google.iam.v1.Policy.newBuilder(policy_).mergeFrom(value).buildPartial();
        } else {
          policy_ = value;
        }
        onChanged();
      } else {
        policyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPolicy() {
      if (policyBuilder_ == null) {
        policy_ = null;
        onChanged();
      } else {
        policy_ = null;
        policyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.iam.v1.Policy.Builder getPolicyBuilder() {

      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ? com.google.iam.v1.Policy.getDefaultInstance() : policy_;
      }
    }
    /**
     *
     *
     * <pre>
     * REQUIRED: The complete policy to be applied to the `resource`. The size of
     * the policy is limited to a few 10s of KB. An empty policy is a
     * valid policy but certain Cloud Platform services (such as Projects)
     * might reject them.
     * </pre>
     *
     * <code>.google.iam.v1.Policy policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.v1.Policy,
            com.google.iam.v1.Policy.Builder,
            com.google.iam.v1.PolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.v1.Policy,
                com.google.iam.v1.Policy.Builder,
                com.google.iam.v1.PolicyOrBuilder>(getPolicy(), getParentForChildren(), isClean());
        policy_ = null;
      }
      return policyBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.iam.v1.SetIamPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.SetIamPolicyRequest)
  private static final com.google.iam.v1.SetIamPolicyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.v1.SetIamPolicyRequest();
  }

  public static com.google.iam.v1.SetIamPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetIamPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<SetIamPolicyRequest>() {
        @java.lang.Override
        public SetIamPolicyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SetIamPolicyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SetIamPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetIamPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v1.SetIamPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
