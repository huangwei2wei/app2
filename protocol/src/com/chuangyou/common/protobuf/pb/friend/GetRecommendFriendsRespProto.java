// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friend/GetRecommendFriendsRespMsg.proto

package com.chuangyou.common.protobuf.pb.friend;

public final class GetRecommendFriendsRespProto {
  private GetRecommendFriendsRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetRecommendFriendsRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetRecommendFriendsRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg> 
        getRolesList();
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg getRoles(int index);
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    int getRolesCount();
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> 
        getRolesOrBuilderList();
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder getRolesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetRecommendFriendsRespMsg}
   *
   * <pre>
   *获取推荐好友
   * </pre>
   */
  public static final class GetRecommendFriendsRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetRecommendFriendsRespMsg)
      GetRecommendFriendsRespMsgOrBuilder {
    // Use GetRecommendFriendsRespMsg.newBuilder() to construct.
    private GetRecommendFriendsRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetRecommendFriendsRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetRecommendFriendsRespMsg defaultInstance;
    public static GetRecommendFriendsRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetRecommendFriendsRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetRecommendFriendsRespMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                roles_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              roles_.add(input.readMessage(com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          roles_ = java.util.Collections.unmodifiableList(roles_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.internal_static_GetRecommendFriendsRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.internal_static_GetRecommendFriendsRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.class, com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetRecommendFriendsRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetRecommendFriendsRespMsg>() {
      public GetRecommendFriendsRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetRecommendFriendsRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetRecommendFriendsRespMsg> getParserForType() {
      return PARSER;
    }

    public static final int ROLES_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg> roles_;
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg> getRolesList() {
      return roles_;
    }
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> 
        getRolesOrBuilderList() {
      return roles_;
    }
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    public int getRolesCount() {
      return roles_.size();
    }
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg getRoles(int index) {
      return roles_.get(index);
    }
    /**
     * <code>repeated .FriendInfoMsg roles = 1;</code>
     *
     * <pre>
     *用户信息列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder getRolesOrBuilder(
        int index) {
      return roles_.get(index);
    }

    private void initFields() {
      roles_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getRolesCount(); i++) {
        if (!getRoles(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < roles_.size(); i++) {
        output.writeMessage(1, roles_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < roles_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, roles_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GetRecommendFriendsRespMsg}
     *
     * <pre>
     *获取推荐好友
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetRecommendFriendsRespMsg)
        com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.internal_static_GetRecommendFriendsRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.internal_static_GetRecommendFriendsRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.class, com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRolesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (rolesBuilder_ == null) {
          roles_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          rolesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.internal_static_GetRecommendFriendsRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg build() {
        com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg result = new com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg(this);
        int from_bitField0_ = bitField0_;
        if (rolesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            roles_ = java.util.Collections.unmodifiableList(roles_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.roles_ = roles_;
        } else {
          result.roles_ = rolesBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg.getDefaultInstance()) return this;
        if (rolesBuilder_ == null) {
          if (!other.roles_.isEmpty()) {
            if (roles_.isEmpty()) {
              roles_ = other.roles_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRolesIsMutable();
              roles_.addAll(other.roles_);
            }
            onChanged();
          }
        } else {
          if (!other.roles_.isEmpty()) {
            if (rolesBuilder_.isEmpty()) {
              rolesBuilder_.dispose();
              rolesBuilder_ = null;
              roles_ = other.roles_;
              bitField0_ = (bitField0_ & ~0x00000001);
              rolesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getRolesFieldBuilder() : null;
            } else {
              rolesBuilder_.addAllMessages(other.roles_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getRolesCount(); i++) {
          if (!getRoles(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.friend.GetRecommendFriendsRespProto.GetRecommendFriendsRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg> roles_ =
        java.util.Collections.emptyList();
      private void ensureRolesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          roles_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg>(roles_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> rolesBuilder_;

      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg> getRolesList() {
        if (rolesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(roles_);
        } else {
          return rolesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public int getRolesCount() {
        if (rolesBuilder_ == null) {
          return roles_.size();
        } else {
          return rolesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg getRoles(int index) {
        if (rolesBuilder_ == null) {
          return roles_.get(index);
        } else {
          return rolesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder setRoles(
          int index, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg value) {
        if (rolesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRolesIsMutable();
          roles_.set(index, value);
          onChanged();
        } else {
          rolesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder setRoles(
          int index, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder builderForValue) {
        if (rolesBuilder_ == null) {
          ensureRolesIsMutable();
          roles_.set(index, builderForValue.build());
          onChanged();
        } else {
          rolesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder addRoles(com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg value) {
        if (rolesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRolesIsMutable();
          roles_.add(value);
          onChanged();
        } else {
          rolesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder addRoles(
          int index, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg value) {
        if (rolesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRolesIsMutable();
          roles_.add(index, value);
          onChanged();
        } else {
          rolesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder addRoles(
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder builderForValue) {
        if (rolesBuilder_ == null) {
          ensureRolesIsMutable();
          roles_.add(builderForValue.build());
          onChanged();
        } else {
          rolesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder addRoles(
          int index, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder builderForValue) {
        if (rolesBuilder_ == null) {
          ensureRolesIsMutable();
          roles_.add(index, builderForValue.build());
          onChanged();
        } else {
          rolesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder addAllRoles(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg> values) {
        if (rolesBuilder_ == null) {
          ensureRolesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, roles_);
          onChanged();
        } else {
          rolesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder clearRoles() {
        if (rolesBuilder_ == null) {
          roles_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          rolesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public Builder removeRoles(int index) {
        if (rolesBuilder_ == null) {
          ensureRolesIsMutable();
          roles_.remove(index);
          onChanged();
        } else {
          rolesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder getRolesBuilder(
          int index) {
        return getRolesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder getRolesOrBuilder(
          int index) {
        if (rolesBuilder_ == null) {
          return roles_.get(index);  } else {
          return rolesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> 
           getRolesOrBuilderList() {
        if (rolesBuilder_ != null) {
          return rolesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(roles_);
        }
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder addRolesBuilder() {
        return getRolesFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder addRolesBuilder(
          int index) {
        return getRolesFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendInfoMsg roles = 1;</code>
       *
       * <pre>
       *用户信息列表
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder> 
           getRolesBuilderList() {
        return getRolesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> 
          getRolesFieldBuilder() {
        if (rolesBuilder_ == null) {
          rolesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder>(
                  roles_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          roles_ = null;
        }
        return rolesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:GetRecommendFriendsRespMsg)
    }

    static {
      defaultInstance = new GetRecommendFriendsRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetRecommendFriendsRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRecommendFriendsRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetRecommendFriendsRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'friend/GetRecommendFriendsRespMsg.prot" +
      "o\032\032friend/FriendInfoMsg.proto\";\n\032GetReco" +
      "mmendFriendsRespMsg\022\035\n\005roles\030\001 \003(\0132\016.Fri" +
      "endInfoMsgBG\n\'com.chuangyou.common.proto" +
      "buf.pb.friendB\034GetRecommendFriendsRespPr" +
      "oto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.getDescriptor(),
        }, assigner);
    internal_static_GetRecommendFriendsRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetRecommendFriendsRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetRecommendFriendsRespMsg_descriptor,
        new java.lang.String[] { "Roles", });
    com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
