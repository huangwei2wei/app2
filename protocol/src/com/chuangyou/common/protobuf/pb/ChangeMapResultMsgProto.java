// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeMapResultMsg.proto

package com.chuangyou.common.protobuf.pb;

public final class ChangeMapResultMsgProto {
  private ChangeMapResultMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChangeMapResultMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeMapResultMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     *进入状态 该字段暂不处理
     * </pre>
     */
    boolean hasResult();
    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     *进入状态 该字段暂不处理
     * </pre>
     */
    int getResult();

    /**
     * <code>optional int32 mapType = 2;</code>
     *
     * <pre>
     *地图类型 该字段暂不处理
     * </pre>
     */
    boolean hasMapType();
    /**
     * <code>optional int32 mapType = 2;</code>
     *
     * <pre>
     *地图类型 该字段暂不处理
     * </pre>
     */
    int getMapType();

    /**
     * <code>optional .PostionMsg postion = 3;</code>
     *
     * <pre>
     *地图位置坐标
     * </pre>
     */
    boolean hasPostion();
    /**
     * <code>optional .PostionMsg postion = 3;</code>
     *
     * <pre>
     *地图位置坐标
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg getPostion();
    /**
     * <code>optional .PostionMsg postion = 3;</code>
     *
     * <pre>
     *地图位置坐标
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsgOrBuilder getPostionOrBuilder();
  }
  /**
   * Protobuf type {@code ChangeMapResultMsg}
   */
  public static final class ChangeMapResultMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ChangeMapResultMsg)
      ChangeMapResultMsgOrBuilder {
    // Use ChangeMapResultMsg.newBuilder() to construct.
    private ChangeMapResultMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChangeMapResultMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChangeMapResultMsg defaultInstance;
    public static ChangeMapResultMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ChangeMapResultMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeMapResultMsg(
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
            case 16: {
              bitField0_ |= 0x00000002;
              mapType_ = input.readInt32();
              break;
            }
            case 26: {
              com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = postion_.toBuilder();
              }
              postion_ = input.readMessage(com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(postion_);
                postion_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
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
      return com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.internal_static_ChangeMapResultMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.internal_static_ChangeMapResultMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.class, com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ChangeMapResultMsg> PARSER =
        new com.google.protobuf.AbstractParser<ChangeMapResultMsg>() {
      public ChangeMapResultMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeMapResultMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeMapResultMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     *进入状态 该字段暂不处理
     * </pre>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 result = 1;</code>
     *
     * <pre>
     *进入状态 该字段暂不处理
     * </pre>
     */
    public int getResult() {
      return result_;
    }

    public static final int MAPTYPE_FIELD_NUMBER = 2;
    private int mapType_;
    /**
     * <code>optional int32 mapType = 2;</code>
     *
     * <pre>
     *地图类型 该字段暂不处理
     * </pre>
     */
    public boolean hasMapType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 mapType = 2;</code>
     *
     * <pre>
     *地图类型 该字段暂不处理
     * </pre>
     */
    public int getMapType() {
      return mapType_;
    }

    public static final int POSTION_FIELD_NUMBER = 3;
    private com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg postion_;
    /**
     * <code>optional .PostionMsg postion = 3;</code>
     *
     * <pre>
     *地图位置坐标
     * </pre>
     */
    public boolean hasPostion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .PostionMsg postion = 3;</code>
     *
     * <pre>
     *地图位置坐标
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg getPostion() {
      return postion_;
    }
    /**
     * <code>optional .PostionMsg postion = 3;</code>
     *
     * <pre>
     *地图位置坐标
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsgOrBuilder getPostionOrBuilder() {
      return postion_;
    }

    private void initFields() {
      result_ = 0;
      mapType_ = 0;
      postion_ = com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.getDefaultInstance();
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, mapType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, postion_);
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, mapType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, postion_);
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

    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg prototype) {
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
     * Protobuf type {@code ChangeMapResultMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeMapResultMsg)
        com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.internal_static_ChangeMapResultMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.internal_static_ChangeMapResultMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.class, com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.newBuilder()
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
          getPostionFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        mapType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (postionBuilder_ == null) {
          postion_ = com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.getDefaultInstance();
        } else {
          postionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.internal_static_ChangeMapResultMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg build() {
        com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg result = new com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mapType_ = mapType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (postionBuilder_ == null) {
          result.postion_ = postion_;
        } else {
          result.postion_ = postionBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasMapType()) {
          setMapType(other.getMapType());
        }
        if (other.hasPostion()) {
          mergePostion(other.getPostion());
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
        com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.ChangeMapResultMsgProto.ChangeMapResultMsg) e.getUnfinishedMessage();
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
       *进入状态 该字段暂不处理
       * </pre>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 result = 1;</code>
       *
       * <pre>
       *进入状态 该字段暂不处理
       * </pre>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>optional int32 result = 1;</code>
       *
       * <pre>
       *进入状态 该字段暂不处理
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
       *进入状态 该字段暂不处理
       * </pre>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = 0;
        onChanged();
        return this;
      }

      private int mapType_ ;
      /**
       * <code>optional int32 mapType = 2;</code>
       *
       * <pre>
       *地图类型 该字段暂不处理
       * </pre>
       */
      public boolean hasMapType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 mapType = 2;</code>
       *
       * <pre>
       *地图类型 该字段暂不处理
       * </pre>
       */
      public int getMapType() {
        return mapType_;
      }
      /**
       * <code>optional int32 mapType = 2;</code>
       *
       * <pre>
       *地图类型 该字段暂不处理
       * </pre>
       */
      public Builder setMapType(int value) {
        bitField0_ |= 0x00000002;
        mapType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 mapType = 2;</code>
       *
       * <pre>
       *地图类型 该字段暂不处理
       * </pre>
       */
      public Builder clearMapType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mapType_ = 0;
        onChanged();
        return this;
      }

      private com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg postion_ = com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg, com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.Builder, com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsgOrBuilder> postionBuilder_;
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public boolean hasPostion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg getPostion() {
        if (postionBuilder_ == null) {
          return postion_;
        } else {
          return postionBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public Builder setPostion(com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg value) {
        if (postionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          postion_ = value;
          onChanged();
        } else {
          postionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public Builder setPostion(
          com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.Builder builderForValue) {
        if (postionBuilder_ == null) {
          postion_ = builderForValue.build();
          onChanged();
        } else {
          postionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public Builder mergePostion(com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg value) {
        if (postionBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              postion_ != com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.getDefaultInstance()) {
            postion_ =
              com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.newBuilder(postion_).mergeFrom(value).buildPartial();
          } else {
            postion_ = value;
          }
          onChanged();
        } else {
          postionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public Builder clearPostion() {
        if (postionBuilder_ == null) {
          postion_ = com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.getDefaultInstance();
          onChanged();
        } else {
          postionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.Builder getPostionBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPostionFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsgOrBuilder getPostionOrBuilder() {
        if (postionBuilder_ != null) {
          return postionBuilder_.getMessageOrBuilder();
        } else {
          return postion_;
        }
      }
      /**
       * <code>optional .PostionMsg postion = 3;</code>
       *
       * <pre>
       *地图位置坐标
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg, com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.Builder, com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsgOrBuilder> 
          getPostionFieldBuilder() {
        if (postionBuilder_ == null) {
          postionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg, com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg.Builder, com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsgOrBuilder>(
                  getPostion(),
                  getParentForChildren(),
                  isClean());
          postion_ = null;
        }
        return postionBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:ChangeMapResultMsg)
    }

    static {
      defaultInstance = new ChangeMapResultMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ChangeMapResultMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeMapResultMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChangeMapResultMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ChangeMapResultMsg.proto\032\020PostionMsg.p" +
      "roto\"S\n\022ChangeMapResultMsg\022\016\n\006result\030\001 \001" +
      "(\005\022\017\n\007mapType\030\002 \001(\005\022\034\n\007postion\030\003 \001(\0132\013.P" +
      "ostionMsgB;\n com.chuangyou.common.protob" +
      "uf.pbB\027ChangeMapResultMsgProto"
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
          com.chuangyou.common.protobuf.pb.PostionMsgProto.getDescriptor(),
        }, assigner);
    internal_static_ChangeMapResultMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeMapResultMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ChangeMapResultMsg_descriptor,
        new java.lang.String[] { "Result", "MapType", "Postion", });
    com.chuangyou.common.protobuf.pb.PostionMsgProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
