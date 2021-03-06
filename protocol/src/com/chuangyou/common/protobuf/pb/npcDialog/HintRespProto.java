// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: npcDialog/HintRespMsg.proto

package com.chuangyou.common.protobuf.pb.npcDialog;

public final class HintRespProto {
  private HintRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface HintRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HintRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string content = 1;</code>
     *
     * <pre>
     *提示内容
     * </pre>
     */
    boolean hasContent();
    /**
     * <code>required string content = 1;</code>
     *
     * <pre>
     *提示内容
     * </pre>
     */
    java.lang.String getContent();
    /**
     * <code>required string content = 1;</code>
     *
     * <pre>
     *提示内容
     * </pre>
     */
    com.google.protobuf.ByteString
        getContentBytes();
  }
  /**
   * Protobuf type {@code HintRespMsg}
   *
   * <pre>
   *客户端提示
   * </pre>
   */
  public static final class HintRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:HintRespMsg)
      HintRespMsgOrBuilder {
    // Use HintRespMsg.newBuilder() to construct.
    private HintRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private HintRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final HintRespMsg defaultInstance;
    public static HintRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public HintRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private HintRespMsg(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              content_ = bs;
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
      return com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.internal_static_HintRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.internal_static_HintRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.class, com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<HintRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<HintRespMsg>() {
      public HintRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HintRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<HintRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private java.lang.Object content_;
    /**
     * <code>required string content = 1;</code>
     *
     * <pre>
     *提示内容
     * </pre>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string content = 1;</code>
     *
     * <pre>
     *提示内容
     * </pre>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string content = 1;</code>
     *
     * <pre>
     *提示内容
     * </pre>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      content_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasContent()) {
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
        output.writeBytes(1, getContentBytes());
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
          .computeBytesSize(1, getContentBytes());
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

    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg prototype) {
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
     * Protobuf type {@code HintRespMsg}
     *
     * <pre>
     *客户端提示
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HintRespMsg)
        com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.internal_static_HintRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.internal_static_HintRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.class, com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.newBuilder()
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
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.internal_static_HintRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg build() {
        com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg result = new com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg.getDefaultInstance()) return this;
        if (other.hasContent()) {
          bitField0_ |= 0x00000001;
          content_ = other.content_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasContent()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.npcDialog.HintRespProto.HintRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object content_ = "";
      /**
       * <code>required string content = 1;</code>
       *
       * <pre>
       *提示内容
       * </pre>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string content = 1;</code>
       *
       * <pre>
       *提示内容
       * </pre>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            content_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string content = 1;</code>
       *
       * <pre>
       *提示内容
       * </pre>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string content = 1;</code>
       *
       * <pre>
       *提示内容
       * </pre>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 1;</code>
       *
       * <pre>
       *提示内容
       * </pre>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 1;</code>
       *
       * <pre>
       *提示内容
       * </pre>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        content_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:HintRespMsg)
    }

    static {
      defaultInstance = new HintRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:HintRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HintRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_HintRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033npcDialog/HintRespMsg.proto\"\036\n\013HintRes" +
      "pMsg\022\017\n\007content\030\001 \002(\tB;\n*com.chuangyou.c" +
      "ommon.protobuf.pb.npcDialogB\rHintRespPro" +
      "to"
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
    internal_static_HintRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HintRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_HintRespMsg_descriptor,
        new java.lang.String[] { "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
