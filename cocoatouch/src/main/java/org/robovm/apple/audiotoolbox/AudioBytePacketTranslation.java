/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.audiotoolbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.audiounit.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioBytePacketTranslation/*</name>*/ 
    extends /*<extends>*/Struct<AudioBytePacketTranslation>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioBytePacketTranslationPtr extends Ptr<AudioBytePacketTranslation, AudioBytePacketTranslationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioBytePacketTranslation() {}
    public AudioBytePacketTranslation(long translationByte, long packet, int byteOffsetInPacket, AudioBytePacketTranslationFlags flags) {
        this.setTranslationByte(translationByte);
        this.setPacket(packet);
        this.setByteOffsetInPacket(byteOffsetInPacket);
        this.setFlags(flags);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getTranslationByte();
    @StructMember(0) public native AudioBytePacketTranslation setTranslationByte(long translationByte);
    @StructMember(1) public native long getPacket();
    @StructMember(1) public native AudioBytePacketTranslation setPacket(long packet);
    @StructMember(2) public native int getByteOffsetInPacket();
    @StructMember(2) public native AudioBytePacketTranslation setByteOffsetInPacket(int byteOffsetInPacket);
    @StructMember(3) public native AudioBytePacketTranslationFlags getFlags();
    @StructMember(3) public native AudioBytePacketTranslation setFlags(AudioBytePacketTranslationFlags flags);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
