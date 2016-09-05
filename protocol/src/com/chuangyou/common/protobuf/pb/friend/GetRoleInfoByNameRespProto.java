// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friend/GetRoleInfoByNameRespMsg.proto

package com.chuangyou.common.protobuf.pb.friend;

public final class GetRoleInfoByNameRespProto {
  private GetRoleInfoByNameRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetRoleInfoByNameRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetRoleInfoByNameRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .FriendInfoMsg roleInfo = 1;</code>
     *
     * <pre>
     *好友列表
     * </pre>
     */
    boolean hasRoleInfo();
    /**
     * <code>optional .FriendInfoMsg roleInfo = 1;</code>
     *
     * <pre>
     *好友列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg getRoleInfo();
    /**
     * <code>optional .FriendInfoMsg roleInfo = 1;</code>
     *
     * <pre>
     *好友列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder getRoleInfoOrBuilder();
  }
  /**
   * Protobuf type {@code GetRoleInfoByNameRespMsg}
   *
   * <pre>
   *根据用户名查询用户信息
   *返回查询结构
   * </pre>
   */
  public static final class GetRoleInfoByNameRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetRoleInfoByNameRespMsg)
      GetRoleInfoByNameRespMsgOrBuilder {
    // Use GetRoleInfoByNameRespMsg.newBuilder() to construct.
    private GetRoleInfoByNameRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetRoleInfoByNameRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetRoleInfoByNameRespMsg defaultInstance;
    public static GetRoleInfoByNameRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetRoleInfoByNameRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetRoleInfoByNameRespMsg(
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
              com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = roleInfo_.toBuilder();
              }
              roleInfo_ = input.readMessage(com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(roleInfo_);
                roleInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.internal_static_GetRoleInfoByNameRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.internal_static_GetRoleInfoByNameRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.class, com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetRoleInfoByNameRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetRoleInfoByNameRespMsg>() {
      public GetRoleInfoByNameRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetRoleInfoByNameRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetRoleInfoByNameRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ROLEINFO_FIELD_NUMBER = 1;
    private com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg roleInfo_;
    /**
     * <code>optional .FriendInfoMsg roleInfo = 1;</code>
     *
     * <pre>
     *好友列表
     * </pre>
     */
    public boolean hasRoleInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .FriendInfoMsg roleInfo = 1;</code>
     *
     * <pre>
     *好友列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg getRoleInfo() {
      return roleInfo_;
    }
    /**
     * <code>optional .FriendInfoMsg roleInfo = 1;</code>
     *
     * <pre>
     *好友列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder getRoleInfoOrBuilder() {
      return roleInfo_;
    }

    private void initFields() {
      roleInfo_ = com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasRoleInfo()) {
        if (!getRoleInfo().isInitialized()) {
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, roleInfo_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, roleInfo_);
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

    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg prototype) {
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
     * Protobuf type {@code GetRoleInfoByNameRespMsg}
     *
     * <pre>
     *根据用户名查询用户信息
     *返回查询结构
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetRoleInfoByNameRespMsg)
        com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.internal_static_GetRoleInfoByNameRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.internal_static_GetRoleInfoByNameRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.class, com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.newBuilder()
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
          getRoleInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (roleInfoBuilder_ == null) {
          roleInfo_ = com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance();
        } else {
          roleInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.internal_static_GetRoleInfoByNameRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg build() {
        com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg result = new com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (roleInfoBuilder_ == null) {
          result.roleInfo_ = roleInfo_;
        } else {
          result.roleInfo_ = roleInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg.getDefaultInstance()) return this;
        if (other.hasRoleInfo()) {
          mergeRoleInfo(other.getRoleInfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasRoleInfo()) {
          if (!getRoleInfo().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.friend.GetRoleInfoByNameRespProto.GetRoleInfoByNameRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg roleInfo_ = com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> roleInfoBuilder_;
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public boolean hasRoleInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg getRoleInfo() {
        if (roleInfoBuilder_ == null) {
          return roleInfo_;
        } else {
          return roleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public Builder setRoleInfo(com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg value) {
        if (roleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          roleInfo_ = value;
          onChanged();
        } else {
          roleInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public Builder setRoleInfo(
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder builderForValue) {
        if (roleInfoBuilder_ == null) {
          roleInfo_ = builderForValue.build();
          onChanged();
        } else {
          roleInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public Builder mergeRoleInfo(com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg value) {
        if (roleInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              roleInfo_ != com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance()) {
            roleInfo_ =
              com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.newBuilder(roleInfo_).mergeFrom(value).buildPartial();
          } else {
            roleInfo_ = value;
          }
          onChanged();
        } else {
          roleInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public Builder clearRoleInfo() {
        if (roleInfoBuilder_ == null) {
          roleInfo_ = com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.getDefaultInstance();
          onChanged();
        } else {
          roleInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder getRoleInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRoleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder getRoleInfoOrBuilder() {
        if (roleInfoBuilder_ != null) {
          return roleInfoBuilder_.getMessageOrBuilder();
        } else {
          return roleInfo_;
        }
      }
      /**
       * <code>optional .FriendInfoMsg roleInfo = 1;</code>
       *
       * <pre>
       *好友列表
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder> 
          getRoleInfoFieldBuilder() {
        if (roleInfoBuilder_ == null) {
          roleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsg.Builder, com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.FriendInfoMsgOrBuilder>(
                  getRoleInfo(),
                  getParentForChildren(),
                  isClean());
          roleInfo_ = null;
        }
        return roleInfoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:GetRoleInfoByNameRespMsg)
    }

    static {
      defaultInstance = new GetRoleInfoByNameRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetRoleInfoByNameRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRoleInfoByNameRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetRoleInfoByNameRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%friend/GetRoleInfoByNameRespMsg.proto\032" +
      "\032friend/FriendInfoMsg.proto\"<\n\030GetRoleIn" +
      "foByNameRespMsg\022 \n\010roleInfo\030\001 \001(\0132\016.Frie" +
      "ndInfoMsgBE\n\'com.chuangyou.common.protob" +
      "uf.pb.friendB\032GetRoleInfoByNameRespProto"
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
    internal_static_GetRoleInfoByNameRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetRoleInfoByNameRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetRoleInfoByNameRespMsg_descriptor,
        new java.lang.String[] { "RoleInfo", });
    com.chuangyou.common.protobuf.pb.friend.FriendInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
