// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mount/MountSpecialListGetRespMsg.proto

package com.chuangyou.common.protobuf.pb.mount;

public final class MountSpecialListGetRespProto {
  private MountSpecialListGetRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MountSpecialListGetRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MountSpecialListGetRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 mountId = 1;</code>
     *
     * <pre>
     * 特殊坐骑ID
     * </pre>
     */
    java.util.List<java.lang.Integer> getMountIdList();
    /**
     * <code>repeated int32 mountId = 1;</code>
     *
     * <pre>
     * 特殊坐骑ID
     * </pre>
     */
    int getMountIdCount();
    /**
     * <code>repeated int32 mountId = 1;</code>
     *
     * <pre>
     * 特殊坐骑ID
     * </pre>
     */
    int getMountId(int index);
  }
  /**
   * Protobuf type {@code MountSpecialListGetRespMsg}
   */
  public static final class MountSpecialListGetRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MountSpecialListGetRespMsg)
      MountSpecialListGetRespMsgOrBuilder {
    // Use MountSpecialListGetRespMsg.newBuilder() to construct.
    private MountSpecialListGetRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MountSpecialListGetRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MountSpecialListGetRespMsg defaultInstance;
    public static MountSpecialListGetRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MountSpecialListGetRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MountSpecialListGetRespMsg(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                mountId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              mountId_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                mountId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                mountId_.add(input.readInt32());
              }
              input.popLimit(limit);
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
          mountId_ = java.util.Collections.unmodifiableList(mountId_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.internal_static_MountSpecialListGetRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.internal_static_MountSpecialListGetRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.class, com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MountSpecialListGetRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<MountSpecialListGetRespMsg>() {
      public MountSpecialListGetRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MountSpecialListGetRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MountSpecialListGetRespMsg> getParserForType() {
      return PARSER;
    }

    public static final int MOUNTID_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> mountId_;
    /**
     * <code>repeated int32 mountId = 1;</code>
     *
     * <pre>
     * 特殊坐骑ID
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getMountIdList() {
      return mountId_;
    }
    /**
     * <code>repeated int32 mountId = 1;</code>
     *
     * <pre>
     * 特殊坐骑ID
     * </pre>
     */
    public int getMountIdCount() {
      return mountId_.size();
    }
    /**
     * <code>repeated int32 mountId = 1;</code>
     *
     * <pre>
     * 特殊坐骑ID
     * </pre>
     */
    public int getMountId(int index) {
      return mountId_.get(index);
    }

    private void initFields() {
      mountId_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < mountId_.size(); i++) {
        output.writeInt32(1, mountId_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < mountId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(mountId_.get(i));
        }
        size += dataSize;
        size += 1 * getMountIdList().size();
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

    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg prototype) {
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
     * Protobuf type {@code MountSpecialListGetRespMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MountSpecialListGetRespMsg)
        com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.internal_static_MountSpecialListGetRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.internal_static_MountSpecialListGetRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.class, com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.newBuilder()
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
        mountId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.internal_static_MountSpecialListGetRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg build() {
        com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg result = new com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          mountId_ = java.util.Collections.unmodifiableList(mountId_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mountId_ = mountId_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg.getDefaultInstance()) return this;
        if (!other.mountId_.isEmpty()) {
          if (mountId_.isEmpty()) {
            mountId_ = other.mountId_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMountIdIsMutable();
            mountId_.addAll(other.mountId_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.mount.MountSpecialListGetRespProto.MountSpecialListGetRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> mountId_ = java.util.Collections.emptyList();
      private void ensureMountIdIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          mountId_ = new java.util.ArrayList<java.lang.Integer>(mountId_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getMountIdList() {
        return java.util.Collections.unmodifiableList(mountId_);
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public int getMountIdCount() {
        return mountId_.size();
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public int getMountId(int index) {
        return mountId_.get(index);
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public Builder setMountId(
          int index, int value) {
        ensureMountIdIsMutable();
        mountId_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public Builder addMountId(int value) {
        ensureMountIdIsMutable();
        mountId_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public Builder addAllMountId(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMountIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mountId_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 mountId = 1;</code>
       *
       * <pre>
       * 特殊坐骑ID
       * </pre>
       */
      public Builder clearMountId() {
        mountId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MountSpecialListGetRespMsg)
    }

    static {
      defaultInstance = new MountSpecialListGetRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MountSpecialListGetRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MountSpecialListGetRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MountSpecialListGetRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&mount/MountSpecialListGetRespMsg.proto" +
      "\"-\n\032MountSpecialListGetRespMsg\022\017\n\007mountI" +
      "d\030\001 \003(\005BF\n&com.chuangyou.common.protobuf" +
      ".pb.mountB\034MountSpecialListGetRespProto"
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
    internal_static_MountSpecialListGetRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MountSpecialListGetRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MountSpecialListGetRespMsg_descriptor,
        new java.lang.String[] { "MountId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}