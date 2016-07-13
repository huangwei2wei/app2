// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friend/DelFriendRespMsg.proto

package com.chuangyou.common.protobuf.pb.friend;

public final class DelFriendRespProto {
  private DelFriendRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DelFriendRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DelFriendRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 friendRoleId = 1;</code>
     *
     * <pre>
     *用户ID
     * </pre>
     */
    boolean hasFriendRoleId();
    /**
     * <code>required int64 friendRoleId = 1;</code>
     *
     * <pre>
     *用户ID
     * </pre>
     */
    long getFriendRoleId();
  }
  /**
   * Protobuf type {@code DelFriendRespMsg}
   *
   * <pre>
   *删除指定ID的好友
   * </pre>
   */
  public static final class DelFriendRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DelFriendRespMsg)
      DelFriendRespMsgOrBuilder {
    // Use DelFriendRespMsg.newBuilder() to construct.
    private DelFriendRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DelFriendRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DelFriendRespMsg defaultInstance;
    public static DelFriendRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public DelFriendRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DelFriendRespMsg(
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
            case 8: {
              bitField0_ |= 0x00000001;
              friendRoleId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.internal_static_DelFriendRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.internal_static_DelFriendRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.class, com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<DelFriendRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<DelFriendRespMsg>() {
      public DelFriendRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DelFriendRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DelFriendRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FRIENDROLEID_FIELD_NUMBER = 1;
    private long friendRoleId_;
    /**
     * <code>required int64 friendRoleId = 1;</code>
     *
     * <pre>
     *用户ID
     * </pre>
     */
    public boolean hasFriendRoleId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 friendRoleId = 1;</code>
     *
     * <pre>
     *用户ID
     * </pre>
     */
    public long getFriendRoleId() {
      return friendRoleId_;
    }

    private void initFields() {
      friendRoleId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFriendRoleId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, friendRoleId_);
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
          .computeInt64Size(1, friendRoleId_);
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

    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg prototype) {
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
     * Protobuf type {@code DelFriendRespMsg}
     *
     * <pre>
     *删除指定ID的好友
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DelFriendRespMsg)
        com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.internal_static_DelFriendRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.internal_static_DelFriendRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.class, com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        friendRoleId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.internal_static_DelFriendRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg build() {
        com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg result = new com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.friendRoleId_ = friendRoleId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg.getDefaultInstance()) return this;
        if (other.hasFriendRoleId()) {
          setFriendRoleId(other.getFriendRoleId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFriendRoleId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.friend.DelFriendRespProto.DelFriendRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long friendRoleId_ ;
      /**
       * <code>required int64 friendRoleId = 1;</code>
       *
       * <pre>
       *用户ID
       * </pre>
       */
      public boolean hasFriendRoleId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 friendRoleId = 1;</code>
       *
       * <pre>
       *用户ID
       * </pre>
       */
      public long getFriendRoleId() {
        return friendRoleId_;
      }
      /**
       * <code>required int64 friendRoleId = 1;</code>
       *
       * <pre>
       *用户ID
       * </pre>
       */
      public Builder setFriendRoleId(long value) {
        bitField0_ |= 0x00000001;
        friendRoleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 friendRoleId = 1;</code>
       *
       * <pre>
       *用户ID
       * </pre>
       */
      public Builder clearFriendRoleId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        friendRoleId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DelFriendRespMsg)
    }

    static {
      defaultInstance = new DelFriendRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DelFriendRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DelFriendRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DelFriendRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035friend/DelFriendRespMsg.proto\"(\n\020DelFr" +
      "iendRespMsg\022\024\n\014friendRoleId\030\001 \002(\003B=\n\'com" +
      ".chuangyou.common.protobuf.pb.friendB\022De" +
      "lFriendRespProto"
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
        }, assigner);
    internal_static_DelFriendRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DelFriendRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DelFriendRespMsg_descriptor,
        new java.lang.String[] { "FriendRoleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}