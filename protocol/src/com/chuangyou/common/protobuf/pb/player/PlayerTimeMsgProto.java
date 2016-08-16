// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerTimeMsg.proto

package com.chuangyou.common.protobuf.pb.player;

public final class PlayerTimeMsgProto {
  private PlayerTimeMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerTimeMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerTimeMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 sigleCampCount = 1;</code>
     *
     * <pre>
     *ÿ�յ��˸�������
     * </pre>
     */
    boolean hasSigleCampCount();
    /**
     * <code>optional int32 sigleCampCount = 1;</code>
     *
     * <pre>
     *ÿ�յ��˸�������
     * </pre>
     */
    int getSigleCampCount();

    /**
     * <code>optional int32 challengeCampCount = 2;</code>
     *
     * <pre>
     *ÿ����ս��������
     * </pre>
     */
    boolean hasChallengeCampCount();
    /**
     * <code>optional int32 challengeCampCount = 2;</code>
     *
     * <pre>
     *ÿ����ս��������
     * </pre>
     */
    int getChallengeCampCount();
  }
  /**
   * Protobuf type {@code PlayerTimeMsg}
   */
  public static final class PlayerTimeMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerTimeMsg)
      PlayerTimeMsgOrBuilder {
    // Use PlayerTimeMsg.newBuilder() to construct.
    private PlayerTimeMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerTimeMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerTimeMsg defaultInstance;
    public static PlayerTimeMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerTimeMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerTimeMsg(
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
              sigleCampCount_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              challengeCampCount_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.internal_static_PlayerTimeMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.internal_static_PlayerTimeMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.class, com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerTimeMsg> PARSER =
        new com.google.protobuf.AbstractParser<PlayerTimeMsg>() {
      public PlayerTimeMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerTimeMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerTimeMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SIGLECAMPCOUNT_FIELD_NUMBER = 1;
    private int sigleCampCount_;
    /**
     * <code>optional int32 sigleCampCount = 1;</code>
     *
     * <pre>
     *ÿ�յ��˸�������
     * </pre>
     */
    public boolean hasSigleCampCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 sigleCampCount = 1;</code>
     *
     * <pre>
     *ÿ�յ��˸�������
     * </pre>
     */
    public int getSigleCampCount() {
      return sigleCampCount_;
    }

    public static final int CHALLENGECAMPCOUNT_FIELD_NUMBER = 2;
    private int challengeCampCount_;
    /**
     * <code>optional int32 challengeCampCount = 2;</code>
     *
     * <pre>
     *ÿ����ս��������
     * </pre>
     */
    public boolean hasChallengeCampCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 challengeCampCount = 2;</code>
     *
     * <pre>
     *ÿ����ս��������
     * </pre>
     */
    public int getChallengeCampCount() {
      return challengeCampCount_;
    }

    private void initFields() {
      sigleCampCount_ = 0;
      challengeCampCount_ = 0;
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
        output.writeInt32(1, sigleCampCount_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, challengeCampCount_);
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
          .computeInt32Size(1, sigleCampCount_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, challengeCampCount_);
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

    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg prototype) {
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
     * Protobuf type {@code PlayerTimeMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerTimeMsg)
        com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.internal_static_PlayerTimeMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.internal_static_PlayerTimeMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.class, com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.newBuilder()
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
        sigleCampCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        challengeCampCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.internal_static_PlayerTimeMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg build() {
        com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg result = new com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sigleCampCount_ = sigleCampCount_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.challengeCampCount_ = challengeCampCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg.getDefaultInstance()) return this;
        if (other.hasSigleCampCount()) {
          setSigleCampCount(other.getSigleCampCount());
        }
        if (other.hasChallengeCampCount()) {
          setChallengeCampCount(other.getChallengeCampCount());
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
        com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.player.PlayerTimeMsgProto.PlayerTimeMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sigleCampCount_ ;
      /**
       * <code>optional int32 sigleCampCount = 1;</code>
       *
       * <pre>
       *ÿ�յ��˸�������
       * </pre>
       */
      public boolean hasSigleCampCount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 sigleCampCount = 1;</code>
       *
       * <pre>
       *ÿ�յ��˸�������
       * </pre>
       */
      public int getSigleCampCount() {
        return sigleCampCount_;
      }
      /**
       * <code>optional int32 sigleCampCount = 1;</code>
       *
       * <pre>
       *ÿ�յ��˸�������
       * </pre>
       */
      public Builder setSigleCampCount(int value) {
        bitField0_ |= 0x00000001;
        sigleCampCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 sigleCampCount = 1;</code>
       *
       * <pre>
       *ÿ�յ��˸�������
       * </pre>
       */
      public Builder clearSigleCampCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sigleCampCount_ = 0;
        onChanged();
        return this;
      }

      private int challengeCampCount_ ;
      /**
       * <code>optional int32 challengeCampCount = 2;</code>
       *
       * <pre>
       *ÿ����ս��������
       * </pre>
       */
      public boolean hasChallengeCampCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 challengeCampCount = 2;</code>
       *
       * <pre>
       *ÿ����ս��������
       * </pre>
       */
      public int getChallengeCampCount() {
        return challengeCampCount_;
      }
      /**
       * <code>optional int32 challengeCampCount = 2;</code>
       *
       * <pre>
       *ÿ����ս��������
       * </pre>
       */
      public Builder setChallengeCampCount(int value) {
        bitField0_ |= 0x00000002;
        challengeCampCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 challengeCampCount = 2;</code>
       *
       * <pre>
       *ÿ����ս��������
       * </pre>
       */
      public Builder clearChallengeCampCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        challengeCampCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PlayerTimeMsg)
    }

    static {
      defaultInstance = new PlayerTimeMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerTimeMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerTimeMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerTimeMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PlayerTimeMsg.proto\"C\n\rPlayerTimeMsg\022\026" +
      "\n\016sigleCampCount\030\001 \001(\005\022\032\n\022challengeCampC" +
      "ount\030\002 \001(\005B=\n\'com.chuangyou.common.proto" +
      "buf.pb.playerB\022PlayerTimeMsgProto"
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
    internal_static_PlayerTimeMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerTimeMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerTimeMsg_descriptor,
        new java.lang.String[] { "SigleCampCount", "ChallengeCampCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}