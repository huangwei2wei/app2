// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: battle/LeaveFightMsg.proto

package com.chuangyou.common.protobuf.pb.battle;

public final class LeaveFightMsgProto {
  private LeaveFightMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LeaveFightMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LeaveFightMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool isNameFlicker = 1;</code>
     *
     * <pre>
     *是否闪烁
     * </pre>
     */
    boolean hasIsNameFlicker();
    /**
     * <code>optional bool isNameFlicker = 1;</code>
     *
     * <pre>
     *是否闪烁
     * </pre>
     */
    boolean getIsNameFlicker();
  }
  /**
   * Protobuf type {@code LeaveFightMsg}
   */
  public static final class LeaveFightMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:LeaveFightMsg)
      LeaveFightMsgOrBuilder {
    // Use LeaveFightMsg.newBuilder() to construct.
    private LeaveFightMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LeaveFightMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LeaveFightMsg defaultInstance;
    public static LeaveFightMsg getDefaultInstance() {
      return defaultInstance;
    }

    public LeaveFightMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LeaveFightMsg(
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
              isNameFlicker_ = input.readBool();
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
      return com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.internal_static_LeaveFightMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.internal_static_LeaveFightMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.class, com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<LeaveFightMsg> PARSER =
        new com.google.protobuf.AbstractParser<LeaveFightMsg>() {
      public LeaveFightMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LeaveFightMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LeaveFightMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ISNAMEFLICKER_FIELD_NUMBER = 1;
    private boolean isNameFlicker_;
    /**
     * <code>optional bool isNameFlicker = 1;</code>
     *
     * <pre>
     *是否闪烁
     * </pre>
     */
    public boolean hasIsNameFlicker() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool isNameFlicker = 1;</code>
     *
     * <pre>
     *是否闪烁
     * </pre>
     */
    public boolean getIsNameFlicker() {
      return isNameFlicker_;
    }

    private void initFields() {
      isNameFlicker_ = false;
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
        output.writeBool(1, isNameFlicker_);
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
          .computeBoolSize(1, isNameFlicker_);
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

    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg prototype) {
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
     * Protobuf type {@code LeaveFightMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LeaveFightMsg)
        com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.internal_static_LeaveFightMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.internal_static_LeaveFightMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.class, com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.newBuilder()
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
        isNameFlicker_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.internal_static_LeaveFightMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg build() {
        com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg result = new com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isNameFlicker_ = isNameFlicker_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg.getDefaultInstance()) return this;
        if (other.hasIsNameFlicker()) {
          setIsNameFlicker(other.getIsNameFlicker());
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
        com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.battle.LeaveFightMsgProto.LeaveFightMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isNameFlicker_ ;
      /**
       * <code>optional bool isNameFlicker = 1;</code>
       *
       * <pre>
       *是否闪烁
       * </pre>
       */
      public boolean hasIsNameFlicker() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool isNameFlicker = 1;</code>
       *
       * <pre>
       *是否闪烁
       * </pre>
       */
      public boolean getIsNameFlicker() {
        return isNameFlicker_;
      }
      /**
       * <code>optional bool isNameFlicker = 1;</code>
       *
       * <pre>
       *是否闪烁
       * </pre>
       */
      public Builder setIsNameFlicker(boolean value) {
        bitField0_ |= 0x00000001;
        isNameFlicker_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isNameFlicker = 1;</code>
       *
       * <pre>
       *是否闪烁
       * </pre>
       */
      public Builder clearIsNameFlicker() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isNameFlicker_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:LeaveFightMsg)
    }

    static {
      defaultInstance = new LeaveFightMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:LeaveFightMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LeaveFightMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_LeaveFightMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032battle/LeaveFightMsg.proto\"&\n\rLeaveFig" +
      "htMsg\022\025\n\risNameFlicker\030\001 \001(\010B=\n\'com.chua" +
      "ngyou.common.protobuf.pb.battleB\022LeaveFi" +
      "ghtMsgProto"
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
    internal_static_LeaveFightMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LeaveFightMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_LeaveFightMsg_descriptor,
        new java.lang.String[] { "IsNameFlicker", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}