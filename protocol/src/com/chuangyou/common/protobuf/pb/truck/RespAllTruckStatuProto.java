// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RespAllTruckStatu.proto

package com.chuangyou.common.protobuf.pb.truck;

public final class RespAllTruckStatuProto {
  private RespAllTruckStatuProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RespAllTruckStatuOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RespAllTruckStatu)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu> 
        getTrucksList();
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu getTrucks(int index);
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    int getTrucksCount();
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder> 
        getTrucksOrBuilderList();
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder getTrucksOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code RespAllTruckStatu}
   *
   * <pre>
   *回应所有镖车的状态
   * </pre>
   */
  public static final class RespAllTruckStatu extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RespAllTruckStatu)
      RespAllTruckStatuOrBuilder {
    // Use RespAllTruckStatu.newBuilder() to construct.
    private RespAllTruckStatu(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RespAllTruckStatu(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RespAllTruckStatu defaultInstance;
    public static RespAllTruckStatu getDefaultInstance() {
      return defaultInstance;
    }

    public RespAllTruckStatu getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RespAllTruckStatu(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                trucks_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu>();
                mutable_bitField0_ |= 0x00000001;
              }
              trucks_.add(input.readMessage(com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.PARSER, extensionRegistry));
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
          trucks_ = java.util.Collections.unmodifiableList(trucks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.internal_static_RespAllTruckStatu_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.internal_static_RespAllTruckStatu_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.class, com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.Builder.class);
    }

    public static com.google.protobuf.Parser<RespAllTruckStatu> PARSER =
        new com.google.protobuf.AbstractParser<RespAllTruckStatu>() {
      public RespAllTruckStatu parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RespAllTruckStatu(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RespAllTruckStatu> getParserForType() {
      return PARSER;
    }

    public static final int TRUCKS_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu> trucks_;
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu> getTrucksList() {
      return trucks_;
    }
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder> 
        getTrucksOrBuilderList() {
      return trucks_;
    }
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    public int getTrucksCount() {
      return trucks_.size();
    }
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu getTrucks(int index) {
      return trucks_.get(index);
    }
    /**
     * <code>repeated .TruckStatu trucks = 1;</code>
     *
     * <pre>
     *属性
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder getTrucksOrBuilder(
        int index) {
      return trucks_.get(index);
    }

    private void initFields() {
      trucks_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < trucks_.size(); i++) {
        output.writeMessage(1, trucks_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < trucks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, trucks_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu prototype) {
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
     * Protobuf type {@code RespAllTruckStatu}
     *
     * <pre>
     *回应所有镖车的状态
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RespAllTruckStatu)
        com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatuOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.internal_static_RespAllTruckStatu_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.internal_static_RespAllTruckStatu_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.class, com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.newBuilder()
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
          getTrucksFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (trucksBuilder_ == null) {
          trucks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          trucksBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.internal_static_RespAllTruckStatu_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu build() {
        com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu buildPartial() {
        com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu result = new com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu(this);
        int from_bitField0_ = bitField0_;
        if (trucksBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            trucks_ = java.util.Collections.unmodifiableList(trucks_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.trucks_ = trucks_;
        } else {
          result.trucks_ = trucksBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu other) {
        if (other == com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu.getDefaultInstance()) return this;
        if (trucksBuilder_ == null) {
          if (!other.trucks_.isEmpty()) {
            if (trucks_.isEmpty()) {
              trucks_ = other.trucks_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTrucksIsMutable();
              trucks_.addAll(other.trucks_);
            }
            onChanged();
          }
        } else {
          if (!other.trucks_.isEmpty()) {
            if (trucksBuilder_.isEmpty()) {
              trucksBuilder_.dispose();
              trucksBuilder_ = null;
              trucks_ = other.trucks_;
              bitField0_ = (bitField0_ & ~0x00000001);
              trucksBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTrucksFieldBuilder() : null;
            } else {
              trucksBuilder_.addAllMessages(other.trucks_);
            }
          }
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
        com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.truck.RespAllTruckStatuProto.RespAllTruckStatu) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu> trucks_ =
        java.util.Collections.emptyList();
      private void ensureTrucksIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          trucks_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu>(trucks_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder> trucksBuilder_;

      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu> getTrucksList() {
        if (trucksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(trucks_);
        } else {
          return trucksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public int getTrucksCount() {
        if (trucksBuilder_ == null) {
          return trucks_.size();
        } else {
          return trucksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu getTrucks(int index) {
        if (trucksBuilder_ == null) {
          return trucks_.get(index);
        } else {
          return trucksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder setTrucks(
          int index, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu value) {
        if (trucksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrucksIsMutable();
          trucks_.set(index, value);
          onChanged();
        } else {
          trucksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder setTrucks(
          int index, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder builderForValue) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.set(index, builderForValue.build());
          onChanged();
        } else {
          trucksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder addTrucks(com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu value) {
        if (trucksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrucksIsMutable();
          trucks_.add(value);
          onChanged();
        } else {
          trucksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder addTrucks(
          int index, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu value) {
        if (trucksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrucksIsMutable();
          trucks_.add(index, value);
          onChanged();
        } else {
          trucksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder addTrucks(
          com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder builderForValue) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.add(builderForValue.build());
          onChanged();
        } else {
          trucksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder addTrucks(
          int index, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder builderForValue) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.add(index, builderForValue.build());
          onChanged();
        } else {
          trucksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder addAllTrucks(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu> values) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, trucks_);
          onChanged();
        } else {
          trucksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder clearTrucks() {
        if (trucksBuilder_ == null) {
          trucks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          trucksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public Builder removeTrucks(int index) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.remove(index);
          onChanged();
        } else {
          trucksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder getTrucksBuilder(
          int index) {
        return getTrucksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder getTrucksOrBuilder(
          int index) {
        if (trucksBuilder_ == null) {
          return trucks_.get(index);  } else {
          return trucksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder> 
           getTrucksOrBuilderList() {
        if (trucksBuilder_ != null) {
          return trucksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(trucks_);
        }
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder addTrucksBuilder() {
        return getTrucksFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.getDefaultInstance());
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder addTrucksBuilder(
          int index) {
        return getTrucksFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.getDefaultInstance());
      }
      /**
       * <code>repeated .TruckStatu trucks = 1;</code>
       *
       * <pre>
       *属性
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder> 
           getTrucksBuilderList() {
        return getTrucksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder> 
          getTrucksFieldBuilder() {
        if (trucksBuilder_ == null) {
          trucksBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatu.Builder, com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.TruckStatuOrBuilder>(
                  trucks_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          trucks_ = null;
        }
        return trucksBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:RespAllTruckStatu)
    }

    static {
      defaultInstance = new RespAllTruckStatu(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RespAllTruckStatu)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RespAllTruckStatu_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RespAllTruckStatu_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027RespAllTruckStatu.proto\032\020TruckStatu.pr" +
      "oto\"0\n\021RespAllTruckStatu\022\033\n\006trucks\030\001 \003(\013" +
      "2\013.TruckStatuB@\n&com.chuangyou.common.pr" +
      "otobuf.pb.truckB\026RespAllTruckStatuProto"
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
          com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.getDescriptor(),
        }, assigner);
    internal_static_RespAllTruckStatu_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RespAllTruckStatu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RespAllTruckStatu_descriptor,
        new java.lang.String[] { "Trucks", });
    com.chuangyou.common.protobuf.pb.truck.TruckStatuProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}