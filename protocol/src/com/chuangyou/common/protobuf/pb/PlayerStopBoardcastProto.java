// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene/PlayerStropBoardcastMsg.proto

package com.chuangyou.common.protobuf.pb;

public final class PlayerStopBoardcastProto {
  private PlayerStopBoardcastProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerStopBoardcastMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStopBoardcastMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *玩家id
     * </pre>
     */
    boolean hasId();
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *玩家id
     * </pre>
     */
    long getId();

    /**
     * <code>optional .PBVector3 cur = 2;</code>
     *
     * <pre>
     *当前位置
     * </pre>
     */
    boolean hasCur();
    /**
     * <code>optional .PBVector3 cur = 2;</code>
     *
     * <pre>
     *当前位置
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getCur();
    /**
     * <code>optional .PBVector3 cur = 2;</code>
     *
     * <pre>
     *当前位置
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getCurOrBuilder();
  }
  /**
   * Protobuf type {@code PlayerStopBoardcastMsg}
   */
  public static final class PlayerStopBoardcastMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerStopBoardcastMsg)
      PlayerStopBoardcastMsgOrBuilder {
    // Use PlayerStopBoardcastMsg.newBuilder() to construct.
    private PlayerStopBoardcastMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerStopBoardcastMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerStopBoardcastMsg defaultInstance;
    public static PlayerStopBoardcastMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerStopBoardcastMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerStopBoardcastMsg(
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
              id_ = input.readInt64();
              break;
            }
            case 18: {
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = cur_.toBuilder();
              }
              cur_ = input.readMessage(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cur_);
                cur_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.internal_static_PlayerStopBoardcastMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.internal_static_PlayerStopBoardcastMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.class, com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerStopBoardcastMsg> PARSER =
        new com.google.protobuf.AbstractParser<PlayerStopBoardcastMsg>() {
      public PlayerStopBoardcastMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerStopBoardcastMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStopBoardcastMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *玩家id
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 id = 1;</code>
     *
     * <pre>
     *玩家id
     * </pre>
     */
    public long getId() {
      return id_;
    }

    public static final int CUR_FIELD_NUMBER = 2;
    private com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 cur_;
    /**
     * <code>optional .PBVector3 cur = 2;</code>
     *
     * <pre>
     *当前位置
     * </pre>
     */
    public boolean hasCur() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .PBVector3 cur = 2;</code>
     *
     * <pre>
     *当前位置
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getCur() {
      return cur_;
    }
    /**
     * <code>optional .PBVector3 cur = 2;</code>
     *
     * <pre>
     *当前位置
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getCurOrBuilder() {
      return cur_;
    }

    private void initFields() {
      id_ = 0L;
      cur_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
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
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, cur_);
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
          .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, cur_);
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

    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg prototype) {
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
     * Protobuf type {@code PlayerStopBoardcastMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStopBoardcastMsg)
        com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.internal_static_PlayerStopBoardcastMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.internal_static_PlayerStopBoardcastMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.class, com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.newBuilder()
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
          getCurFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (curBuilder_ == null) {
          cur_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
        } else {
          curBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.internal_static_PlayerStopBoardcastMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg build() {
        com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg result = new com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (curBuilder_ == null) {
          result.cur_ = cur_;
        } else {
          result.cur_ = curBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasCur()) {
          mergeCur(other.getCur());
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
        com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.PlayerStopBoardcastProto.PlayerStopBoardcastMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *玩家id
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *玩家id
       * </pre>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *玩家id
       * </pre>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 id = 1;</code>
       *
       * <pre>
       *玩家id
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      private com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 cur_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder> curBuilder_;
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public boolean hasCur() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getCur() {
        if (curBuilder_ == null) {
          return cur_;
        } else {
          return curBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public Builder setCur(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 value) {
        if (curBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cur_ = value;
          onChanged();
        } else {
          curBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public Builder setCur(
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder builderForValue) {
        if (curBuilder_ == null) {
          cur_ = builderForValue.build();
          onChanged();
        } else {
          curBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public Builder mergeCur(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 value) {
        if (curBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              cur_ != com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance()) {
            cur_ =
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.newBuilder(cur_).mergeFrom(value).buildPartial();
          } else {
            cur_ = value;
          }
          onChanged();
        } else {
          curBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public Builder clearCur() {
        if (curBuilder_ == null) {
          cur_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
          onChanged();
        } else {
          curBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder getCurBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCurFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getCurOrBuilder() {
        if (curBuilder_ != null) {
          return curBuilder_.getMessageOrBuilder();
        } else {
          return cur_;
        }
      }
      /**
       * <code>optional .PBVector3 cur = 2;</code>
       *
       * <pre>
       *当前位置
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder> 
          getCurFieldBuilder() {
        if (curBuilder_ == null) {
          curBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder>(
                  getCur(),
                  getParentForChildren(),
                  isClean());
          cur_ = null;
        }
        return curBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:PlayerStopBoardcastMsg)
    }

    static {
      defaultInstance = new PlayerStopBoardcastMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerStopBoardcastMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStopBoardcastMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerStopBoardcastMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#scene/PlayerStropBoardcastMsg.proto\032\026c" +
      "ommon/PBVector3.proto\"=\n\026PlayerStopBoard" +
      "castMsg\022\n\n\002id\030\001 \001(\003\022\027\n\003cur\030\002 \001(\0132\n.PBVec" +
      "tor3B<\n com.chuangyou.common.protobuf.pb" +
      "B\030PlayerStopBoardcastProto"
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
          com.chuangyou.common.protobuf.pb.Vector3Proto.getDescriptor(),
        }, assigner);
    internal_static_PlayerStopBoardcastMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStopBoardcastMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerStopBoardcastMsg_descriptor,
        new java.lang.String[] { "Id", "Cur", });
    com.chuangyou.common.protobuf.pb.Vector3Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
