// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: equip/EquipResolveOnekeyRespMsg.proto

package com.chuangyou.common.protobuf.pb.equip;

public final class EquipResolveOnekeyRespProto {
  private EquipResolveOnekeyRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EquipResolveOnekeyRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EquipResolveOnekeyRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
     * </pre>
     */
    boolean hasResult();
    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
     * </pre>
     */
    int getResult();
  }
  /**
   * Protobuf type {@code EquipResolveOnekeyRespMsg}
   */
  public static final class EquipResolveOnekeyRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:EquipResolveOnekeyRespMsg)
      EquipResolveOnekeyRespMsgOrBuilder {
    // Use EquipResolveOnekeyRespMsg.newBuilder() to construct.
    private EquipResolveOnekeyRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EquipResolveOnekeyRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EquipResolveOnekeyRespMsg defaultInstance;
    public static EquipResolveOnekeyRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public EquipResolveOnekeyRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EquipResolveOnekeyRespMsg(
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
              result_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.internal_static_EquipResolveOnekeyRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.internal_static_EquipResolveOnekeyRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.class, com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<EquipResolveOnekeyRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<EquipResolveOnekeyRespMsg>() {
      public EquipResolveOnekeyRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EquipResolveOnekeyRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EquipResolveOnekeyRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
     * </pre>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
     * </pre>
     */
    public int getResult() {
      return result_;
    }

    private void initFields() {
      result_ = 0;
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
        output.writeInt32(1, result_);
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
          .computeInt32Size(1, result_);
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

    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg prototype) {
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
     * Protobuf type {@code EquipResolveOnekeyRespMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EquipResolveOnekeyRespMsg)
        com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.internal_static_EquipResolveOnekeyRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.internal_static_EquipResolveOnekeyRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.class, com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.newBuilder()
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
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.internal_static_EquipResolveOnekeyRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg build() {
        com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg result = new com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
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
        com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.equip.EquipResolveOnekeyRespProto.EquipResolveOnekeyRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int result_ ;
      /**
       * <code>optional int32 result = 1;</code>
       *
       * <pre>
       * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
       * </pre>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 result = 1;</code>
       *
       * <pre>
       * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
       * </pre>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>optional int32 result = 1;</code>
       *
       * <pre>
       * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
       * </pre>
       */
      public Builder setResult(int value) {
        bitField0_ |= 0x00000001;
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 result = 1;</code>
       *
       * <pre>
       * 分解结果，分解装备成功数量大于0就是成功(0成功 1失败)
       * </pre>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EquipResolveOnekeyRespMsg)
    }

    static {
      defaultInstance = new EquipResolveOnekeyRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:EquipResolveOnekeyRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EquipResolveOnekeyRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EquipResolveOnekeyRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%equip/EquipResolveOnekeyRespMsg.proto\"" +
      "+\n\031EquipResolveOnekeyRespMsg\022\016\n\006result\030\001" +
      " \001(\005BE\n&com.chuangyou.common.protobuf.pb" +
      ".equipB\033EquipResolveOnekeyRespProto"
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
    internal_static_EquipResolveOnekeyRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EquipResolveOnekeyRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_EquipResolveOnekeyRespMsg_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
