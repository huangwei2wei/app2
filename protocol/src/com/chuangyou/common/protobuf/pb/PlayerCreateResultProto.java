// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login/PlayerCreateResultMsg.proto

package com.chuangyou.common.protobuf.pb;

public final class PlayerCreateResultProto {
  private PlayerCreateResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerCreateResultMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCreateResultMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 resultCode = 1;</code>
     *
     * <pre>
     * 创建角色结果
     * </pre>
     */
    boolean hasResultCode();
    /**
     * <code>optional int32 resultCode = 1;</code>
     *
     * <pre>
     * 创建角色结果
     * </pre>
     */
    int getResultCode();
  }
  /**
   * Protobuf type {@code PlayerCreateResultMsg}
   */
  public static final class PlayerCreateResultMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerCreateResultMsg)
      PlayerCreateResultMsgOrBuilder {
    // Use PlayerCreateResultMsg.newBuilder() to construct.
    private PlayerCreateResultMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerCreateResultMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerCreateResultMsg defaultInstance;
    public static PlayerCreateResultMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerCreateResultMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerCreateResultMsg(
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
              resultCode_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.internal_static_PlayerCreateResultMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.internal_static_PlayerCreateResultMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.class, com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerCreateResultMsg> PARSER =
        new com.google.protobuf.AbstractParser<PlayerCreateResultMsg>() {
      public PlayerCreateResultMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerCreateResultMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCreateResultMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int RESULTCODE_FIELD_NUMBER = 1;
    private int resultCode_;
    /**
     * <code>optional int32 resultCode = 1;</code>
     *
     * <pre>
     * 创建角色结果
     * </pre>
     */
    public boolean hasResultCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 resultCode = 1;</code>
     *
     * <pre>
     * 创建角色结果
     * </pre>
     */
    public int getResultCode() {
      return resultCode_;
    }

    private void initFields() {
      resultCode_ = 0;
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
        output.writeInt32(1, resultCode_);
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
          .computeInt32Size(1, resultCode_);
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

    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg prototype) {
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
     * Protobuf type {@code PlayerCreateResultMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCreateResultMsg)
        com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.internal_static_PlayerCreateResultMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.internal_static_PlayerCreateResultMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.class, com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.newBuilder()
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
        resultCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.internal_static_PlayerCreateResultMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg build() {
        com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg result = new com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.resultCode_ = resultCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg.getDefaultInstance()) return this;
        if (other.hasResultCode()) {
          setResultCode(other.getResultCode());
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
        com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.PlayerCreateResultProto.PlayerCreateResultMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int resultCode_ ;
      /**
       * <code>optional int32 resultCode = 1;</code>
       *
       * <pre>
       * 创建角色结果
       * </pre>
       */
      public boolean hasResultCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 resultCode = 1;</code>
       *
       * <pre>
       * 创建角色结果
       * </pre>
       */
      public int getResultCode() {
        return resultCode_;
      }
      /**
       * <code>optional int32 resultCode = 1;</code>
       *
       * <pre>
       * 创建角色结果
       * </pre>
       */
      public Builder setResultCode(int value) {
        bitField0_ |= 0x00000001;
        resultCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 resultCode = 1;</code>
       *
       * <pre>
       * 创建角色结果
       * </pre>
       */
      public Builder clearResultCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        resultCode_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PlayerCreateResultMsg)
    }

    static {
      defaultInstance = new PlayerCreateResultMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerCreateResultMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCreateResultMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerCreateResultMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!login/PlayerCreateResultMsg.proto\"+\n\025P" +
      "layerCreateResultMsg\022\022\n\nresultCode\030\001 \001(\005" +
      "B;\n com.chuangyou.common.protobuf.pbB\027Pl" +
      "ayerCreateResultProto"
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
    internal_static_PlayerCreateResultMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCreateResultMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerCreateResultMsg_descriptor,
        new java.lang.String[] { "ResultCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
