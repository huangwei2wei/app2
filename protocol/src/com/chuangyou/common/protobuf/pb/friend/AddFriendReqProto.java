// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friend/AddFriendReqMsg.proto

package com.chuangyou.common.protobuf.pb.friend;

public final class AddFriendReqProto {
  private AddFriendReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AddFriendReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AddFriendReqMsg)
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
   * Protobuf type {@code AddFriendReqMsg}
   *
   * <pre>
   *请求添加谁为好友
   * </pre>
   */
  public static final class AddFriendReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AddFriendReqMsg)
      AddFriendReqMsgOrBuilder {
    // Use AddFriendReqMsg.newBuilder() to construct.
    private AddFriendReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AddFriendReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AddFriendReqMsg defaultInstance;
    public static AddFriendReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public AddFriendReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AddFriendReqMsg(
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
      return com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.internal_static_AddFriendReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.internal_static_AddFriendReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.class, com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<AddFriendReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<AddFriendReqMsg>() {
      public AddFriendReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddFriendReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AddFriendReqMsg> getParserForType() {
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

    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg prototype) {
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
     * Protobuf type {@code AddFriendReqMsg}
     *
     * <pre>
     *请求添加谁为好友
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AddFriendReqMsg)
        com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.internal_static_AddFriendReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.internal_static_AddFriendReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.class, com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.newBuilder()
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
        return com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.internal_static_AddFriendReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg build() {
        com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg result = new com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg(this);
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
        if (other instanceof com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg.getDefaultInstance()) return this;
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
        com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.friend.AddFriendReqProto.AddFriendReqMsg) e.getUnfinishedMessage();
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

      // @@protoc_insertion_point(builder_scope:AddFriendReqMsg)
    }

    static {
      defaultInstance = new AddFriendReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AddFriendReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddFriendReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AddFriendReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034friend/AddFriendReqMsg.proto\"\'\n\017AddFri" +
      "endReqMsg\022\024\n\014friendRoleId\030\001 \002(\003B<\n\'com.c" +
      "huangyou.common.protobuf.pb.friendB\021AddF" +
      "riendReqProto"
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
    internal_static_AddFriendReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddFriendReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AddFriendReqMsg_descriptor,
        new java.lang.String[] { "FriendRoleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}