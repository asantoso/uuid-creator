package com.github.f4b6a3.uuid.util;

public class NodeIdentifierUtil {

	
	/**
	 * Sets the the multicast bit ON to indicate that it's NOT a real MAC
	 * address.
	 * 
	 * @param nodeIdentifier a node identifier
	 * @return a multicast node identifier
	 */
	public static long setMulticastNodeIdentifier(long nodeIdentifier) {
		return nodeIdentifier | 0x0000010000000000L;
	}

	/**
	 * Sets the the multicast bit OFF to indicat that it's a MAC address.
	 * 
	 * @param nodeIdentifier a node identifier
	 * @return a unicast node identifier
	 */
	public static long setUnicastNodeIdentifier(long nodeIdentifier) {
		return nodeIdentifier & 0xFFFFFEFFFFFFFFFFL;
	}
}
