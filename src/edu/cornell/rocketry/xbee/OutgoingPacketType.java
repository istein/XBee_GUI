package edu.cornell.rocketry.xbee;

/**
 * An enumeration of the types of outgoing packets
 *
 * TEST - Packet to test receiving on the remote end
 */
public enum OutgoingPacketType {
	TEST, BEGIN_LAUNCH, PAYLOAD_ABORT, PAYLOAD_ABORT_CANCEL
}
