// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerLoadDataMsg.proto

package com.chuangyou.common.protobuf.pb;

public final class PlayerLoadDataMsgProto {
  private PlayerLoadDataMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerLoadDataMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerLoadDataMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 loadDataType = 1;</code>
     *
     * <pre>
     * 收到加载数据类型
     * </pre>
     */
    boolean hasLoadDataType();
    /**
     * <code>optional int32 loadDataType = 1;</code>
     *
     * <pre>
     * 收到加载数据类型
     * </pre>
     */
    int getLoadDataType();
  }
  /**
   * Protobuf type {@code PlayerLoadDataMsg}
   *
   * <pre>
   *用户数据加载
   * </pre>
   */
  public static final class PlayerLoadDataMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerLoadDataMsg)
      PlayerLoadDataMsgOrBuilder {
    // Use PlayerLoadDataMsg.newBuilder() to construct.
    private PlayerLoadDataMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerLoadDataMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerLoadDataMsg defaultInstance;
    public static PlayerLoadDataMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerLoadDataMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerLoadDataMsg(
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
              loadDataType_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.internal_static_PlayerLoadDataMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.internal_static_PlayerLoadDataMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.class, com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerLoadDataMsg> PARSER =
        new com.google.protobuf.AbstractParser<PlayerLoadDataMsg>() {
      public PlayerLoadDataMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerLoadDataMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerLoadDataMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LOADDATATYPE_FIELD_NUMBER = 1;
    private int loadDataType_;
    /**
     * <code>optional int32 loadDataType = 1;</code>
     *
     * <pre>
     * 收到加载数据类型
     * </pre>
     */
    public boolean hasLoadDataType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 loadDataType = 1;</code>
     *
     * <pre>
     * 收到加载数据类型
     * </pre>
     */
    public int getLoadDataType() {
      return loadDataType_;
    }

    private void initFields() {
      loadDataType_ = 0;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, loadDataType_);
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
          .computeInt32Size(1, loadDataType_);
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

    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg prototype) {
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
     * Protobuf type {@code PlayerLoadDataMsg}
     *
     * <pre>
     *用户数据加载
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerLoadDataMsg)
        com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.internal_static_PlayerLoadDataMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.internal_static_PlayerLoadDataMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.class, com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.newBuilder()
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
        loadDataType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.internal_static_PlayerLoadDataMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg build() {
        com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg result = new com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.loadDataType_ = loadDataType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg.getDefaultInstance()) return this;
        if (other.hasLoadDataType()) {
          setLoadDataType(other.getLoadDataType());
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
        com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.PlayerLoadDataMsgProto.PlayerLoadDataMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int loadDataType_ ;
      /**
       * <code>optional int32 loadDataType = 1;</code>
       *
       * <pre>
       * 收到加载数据类型
       * </pre>
       */
      public boolean hasLoadDataType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 loadDataType = 1;</code>
       *
       * <pre>
       * 收到加载数据类型
       * </pre>
       */
      public int getLoadDataType() {
        return loadDataType_;
      }
      /**
       * <code>optional int32 loadDataType = 1;</code>
       *
       * <pre>
       * 收到加载数据类型
       * </pre>
       */
      public Builder setLoadDataType(int value) {
        bitField0_ |= 0x00000001;
        loadDataType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 loadDataType = 1;</code>
       *
       * <pre>
       * 收到加载数据类型
       * </pre>
       */
      public Builder clearLoadDataType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        loadDataType_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PlayerLoadDataMsg)
    }

    static {
      defaultInstance = new PlayerLoadDataMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerLoadDataMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerLoadDataMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerLoadDataMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerLoadDataMsg.proto\")\n\021PlayerLoadD" +
      "ataMsg\022\024\n\014loadDataType\030\001 \001(\005B:\n com.chua" +
      "ngyou.common.protobuf.pbB\026PlayerLoadData" +
      "MsgProto"
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
    internal_static_PlayerLoadDataMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerLoadDataMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerLoadDataMsg_descriptor,
        new java.lang.String[] { "LoadDataType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}